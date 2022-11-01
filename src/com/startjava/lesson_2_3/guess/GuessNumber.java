package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {
    private int guessNumber;
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber() {
        System.out.print("Первый игрок, представьтесь, пожалуйста: ");
        Scanner input = new Scanner(System.in, "cp866");
        playerOne = new Player(input.nextLine());
        System.out.print("Второй игрок, представьтесь, пожалуйста: ");
        playerTwo = new Player(input.nextLine());
    }

    public void play() {
        guessNumber = 1 + (int) (Math.random() * 100);
        System.out.println("Число загадано, начинаем игру");
        while(true) {
            System.out.print(playerOne.getName() + ", введите ваше число: ");
            Scanner input = new Scanner(System.in);
            if (isGuessed(playerOne.getName(), input.nextInt())) {
                break;
            }
            System.out.print(playerTwo.getName() + ", введите ваше число: ");
            if (isGuessed(playerTwo.getName(), input.nextInt())) {
                break;
            }
        }
    }

    public boolean isEqual(int number) {
        if (number == guessNumber) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isBigger(int number) {
        if (number > guessNumber) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isSmaller(int number) {
        if (number < guessNumber) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isGuessed(String name, int number) {
        if (isEqual(number)) {
            System.out.println(name + ", вы угадали!");
            return true;
        } else if (isBigger(number)) {
            System.out.println(name + ", ваше число больше задуманного");
            return false;
        } else if (isSmaller(number)) {
            System.out.println(name + ", ваше число меньше задуманного");
            return false;
        } else {
            return false;
        }
    }
}