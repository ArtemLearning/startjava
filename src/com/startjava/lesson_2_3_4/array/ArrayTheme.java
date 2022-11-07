package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intNumbers1 = {4, 6, 3, 1, 2, 7, 5};
        System.out.println("Исходный массив:");
        printIntArray(intNumbers1);
        for (int i = 0; i < intNumbers1.length; i++) {
            int j = intNumbers1.length - (i + 1);
            if (i == j) {
                break;
            }
            int swap = intNumbers1[i];
            intNumbers1[i] = intNumbers1[j];
            intNumbers1[j] = swap;
        }
        System.out.println("Изменённый массив:");
        printIntArray(intNumbers1);
        System.out.println();

        System.out.println("2. Вывод произведения элементов массива");
        int arrayLength = 10;
        int[] intNumbers2 = new int[arrayLength];
        int multiDigits = 1;
        for (int i = 0; i < 10; i++) {
            intNumbers2[i] = i;
            multiDigits = (i != 0) ? (i != 9) ? (multiDigits * intNumbers2[i]) : (multiDigits) : (multiDigits);
        }
        for (int i = 1; i < intNumbers2.length - 1; i ++) {
            if (i == intNumbers2.length - 2) {
                System.out.print(intNumbers2[i]);
            } else {
                System.out.print(intNumbers2[i] + " * ");
            }
        }
        System.out.println(" = " + multiDigits);
        System.out.println(intNumbers2[0] + " " + intNumbers2[9]);
        System.out.println();

        System.out.println("3. Удаление элементов массива");
        arrayLength = 15;
        double[] doubleNumbers = new double[arrayLength];
        for (int i = 0; i < doubleNumbers.length; i++) {
            doubleNumbers[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        printDoubleArray(doubleNumbers);
        double middleNumber = doubleNumbers[doubleNumbers.length / 2];
        int nullCounter = 0;
        for (int i = 0; i < doubleNumbers.length; i++) {
            if (doubleNumbers[i] < middleNumber) {
                doubleNumbers[i] = 0;
                nullCounter++;
            }
        }
        System.out.print("\nЗначение в средней ячейке массива = ");
        System.out.printf("%.3f", middleNumber);
        System.out.println("\nИзменённый массив:");
        printDoubleArray(doubleNumbers);
        System.out.println("\nЧисло нулей = " + nullCounter);
        System.out.println();

        System.out.println("4. Вывод элементов массива лесенкой в обратном порядке");
        int charAmount = 'Z' - 'A' + 1;
        char[] engAlphabet = new char[charAmount];
        for(int i = 0; i < charAmount; i++) {
            engAlphabet[i] = (char) ('A' + i);
        }
        String reverseAlphabet = "";
        for (int i = charAmount - 1; i >= 0; i--) {
            reverseAlphabet = reverseAlphabet + engAlphabet[i];
            System.out.println(reverseAlphabet);
        }

        System.out.println("5. Генерация уникальных чисел");
        int[] uniqueNumbers = new int[30];
        for (int i = 0; i < uniqueNumbers.length; i++) {
            int randomNumber;
            do {
                randomNumber = (int) (60 + Math.random()*40);
            }
            while (isExist(randomNumber, uniqueNumbers));
            uniqueNumbers[i] = randomNumber;
        }
        System.out.println("Массив уникальных чисел:");
        for (int i = 0; i < uniqueNumbers.length / 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(uniqueNumbers[i * 10 + j] + " ");
            }
            System.out.println();
        }
        int[] uniqueSortNumbers = doSort(uniqueNumbers);
        System.out.println("Сортированный массив уникальных чисел:");
        for (int i = 0; i < uniqueSortNumbers.length / 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(uniqueSortNumbers[i * 10 + j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nЗадание со *");
        String[] initialStringArray =  {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int size = 0;
        for (String s : initialStringArray) {
            if (!s.isBlank()) {
                size += 1;
            }
        }
        String[] copyStringArray = new String[size];
        int j = 0;
        for (int i = 0; i < initialStringArray.length; i++) {
            if (!initialStringArray[i].isBlank()) {
                int k = getAmountOfFilledPositions(initialStringArray, i);
                System.arraycopy(initialStringArray, i, copyStringArray, j, k);
                j += k;
                i += k;
            }
        }
        printStringArray(copyStringArray);

    }
    private static void printIntArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static void printStringArray(String[] array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
    }
    private static void printDoubleArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.3f ", array[i]);
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
    private static int[] doSort(int[] arrayToSort) {
        int temp;
        for (int i = arrayToSort.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = temp;
                }
            }
        }
        return arrayToSort;
    }

    private static int getAmountOfFilledPositions(String[] stringArray, int index) {
        int result = 0;
        for (int i = index; i < stringArray.length; i++) {
            if (stringArray[i].isBlank()) {
                break;
            } else {
                result += 1;
            }
        }
        return result;
    }
}
