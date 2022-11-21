package com.startjava.graduation.bookshelf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookShelfTest {
    static BookShelf myShelf = new BookShelf();

    public static void main(String[] args) {
        int menuItem = 0;
        while (menuItem != 4) {
            myShelf.showBooks();
            showMenu();
            menuItem = getAction();
            switch (menuItem) {
                case 1 -> myShelf.add();
                case 2 -> myShelf.delete(getBookNumberToDelete() - 1);
                case 3 -> myShelf.clearShelf();
                default -> System.out.println("Выход из программы");
            }
        }
    }

    private static void showMenu() {
        System.out.println("Выберите действие:");
        System.out.println("1. Добавить книгу");
        System.out.println("2. Удалить книгу");
        System.out.println("3. Очистить шкаф");
        System.out.println("4. Завершить работу");
    }

    private static int getAction() {
        Scanner input = new Scanner(System.in);
        try {
            return input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введите число от 1 до 4");
            return getAction();
        }
    }

    private static int getBookNumberToDelete() {
        System.out.println("Укажите номер книги для удаления:");
        return getAction();
    }
}
