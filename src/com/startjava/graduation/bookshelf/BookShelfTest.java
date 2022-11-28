package com.startjava.graduation.bookshelf;

import java.time.Year;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BookShelfTest {
    static BookShelf myShelf = new BookShelf();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuItem = 0;
        while (menuItem != 5) {
            showBooks(myShelf.getBooks());
            showMenu();
            menuItem = chooseMenuItem(input);
            input.nextLine(); //получение Enter
            switch (menuItem) {
                case 1 -> addBook(input);
                case 2 -> deleteBook(input);
                case 3 -> findBook(input);
                case 4 -> myShelf.clearShelf();
                default -> System.out.println("Выход из программы");
            }
        }
    }

    private static void showBooks(Book[] books) {
        if (books != null) {
            for (Book book : books) {
                printBook(book.toString());
            }
        }
    }

    private static void printBook(String info) {
        String text = info + " ".repeat(myShelf.getMaxLen() - info.length());
        String underscore = "_".repeat(myShelf.getMaxLen());
        text = """
                |%s|
                |%s|""".formatted(text, underscore);
        System.out.println(text);
    }

    private static void showMenu() {
        System.out.println("В шкафу " + myShelf.getQuantityOfBooks() + " книг и свободно " +
                myShelf.calculateFreeSpace() + " полок");
        System.out.println("Выберите действие:");
        System.out.println("1. Добавить книгу");
        System.out.println("2. Удалить книгу");
        System.out.println("3. Найти книгу");
        System.out.println("4. Очистить шкаф");
        System.out.println("5. Завершить работу");
    }

    private static int chooseMenuItem(Scanner input) {
        try {
            return input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введите число от 1 до 5");
            return chooseMenuItem(input);
        }
    }

    private static void addBook(Scanner input) {
        if (myShelf.calculateFreeSpace() == 0) {
            System.out.println("Книжный шкаф заполнен полностью. Удалите книгу, либо очистите шкаф");
        }
        System.out.print("Введите название книги: ");
        String name = input.nextLine();
        System.out.print("Введите автора книги: ");
        String author = input.nextLine();
        System.out.print("Введите год издания: ");
        Year year = inputYear(input);
        myShelf.add(new Book(name, author, year));
    }

    private static Year inputYear(Scanner input) {
        String info = input.nextLine();
        Year year = null;
        try {
            year = Year.parse(info);
        } catch (DateTimeParseException ignored) {
        }
        if (year == null || year.isAfter(Year.now())) {
            System.out.println("Введён неправильный год издания. Введите корректный год.");
            return inputYear(input);
        }
        return year;
    }

    private static void deleteBook(Scanner input) {
        System.out.println("Укажите название книги для удаления:");
        myShelf.delete(input.nextLine());
    }

    private static void findBook(Scanner input) {
        System.out.println("Укажите название книги для поиска:");
        Book foundBook = myShelf.findBook(input.nextLine());
        if (foundBook != null) {
            printBook(foundBook.toString());
        } else {
            System.out.println("Книга не найдена.");
        }
        input.nextLine();
    }
}