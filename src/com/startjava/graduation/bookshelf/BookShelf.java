package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

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
        if (bookToAdd != null) {
            books[quantityOfBooks] = bookToAdd;
            if (maxLength < books[quantityOfBooks].getInformationLength()) {
                maxLength = books[quantityOfBooks].getInformationLength();
            }
            quantityOfBooks++;
        }
    }

    public void delete(int bookNumber) {
        Book[] changeBooks = new Book[books.length - 1];
        System.arraycopy(books, 0, changeBooks, 0, bookNumber);
        int fromIndex = books.length - (bookNumber + 1);
        System.arraycopy(books, bookNumber + 1, changeBooks, bookNumber, fromIndex);
        System.arraycopy(changeBooks, 0, books, 0, changeBooks.length);
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
        books = new Book[MAX_SPACE];
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