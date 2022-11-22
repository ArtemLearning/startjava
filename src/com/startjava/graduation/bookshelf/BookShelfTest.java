package com.startjava.graduation.bookshelf;

public class BookShelfTest {
    static BookShelf myShelf = new BookShelf();

    public static void main(String[] args) {
        int menuItem = 0;
        while (menuItem != 4) {
            menuItem = myShelf.performAction();
        }
    }
}
