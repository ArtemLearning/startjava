package com.startjava.graduation.bookshelf;

public class BookShelf {

    int maxBooks = 10;
    Book[] books = new Book[maxBooks];
    private int quantityOfBooks = 0;

    private int maxLength;

    public void showBooks() {
        if (quantityOfBooks == 0) {
            System.out.println("Книжный шкаф пуст");
        } else {
            for (int i = 0; i < quantityOfBooks; i++) {
                showBook(books[i]);
            }
        }
    }

    public void addBook() {
        books[quantityOfBooks] = new Book();
        books[quantityOfBooks].setInformationLength(printSingleString(books[quantityOfBooks].toString()));
        if (maxLength < books[quantityOfBooks].getInformationLength()) {
            maxLength = books[quantityOfBooks].getInformationLength();
        }
        quantityOfBooks++;
    }

    public void deleteBook(int bookNumber) {
        System.arraycopy(books, bookNumber + 1, books, bookNumber, quantityOfBooks - bookNumber);
        quantityOfBooks--;
        getMaximumLength(books);
    }

    public void clearShelf() {
        books = null;
        quantityOfBooks = 0;
        maxLength = 0;
    }

    private void showBook(Book bookToShow) {
        System.out.println(printSingleString(bookToShow.toString()));
        System.out.println(printUnderscores());
    }

    private String printSingleString(String str) {
        str = "|" + str;
        for (int i = str.length(); i < (maxLength - 1); i++) {
            str = str + " ";
        }
        return str + "|";
    }

    private String printUnderscores() {
        String str = "|";
        for (int i = 1; i < (maxLength - 1); i++) {
            str = str + "_";
        }
        return str + "|";
    }

    private void getMaximumLength(Book[] books) {
        maxLength = 0;
        for (int i = 0; i < quantityOfBooks; i++) {
            if (books[i].getInformationLength() > maxLength) {
                maxLength = books[i].getInformationLength();
            }
        }
    }
}
