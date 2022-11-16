package com.startjava.lesson_2_3_4.guess;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumber {
    private final int PLAYER_QUANTITY = 3;
    private final int NUMBER_OF_ATTEMPTS = 10;
    private final Player[] players;
    private int guessNumber;
    private int rounds;

    public GuessNumber(Player... players) {
        this.players = players;
        shufflePlayers(players);
        System.out.println("После жеребьёвки порядок следующий: ");
        for (int i = 0; i < PLAYER_QUANTITY; i++) {
            System.out.println(players[i].getName());
        }
    }

    private static void swap(Player[] players, int i, int j) {
        Player tempPlayer = players[i];
        players[i] = players[j];
        players[j] = tempPlayer;
    }

    public void play() {
        initialize();
        for (int i = 1; i <= NUMBER_OF_ATTEMPTS; i++) {
            if (playFinished()) {
                rounds++;
                if (rounds == 3) {
                    winner();
                }
                break;
            }
        }
    }

    private void shufflePlayers(Player[] players) {
        for (int i = PLAYER_QUANTITY - 1; i >= 0; i--) {
            int j = (int) (Math.random() * i);
            swap(players, i, j);
        }
    }

    private void initialize() {
        if (rounds == 3) {
            rounds = 0;
        }
        guessNumber = 1 + (int) (Math.random() * 100);
        System.out.println("Число загадано, начинаем игру");
        System.out.println("У каждого игрока по " + NUMBER_OF_ATTEMPTS + "  попыток");
        for (int i = 0; i < PLAYER_QUANTITY; i++) {
            if (players[i].getAttemptNumber() > 0) {
                players[i].clearAttempts();
            }
        }
    }

    private void winner() {
        boolean draw = true;
        Player winner = players[0];
        for (int i = 1; i < PLAYER_QUANTITY; i++) {
            if (players[i].getWinsQuantity() > winner.getWinsQuantity()) {
                winner = players[i];
                draw = false;
            }
        }
        if (draw) {
            System.out.println("\nПобедила дружба");
        } else {
            System.out.println("\nПосле 3-х раундов победил игрок " + winner.getName() + ", число побед = "
                    + winner.getWinsQuantity());
        }
    }

    private boolean playFinished() {
        for (int i = 0; i < PLAYER_QUANTITY; i++) {
            if (isCorrect(players[i])) {
                return true;
            }
        }
        return false;
    }

    private boolean isCorrect(Player player) {
        System.out.print(player.getName() + ", введите ваше число: ");
        if (isGuessed(player)) {
            showInfo(player);
            return true;
        } else {
            return false;
        }
    }

    private boolean isGuessed(Player player) {
        int number = getGuessNumber();
        while (!player.setGuessNumbers(number)) {
            System.out.println("Число " + number + " вне угадываемого диапазона. Введите корректное число");
            number = getGuessNumber();
        }
        endOfAttempts(player);
        System.out.print("Игрок " + player.getName() + ", ваше число " + number);
        switch (compareNumbers(number)) {
            case '>' -> {
                System.out.println(" больше задуманного");
                return false;
            }
            case '<' -> {
                System.out.println(" меньше задуманного");
                return false;
            }
            default -> {
                System.out.println(" равно задуманному. Вы угадали с " + player.getAttemptNumber() + " попытки");
                player.incrementWinsQuantity();
                return true;
            }
        }
    }

    private void showInfo(Player player) {
        System.out.println("Попытки игрока " + player.getName());
        int[] playerNumbers = player.getGuessNumbers();
        for (int i = 0; i < player.getAttemptNumber(); i++) {
            System.out.print(playerNumbers[i] + " ");
            if (i == 4) {
                System.out.println();
            }
        }
    }

    private int getGuessNumber() {
        Scanner input = new Scanner(System.in);
        int number = 0;
        try {
            number = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        return number;
    }

    private void endOfAttempts(Player player) {
        if (player.getAttemptNumber() == NUMBER_OF_ATTEMPTS) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }

    private char compareNumbers(int number) {
        return number > guessNumber ? '>' : number < guessNumber ? '<' : '=';
    }
}
