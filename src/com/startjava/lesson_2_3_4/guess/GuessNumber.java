package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private int guessNumber;
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber() {
        System.out.print("Первый игрок, представьтесь, пожалуйста: ");
        Scanner input = new Scanner(System.in);
        playerOne = new Player(input.nextLine());
        System.out.print("Второй игрок, представьтесь, пожалуйста: ");
        playerTwo = new Player(input.nextLine());
    }

    public void play() {
        guessNumber = 1 + (int) (Math.random() * 100);
        System.out.println("Число загадано, начинаем игру");
        System.out.println("У каждого игрока по 10 попыток");
        for (int i = 1; i <= 10; i++) {
            System.out.print(playerOne.getName() + ", введите ваше число: ");
            Scanner input = new Scanner(System.in);
            if (isGuessed(playerOne, input.nextInt(), i)) {
                showInfo(playerOne);
                break;
            }
            System.out.print(playerTwo.getName() + ", введите ваше число: ");
            if (isGuessed(playerTwo, input.nextInt(), i)) {
                showInfo(playerTwo);
                break;
            }
        }


    }

    public boolean isEqual(int number) {
        return number == guessNumber;
    }

    public boolean isBigger(int number) {
        return number > guessNumber;
    }

    public boolean isSmaller(int number) {
        return number < guessNumber;
    }

    public boolean isGuessed(Player player, int number, int attempt) {
        if (attempt == 1) {
            player.initializeNumbers();
        }
        player.setGuessNumbers(attempt, number);
        if (isEqual(number)) {
            System.out.println("Игрок " + player.getName() + " угадал число " + number + " c " + attempt + " попытки" );
            return true;
        } else if (isBigger(number)) {
            System.out.println("Игрок " + player.getName() + ", ваше число больше задуманного");
            endOfAttempts(player, attempt);
            return false;
        } else if (isSmaller(number)) {
            System.out.println("Игрок " + player.getName() + ", ваше число меньше задуманного");
            endOfAttempts(player, attempt);
            return false;
        } else {
            return false;
        }
    }
    private void endOfAttempts(Player player, int attempt) {
        if (attempt == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }

    private void showInfo(Player player) {
        int[] playerArray = Arrays.copyOf(player.getGuessNumbers(), player.getLastAttempt());
        System.out.println("Попытки игрока " + player.getName());
        int j = 1;
        for (int i = 0; i < playerArray.length; i++) {
            j += 1;
            System.out.print(playerArray[i] + " ");
        }
        if (j == 5) {
            System.out.println("");
        }
    }
}