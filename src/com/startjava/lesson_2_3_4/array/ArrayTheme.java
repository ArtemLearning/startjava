package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intNumbers1 = {4, 6, 3, 1, 2, 7, 5};
        int length = 7;
        System.out.println("Исходный массив:");
        printIntArray(intNumbers1);
        for (int i = 0; i <  length; i++) {
            length--;
            int swap = intNumbers1[i];
            intNumbers1[i] = intNumbers1[length];
            intNumbers1[length] = swap;
        }
        System.out.println("Изменённый массив:");
        printIntArray(intNumbers1);

        System.out.println("\n2. Вывод произведения элементов массива");
        length = 10;
        int[] intNumbers2 = new int[length];
        int multDigits = 1;
        for (int i = 0; i < length; i++) {
            intNumbers2[i] = i;
        }
        for (int i = 1; i < length - 1; i++) {
            multDigits = multDigits * intNumbers2[i];
            if (i == length - 2) {
                System.out.print(intNumbers2[i]);
            } else {
                System.out.print(intNumbers2[i] + " * ");
            }
        }
        System.out.println(" = " + multDigits);
        System.out.println(intNumbers2[0] + " " + intNumbers2[9]);

        System.out.println("\n3. Удаление элементов массива");
        length = 15;
        double[] doubleNumbers = new double[length];
        for (int i = 0; i < length; i++) {
            doubleNumbers[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        printDoubleArray(doubleNumbers);
        double middleNumber = doubleNumbers[length / 2];
        int nullCounter = 0;
        for (int i = 0; i < length; i++) {
            if (doubleNumbers[i] < middleNumber) {
                doubleNumbers[i] = 0;
                nullCounter++;
            }
        }
        System.out.printf("\nЗначение в средней ячейке массива = %.3f", middleNumber);
        System.out.println("\nИзменённый массив:");
        printDoubleArray(doubleNumbers);
        System.out.println("\nЧисло нулей = " + nullCounter);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        int charAmount = 'Z' - 'A' + 1;
        char[] engAlphabet = new char[charAmount];
        for (int i = 0; i < charAmount; i++) {
            engAlphabet[i] = (char) ('A' + i);
        }
        for (int i = charAmount - 1; i >= 0; i--) {
            for (int j = 1; j <= charAmount - i; j++) {
                System.out.print(engAlphabet[charAmount - j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        length = 30;
        int[] uniqueNumbers = new int[length];
        for (int i = 0; i < length; i++) {
            int randomNumber;
            do {
                randomNumber = (int) (60 + Math.random() * 40);
            } while (isExist(randomNumber, uniqueNumbers));
            uniqueNumbers[i] = randomNumber;
        }
        sort(uniqueNumbers);
        System.out.println("Сортированный массив уникальных чисел:");
        for (int i = 0; i < length / 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(uniqueNumbers[i * 10 + j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n6. Сдвиг элементов массива");
        length = 11;
        String[] srcStrings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int size = 0;
        for (String s : srcStrings) {
            if (!s.isBlank()) {
                size++;
            }
        }
        System.out.println("Исходный массив строк");
        printStringArray(srcStrings);
        System.out.println();
        String[] destStrings = new String[size];
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (!srcStrings[i].isBlank()) {
                int k = getAmountOfFilledPositions(srcStrings, i);
                System.arraycopy(srcStrings, i, destStrings, j, k);
                j += k;
                i += k;
            }
        }
        System.out.println("Массив со сдвинутыми строками");
        printStringArray(destStrings);
    }

    private static void printIntArray(int[] numbers) {
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] strings) {
        for (String s : strings) {
            System.out.print(s + " ");
        }
    }

    private static void printDoubleArray(double[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%.3f ", numbers[i]);
            if (i == 7) {
                System.out.println();
            }
        }
    }

    private static boolean isExist(int number, int[] numbers) {
        boolean result = false;
        for (int j : numbers) {
            if (j == number) {
                result = true;
                break;
            }
        }
        return result;
    }

    private static int[] sort(int[] numbersToSort) {
        int temp;
        for (int i = numbersToSort.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbersToSort[j] > numbersToSort[j + 1]) {
                    temp = numbersToSort[j];
                    numbersToSort[j] = numbersToSort[j + 1];
                    numbersToSort[j + 1] = temp;
                }
            }
        }
        return numbersToSort;
    }

    private static int getAmountOfFilledPositions(String[] strings, int index) {
        int result = 0;
        for (int i = index; i < strings.length; i++) {
            if (strings[i].isBlank()) {
                break;
            } else {
                result += 1;
            }
        }
        return result;
    }
}