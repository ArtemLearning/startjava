package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class BookShelf {

    private static final int MAX_SPACE = 10;
    private final Book[] books = new Book[MAX_SPACE];
    private int quantityOfBooks;
    private int maxLen;

    public Book[] getBooks() {
        return Arrays.copyOf(books, quantityOfBooks);
    }

    public void add(Book book) {
        if (book != null) {
            books[quantityOfBooks] = book;
            if (maxLen < books[quantityOfBooks].getInfoLen()) {
                maxLen = books[quantityOfBooks].getInfoLen();
            }
            quantityOfBooks++;
        }
    }

    public void delete(String name) {
        Book book = findBook(name);
        if (book != null) {
            int bookLen = book.getInfoLen();
            int position = getPosition(book);
            System.arraycopy(books, position + 1, books, position, quantityOfBooks - (position + 1));
            quantityOfBooks--;
            if (maxLen == bookLen) {
                calculateMaxLen();
            }
        } else {
            System.out.println("Нет книги с таким именем");
        }
    }

    public Book findBook(String name) {
        for (int i = 0; i < quantityOfBooks; i++) {
            if (books[i].getName().equals(name)) {
                return books[i];
            }
        }
        return null;
    }

    private int getPosition(Book book) {
        for (int i=0; i < books.length; i++) {
            if (books[i] == book) {
                return i;
            }
        }
        return -1;
    }

    private void calculateMaxLen() {
        maxLen = 0;
        for (int i = 0; i < quantityOfBooks; i++) {
            if (maxLen < books[i].getInfoLen()) {
                maxLen = books[i].getInfoLen();
            }
        }
    }

    public void clearShelf() {
        Arrays.fill(books, 0, quantityOfBooks, null);
        quantityOfBooks = 0;
        maxLen = 0;
    }

    public int getQuantityOfBooks() {
        return quantityOfBooks;
    }

    public int calculateFreeSpace() {
        return MAX_SPACE - getQuantityOfBooks();
    }

    public int getMaxLen() {
        return maxLen;
    }
}