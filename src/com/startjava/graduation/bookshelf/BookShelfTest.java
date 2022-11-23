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
            menuItem = getAction();
            switch (menuItem) {
                case 1 -> myShelf.add(addBook());
                case 2 -> myShelf.delete(getBookNumberToDelete() - 1);
                case 3 -> myShelf.clearShelf();
                default -> System.out.println("Выход из программы");
            }
        }
    }

    private static void showBooks(Book[] books) {
        if (books != null) {
            for (Book book : books) {
                show(book);
            }
        }
    }

    private static void show(Book bookToShow) {
        System.out.println(printSingleString(bookToShow.toString()));
        System.out.println(printUnderscores());
    }

    private static String printSingleString(String str) {
        str = "|" + str;
        for (int i = str.length(); i <= myShelf.getMaxLength(); i++) {
            str = str + " ";
        }
        return str + "|";
    }

    private static String printUnderscores() {
        String str = "|";
        for (int i = 1; i <= myShelf.getMaxLength(); i++) {
            str = str + "_";
        }
        return str + "|";
    }

    private static void showMenu() {
        System.out.println("В шкафу " + myShelf.getQuantityOfBooks() + " книг и свободно " +
                myShelf.getFreeSpace() + " полок");
        System.out.println("Выберите действие:");
        System.out.println("1. Добавить книгу");
        System.out.println("2. Удалить книгу");
        System.out.println("3. Очистить шкаф");
        System.out.println("4. Завершить работу");
    }

    private static int getAction() {
        Scanner input = new Scanner(System.in);
        try {
            return input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введите число от 1 до 4");
            return getAction();
        }
    }

    private static Book addBook() {
        System.out.print("Введите название книги: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Введите автора книги: ");
        String author = input.nextLine();
        System.out.print("Введите год издания: ");
        Year year = setPublishYear(input.nextLine());
        return new Book(name, author, year);
    }

    private static Year setPublishYear(String year) {
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
        return setPublishYear(input.nextLine());
    }

    private static int getBookNumberToDelete() {
        System.out.println("Укажите номер книги для удаления:");
        return getAction();
    }
}