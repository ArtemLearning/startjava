package com.startjava.graduation.bookshelf;

public class BookShelf {

    private static final int MAX_SPACE = 10;
    Book[] books = new Book[MAX_SPACE];
    private int quantityOfBooks = 0;
    private int maxLength;

    public void showBooks() {
        if (quantityOfBooks > 0) {
            for (int i = 0; i < quantityOfBooks; i++) {
                show(books[i]);
            }
        }
    }

    private void show(Book bookToShow) {
        System.out.println(printSingleString(bookToShow.toString()));
        System.out.println(printUnderscores());
    }

    private String printSingleString(String str) {
        str = "|" + str;
        for (int i = str.length(); i <= maxLength; i++) {
            str = str + " ";
        }
        return str + "|";
    }

    private String printUnderscores() {
        String str = "|";
        for (int i = 1; i <= maxLength; i++) {
            str = str + "_";
        }
        return str + "|";
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
        getMaximumLength(books);
    }

    private void getMaximumLength(Book[] books) {
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

}