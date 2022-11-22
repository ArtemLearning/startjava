package com.startjava.graduation.bookshelf;

import java.time.Year;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BookShelf {

    private static final int MAX_SPACE = 10;
    Book[] books = new Book[MAX_SPACE];
    private int quantityOfBooks = 0;
    private int maxLength;

    public int performAction() {
        showBooks();
        showMenu();
        int choice = getAction();
        switch (choice) {
            case 1 -> add();
            case 2 -> delete(getBookNumberToDelete() - 1);
            case 3 -> clearShelf();
            default -> System.out.println("Выход из программы");
        }
        return choice;
    }

    private void showBooks() {
        if (quantityOfBooks == 0) {
            System.out.println("Книжный шкаф пуст");
        } else {
            for (int i = 0; i < quantityOfBooks; i++) {
                show(books[i]);
            }
        }
    }

    private void show(Book bookToShow) {
        System.out.println(printSingleString(bookToShow.toString()));
        System.out.println(printUnderscores());
    }

    private String printSingleString(String str) {
        str = "|" + str;
        for (int i = str.length(); i < (maxLength - 1); i++) {
            str = str + " ";
        }
        return str + "|";
    }

    private String printUnderscores() {
        String str = "|";
        for (int i = 1; i < (maxLength - 1); i++) {
            str = str + "_";
        }
        return str + "|";
    }

    private void showMenu() {
        System.out.println("Выберите действие:");
        System.out.println("1. Добавить книгу");
        System.out.println("2. Удалить книгу");
        System.out.println("3. Очистить шкаф");
        System.out.println("4. Завершить работу");
    }

    private int getAction() {
        System.out.println("Введите число от 1 до 4");
        Scanner input = new Scanner(System.in);
        try {
            int result = input.nextInt();
            if (result <= 0 || result > 4) {
                return getAction();
            }
            return result;
        } catch (InputMismatchException e) {
            return getAction();
        }
    }

    private void add() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите название книги: ");
        String name = input.nextLine();
        System.out.print("Введите автора книги: ");
        String author = input.nextLine();
        System.out.print("Введите год издания: ");
        Year year = setPublishYear(input.nextLine());
        books[quantityOfBooks] = new Book(name, author, year);
        books[quantityOfBooks].setInformationLength(printSingleString(books[quantityOfBooks].toString()));
        if (maxLength < books[quantityOfBooks].getInformationLength()) {
            maxLength = books[quantityOfBooks].getInformationLength();
        }
        quantityOfBooks++;
    }

    private Year setPublishYear(String year) {
        Year validYear;
        try {
            validYear = Year.parse(year);
            if (validYear.isAfter(Year.now())) {
                validYear = setPublishYear(getValidYear());
            }
        } catch (DateTimeParseException e) {
            validYear = setPublishYear(getValidYear());
        }
        return validYear;
    }

    private String getValidYear() {
        System.out.println("Введён неправильный год издания. Введите корректный год.");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private void delete(int bookNumber) {
        System.arraycopy(books, bookNumber + 1, books, bookNumber, quantityOfBooks - bookNumber);
        quantityOfBooks--;
        getMaximumLength(books);
    }

    private void getMaximumLength(Book[] books) {
        maxLength = 0;
        for (int i = 0; i < quantityOfBooks; i++) {
            if (books[i].getInformationLength() > maxLength) {
                maxLength = books[i].getInformationLength();
            }
        }
    }

    private void clearShelf() {
        books = null;
        quantityOfBooks = 0;
        maxLength = 0;
    }

    private int getBookNumberToDelete() {
        System.out.println("Укажите номер книги для удаления:");
        return getAction();
    }
}
