package com.startjava.graduation.bookshelf;

import java.time.Year;

public class Book {
    private final String author;
    private final String name;
    private final Year publishYear;
    private final int infoLen;

    public Book(String name, String author, Year year) {
        this.name = name;
        this.author = author;
        this.publishYear = year;
        infoLen = toString().length();
    }

    public int getInfoLen() {
        return infoLen;
    }

    @Override
    public String toString() {
        return author + ", " + name + ", " + publishYear;
    }
}