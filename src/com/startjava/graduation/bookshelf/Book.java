package com.startjava.graduation.bookshelf;

import java.time.Year;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Book {
    private final String author;
    private final String name;
    private Year publishYear;
    private int informationLength;

    public Book() {
        System.out.print("Введите название книги: ");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.print("Введите автора книги: ");
        author = input.nextLine();
        System.out.print("Введите год издания: ");
        setPublishYear(input.nextLine());
    }

    public int getInformationLength() {
        return informationLength;
    }

    public void setInformationLength(String description) {
        informationLength = description.length();
    }

    public void setPublishYear(String year) {
        try {
            publishYear = Year.parse(year);
        } catch (DateTimeParseException e) {
            getValidYear();
        }
        if (publishYear.isAfter(Year.now())) {
            getValidYear();
        }
    }

    public String toString() {
        return author + ", " + name + ", " + publishYear;
    }

    private void getValidYear() {
        System.out.println("Введён неправильный год издания. Введите корректный год.");
        Scanner input = new Scanner(System.in);
        setPublishYear(input.nextLine());
    }
}
