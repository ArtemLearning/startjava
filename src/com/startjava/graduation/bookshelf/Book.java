package com.startjava.graduation.bookshelf;

import java.time.Year;

public class Book {
    private final String author;
    private final String name;
    private final Year publishYear;
    private final int informationLength;

    public Book(String name, String author, Year year) {
        this.name = name;
        this.author = author;
        this.publishYear = year;
        informationLength = toString().length();
    }

    public int getInformationLength() {
        return informationLength;
    }

    @Override
    public String toString() {
        return author + ", " + name + ", " + publishYear;
    }
}