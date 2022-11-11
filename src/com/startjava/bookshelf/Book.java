package com.startjava.bookshelf;

import java.time.Year;
import java.util.Scanner;

public class Book {
    private final int bookNumber;
    private final String author;
    private final String name;
    private final Year publishYear;
    private final int informationLength;

    public Book(int numberOnShelf) {
        System.out.print("Введите название книги: ");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.print("Введите автора книги: ");
        author = input.nextLine();
        System.out.print("Введите год издания: ");
        publishYear = Year.of(input.nextInt());
        String description = "|" + author + ", " + name + ", " + publishYear + "|";
        informationLength = description.length();
        bookNumber = numberOnShelf;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public Year getPublishYear() {
        return publishYear;
    }

    public int getInformationLength() {
        return informationLength;
    }

    public void showBook() {
        System.out.println(printSingleString(getAuthor() + ", " + getName() + ", " + getPublishYear()));
        System.out.println(printUnderscores());
    }

    private String printSingleString(String str) {
        str = "|" + str;
        for (int i = str.length(); i < (informationLength - 1); i++) {
            str = str + " ";
        }
        return str + "|";
    }

    private String printUnderscores() {
        String str = "|";
        for (int i = 1; i < (informationLength - 1); i++) {
            str = str + "_";
        }
        return str + "|";
    }
}
