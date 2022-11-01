package com.startjava.lesson_1;

public class MyFirstGame {

    public static void main(String[] args) {
        int targetNumber = 34;
        int guessNumber = 5;

        while (guessNumber != targetNumber) {
            if (guessNumber < targetNumber) {
                System.out.println("Число " + guessNumber + " меньше задуманного");
                guessNumber += 5;
            } else if (guessNumber > targetNumber) {
                System.out.println("Число " + guessNumber + " больше задуманного");
                guessNumber--;
            }
        }
        System.out.println("Вы победили!");
    }
}