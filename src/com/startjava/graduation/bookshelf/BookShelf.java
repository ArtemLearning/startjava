package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class BookShelf {

    private static final int MAX_SPACE = 10;
    Book[] books = new Book[MAX_SPACE];
    private int quantityOfBooks = 0;
    private int maxLength;

    public Book[] getBooks() {
        if (books != null) {
            return Arrays.copyOf(books, quantityOfBooks);
        }
        return null;
    }

    public void add(Book bookToAdd) {
        books[quantityOfBooks] = bookToAdd;
        if (maxLength < books[quantityOfBooks].getInformationLength()) {
            maxLength = books[quantityOfBooks].getInformationLength();
        }
        quantityOfBooks++;
    }

    public void delete(int bookNumber) {
        System.arraycopy(books, bookNumber + 1, books, bookNumber, quantityOfBooks - bookNumber);
        quantityOfBooks--;
        setMaximumLength(books);
    }

    private void setMaximumLength(Book[] books) {
        maxLength = 0;
        for (int i = 0; i < quantityOfBooks; i++) {
            if (books[i].getInformationLength() > maxLength) {
                maxLength = books[i].getInformationLength();
            }
        }
    }

    public void clearShelf() {
        books = null;
        quantityOfBooks = 0;
        maxLength = 0;
    }

    public int getQuantityOfBooks() {
        return quantityOfBooks;
    }

    public int getFreeSpace() {
        return MAX_SPACE - getQuantityOfBooks();
    }

    public int getMaxLength() {
        return maxLength;
    }

}