package com.startjava.bookshelf;

public class BookShelf {

    int maxBooks = 10;
    Book[] books = new Book[maxBooks];
    private int quantityOfBooks = 0;

    private int length;

    public void showBooks() {
        if (quantityOfBooks == 0) {
            System.out.println("Книжный шкаф пуст");
        } else {
            for (int i = 0; i < quantityOfBooks; i++) {
                books[i].showBook();
            }
        }
    }

    public void addBook() {
        books[quantityOfBooks] = new Book(quantityOfBooks);
        if (length < books[quantityOfBooks].getInformationLength()) {
            length = books[quantityOfBooks].getInformationLength();
        }
        quantityOfBooks++;
    }

    public void deleteBook(int bookNumber) {
        System.arraycopy(books, bookNumber + 1, books, bookNumber, quantityOfBooks - bookNumber);
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
        return quantityOfBooks;
    }

    public int getFreePlace() {
        return maxBooks - quantityOfBooks;
    }
    public void clearShelf() {
        books = null;
        quantityOfBooks = 0;
        length = 0;
    }

    public Book getBookByNumber(int number) {
        return books[number - 1];
    }
}
