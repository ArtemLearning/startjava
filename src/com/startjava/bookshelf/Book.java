package com.startjava.bookshelf;

import java.time.Year;
import java.util.Scanner;

public class Book {
    private int bookNumber;
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
        String description = author + name + publishYear;
        informationLength = description.length();
        bookNumber = numberOnShelf;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getBookNumber() {
        return bookNumber;
    }

}
