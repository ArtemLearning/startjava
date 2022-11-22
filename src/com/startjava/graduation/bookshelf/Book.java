package com.startjava.graduation.bookshelf;

import java.time.Year;

public class Book {
    private final String name;
    private final String author;
    private final Year publishYear;
    private int informationLength;

    public Book(String name, String author, Year year) {
        this.name = name;
        this.author = author;
        publishYear = year;
    }

    public String toString() {
        return author + ", " + name + ", " + publishYear;
    }

    public int getInformationLength() {
        return informationLength;
    }

    public void setInformationLength(String description) {
        informationLength = description.length();
    }

}
