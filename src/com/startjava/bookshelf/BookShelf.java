package com.startjava.bookshelf;

import java.util.ArrayList;

public class BookShelf {

    ArrayList<Book> books = new ArrayList<>();
    private int quantityOfBooks = 1;

    public BookShelf() {
    }

    public void addBook() {
        Book newBook = new Book(quantityOfBooks);
        books.add(newBook);
        quantityOfBooks++;
    }

    public void deleteBook(Book bookToDelete) {
        books.remove(bookToDelete.getBookNumber() - 1);
        quantityOfBooks--;
    }

    public Book findBookByName(String name) {
        for (Book book : books) {
            if ((book.getName().equals(name))) {
                return book;
            }
        }
        return books.get(0);
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }

    public int getBooksQuantity() {
        return books.size();
    }

    public int getFreePlace() {
        return 10 - books.size();
    }
    public void clearShelf() {
        books.clear();
    }

    public Book getBookByNumber(int number) {
        return books.get(number - 1);
    }
}
