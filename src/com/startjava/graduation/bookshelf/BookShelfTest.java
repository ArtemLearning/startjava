package com.startjava.graduation.bookshelf;

import java.time.Year;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BookShelfTest {
    static BookShelf myShelf = new BookShelf();

    public static void main(String[] args) {
        int menuItem = 0;
        while (menuItem != 4) {
            showBooks(myShelf.getBooks());
            showMenu();
            menuItem = chooseMenuItem();
            switch (menuItem) {
                case 1 -> addBook();
                case 2 -> deleteBook();
                case 3 -> myShelf.clearShelf();
                default -> System.out.println("Выход из программы");
            }
        }
    }

    private static void showBooks(Book[] books) {
        if (books != null) {
            for (Book book : books) {
                System.out.println(printSingleBook(book.toString()));
            }
        }
    }

    private static String printSingleBook(String str) {
        str = str + " ".repeat(myShelf.getMaxLength() - str.length());
        String underscore = "_".repeat(myShelf.getMaxLength());
        str = """
                |%s|
                |%s|""".formatted(str, underscore);
        return str;
    }

    private static void showMenu() {
        System.out.println("В шкафу " + myShelf.getQuantityOfBooks() + " книг и свободно " +
                myShelf.calculateFreeSpace() + " полок");
        System.out.println("Выберите действие:");
        System.out.println("1. Добавить книгу");
        System.out.println("2. Удалить книгу");
        System.out.println("3. Очистить шкаф");
        System.out.println("4. Завершить работу");
    }

    private static int chooseMenuItem() {
        Scanner input = new Scanner(System.in);
        try {
            return input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введите число от 1 до 4");
            return chooseMenuItem();
        }
    }

    private static void addBook() {
        if (myShelf.calculateFreeSpace() == 0) {
            System.out.println("Книжный шкаф заполнен полностью. Удалите книгу, либо очистите шкаф");
        }
        System.out.print("Введите название книги: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Введите автора книги: ");
        String author = input.nextLine();
        System.out.print("Введите год издания: ");
        Year year = inputYear(input.nextLine());
        myShelf.add(new Book(name, author, year));
    }

    private static Year inputYear(String year) {
        try {
            if (Year.parse(year).isAfter(Year.now())) {
                return getCorrectYear();
            }
            return Year.parse(year);
        } catch (DateTimeParseException e) {
            return getCorrectYear();
        }
    }

    private static Year getCorrectYear() {
        System.out.println("Введён неправильный год издания. Введите корректный год.");
        Scanner input = new Scanner(System.in);
        return inputYear(input.nextLine());
    }

    private static void deleteBook() {
        System.out.println("Укажите название книги для удаления:");
        Scanner input = new Scanner(System.in);
        myShelf.delete(input.nextLine());
    }
}