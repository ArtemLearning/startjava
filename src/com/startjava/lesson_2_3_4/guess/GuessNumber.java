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
        initialize();
        for (int i = 1; i <= 10; i++) {
            if (isCorrect(playerOne, i)) {
                break;
            }
            if (isCorrect(playerTwo, i)) {
                break;
            }
        }
    }

    public boolean isGuessed(Player player, int number, int attempt) {
        if (attempt == 1) {
            player.initializeNumbers();
        }
        player.setGuessNumbers(attempt, number);
        endOfAttempts(player, attempt);
        return (compareNumbers(player, number, attempt));
    }

    private void initialize() {
        guessNumber = 1 + (int) (Math.random() * 100);
        System.out.println("Число загадано, начинаем игру");
        System.out.println("У каждого игрока по 10 попыток");
    }

    private boolean isCorrect(Player player, int attempt) {
        System.out.print(player.getName() + ", введите ваше число: ");
        Scanner input = new Scanner(System.in);
        if (isGuessed(player, input.nextInt(), attempt)) {
            showInfo(player);
            return true;
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
        for (int i = 0; i < playerArray.length; i++) {
            System.out.print(playerArray[i] + " ");
            if (i == 4) {
                System.out.println();
            }
        }
    }

    private boolean compareNumbers(Player player, int number, int attempt){
        return number > guessNumber ? false : number < guessNumber ? false : true;
        if (number > guessNumber) {
            System.out.println("Игрок " + player.getName() + ", ваше число больше задуманного");
            return false;
        } else if (number < guessNumber) {
            System.out.println("Игрок " + player.getName() + ", ваше число меньше задуманного");
            return false;
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + number + " c "
                    + attempt + " попытки");
            return true;
        }
    }
}