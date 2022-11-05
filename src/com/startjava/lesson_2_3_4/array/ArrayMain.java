package com.startjava.lesson_2_3_4.array;

public class ArrayMain {

    public static void main(String[] args) {

        int[] numbers = new int[6];
        float[] numbers1 = {4.3f, .3f, 200f};

        System.out.println(numbers.length);
        System.out.println(numbers1.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}