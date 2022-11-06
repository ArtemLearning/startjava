package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {

        System.out.println("1. Реверс значений массива");
        int[] numbers1 = { 4, 6, 3, 1, 2, 7, 5 };
        for (int i : numbers1) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < numbers1.length; i++) {
            int j = numbers1.length - (i + 1);
            if (i == j) {
                break;
            }
            int swap = numbers1[i];
            numbers1[i] = numbers1[j];
            numbers1[j] = swap;
        }
        System.out.println("");
        for (int i : numbers1) {
            System.out.print(i + " ");
        }

        System.out.println("\n2. Вывод произведения элементов массива");
        int[] numbers2 = new int[10];
        int multiplication = 1;
        for (int i = 0; i < 10; i++) {
            numbers2[i] = i;
            System.out.print(numbers2[i] + " ");
            multiplication = (i != 0) ? (i != 9) ? (multiplication * numbers2[i]) : (multiplication) : (multiplication);
        }
        System.out.println("\n1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 = " + multiplication);
        System.out.println(numbers2[0] + " " + numbers2[9]);

        System.out.println("3. Удаление элементов массива");
        double[] doubleNumbers = new double[15];

        for (int i = 0; i < doubleNumbers.length; i++) {
            doubleNumbers[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < doubleNumbers.length; i++) {
            System.out.printf("%.3f", doubleNumbers[i]);
            System.out.print(" ");
            if (i == 7) {
                System.out.println();
            }
        }
        double middleValue = doubleNumbers[doubleNumbers.length / 2];
        int nullCounter = 0;
        for (int i = 0; i < doubleNumbers.length; i++) {
            doubleNumbers[i] =  doubleNumbers[i] < middleValue ? 0 : doubleNumbers[i];
            if (doubleNumbers[i] == 0) {
                nullCounter += 1;
            }
        }
        System.out.print("\nЗначение в средней ячейке массива = ");
        System.out.printf("%.3f", middleValue);
        System.out.println("\nИзменённый массив:");
        for (int i = 0; i < doubleNumbers.length; i++) {
            System.out.printf("%.3f", doubleNumbers[i]);
            System.out.print(" ");
            if (i == 7) {
                System.out.println();
            }
        }
        System.out.println("\nЧисло нулей = " + nullCounter);
    }
}