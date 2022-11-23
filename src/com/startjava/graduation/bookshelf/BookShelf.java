package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class BookShelf {

    private static final int MAX_SPACE = 10;
    private Book[] books = new Book[MAX_SPACE];
    private int quantityOfBooks;
    private int maxLength;

    public Book[] getBooks() {
        if (books != null) {
            return Arrays.copyOf(books, quantityOfBooks);
        }
        return null;
    }

    public void add(Book book) {
        if (book != null) {
            books[quantityOfBooks] = book;
            if (maxLength < books[quantityOfBooks].getInfoLen()) {
                maxLength = books[quantityOfBooks].getInfoLen();
            }
            quantityOfBooks++;
        }
    }

    public void delete(int bookNumber) {
        int bookNumberLength = books[bookNumber].getInfoLen();
        System.arraycopy(books, bookNumber + 1, books, bookNumber, quantityOfBooks - (bookNumber + 1));
        quantityOfBooks--;
        if (maxLength == bookNumberLength) {
            calculateMaxLen();
        }
    }

    private void calculateMaxLen() {
        maxLength = 0;
        for (int i = 0; i < quantityOfBooks; i++) {
            if (maxLength < books[i].getInfoLen()) {
                maxLength = books[i].getInfoLen();
            }
        }
    }

    public void clearShelf() {
        Arrays.fill(books, 0, quantityOfBooks, null);
        quantityOfBooks = 0;
        maxLength = 0;
    }

    public int getQuantityOfBooks() {
        return quantityOfBooks;
    }

    public int calculateFreeSpace() {
        return MAX_SPACE - getQuantityOfBooks();
    }

    public int getMaxLength() {
        return maxLength;
    }

}