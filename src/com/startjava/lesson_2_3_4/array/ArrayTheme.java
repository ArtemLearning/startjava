package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {

        System.out.println("1. Реверс значений массива");
        int[] numbers = { 4, 6, 3, 1, 2, 7, 5 };
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < numbers.length; i++) {
            int j = numbers.length - (i + 1);
            if (i == j) {
                break;
            }
            int swap = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = swap;
        }
        System.out.println("");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}