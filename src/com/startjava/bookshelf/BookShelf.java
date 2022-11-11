package com.startjava.bookshelf;

import java.util.ArrayList;

public class BookShelf {

    int maxBooks = 10;
    Book[] books = new Book[maxBooks];
    private int quantityOfBooks = 0;

    public BookShelf() {
    }

    public void addBook() {
        books[quantityOfBooks] = new Book(quantityOfBooks + 1);
        quantityOfBooks++;
    }

    public void deleteBook(Book bookToDelete) {
        books[quantityOfBooks] = null;
        quantityOfBooks--;
    }

    public Book findBookByName(String name) {
        for (Book book : books) {
            if ((book.getName().equals(name))) {
                return book;
            }
        }
        return books[0];
    }

    public Book[] getAllBooks() {
        return books;
    }

    public int getBooksQuantity() {
        return books.length;
    }

    public int getFreePlace() {
        return 10 - quantityOfBooks;
    }
    public void clearShelf() {
        books.????????????????();
    }

    public Book getBookByNumber(int number) {
        return books[number - 1];
    }
}
