package com.startjava.lesson_2_3_4.guess;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumber {
    private final static int ROUNDS_LIMIT = 3;
    private final static int ATTEMPTS_LIMIT = 10;
    private final Player[] players;
    private int guessNumber;
    private int rounds;

    public GuessNumber(Player... players) {
        this.players = players;
        shufflePlayers(players);
        System.out.println("После жеребьёвки порядок следующий: ");
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }

    private void shufflePlayers(Player[] players) {
        for (int i = players.length - 1; i >= 0; i--) {
            int j = (int) (Math.random() * i);
            Player tempPlayer = players[i];
            players[i] = players[j];
            players[j] = tempPlayer;
        }
    }

    public void play() {
        init();
        for (int i = 1; i <= ATTEMPTS_LIMIT; i++) {
            for (Player player : players) {
                if (makeMove(player)) {
                    rounds++;
                    if (rounds == ROUNDS_LIMIT) {
                        decideWinner();
                    }
                    return;
                }
                if (player.getAttemptNumber() == ATTEMPTS_LIMIT) {
                    System.out.println("У " + player.getName() + " закончились попытки");
                }
            }
        }
    }

    private void init() {
        if (rounds == ROUNDS_LIMIT) {
            rounds = 0;
        }
        guessNumber = 1 + (int) (Math.random() * 100);
        System.out.println("Число загадано, начинаем игру");
        System.out.println("У каждого игрока по " + ATTEMPTS_LIMIT + "  попыток");
        for (Player player : players) {
            player.clearAttempts();
        }
    }

    private boolean makeMove(Player player) {
        System.out.print(player.getName() + ", введите ваше число: ");
        int number = inputNumber();
        while (!player.addGuessNumber(number)) {
            System.out.println("Число " + number + " вне угадываемого диапазона. Введите корректное число");
            number = inputNumber();
        }
        if (compareNumbers(player, number)) {
            printPlayerAttempts(player);
            return true;
        }
        return false;
    }

    private boolean compareNumbers(Player player, int number) {
        System.out.print("Игрок " + player.getName() + ", ваше число " + number);
        if (number == guessNumber) {
            System.out.println(" равно задуманному. Вы угадали с " + player.getAttemptNumber() + " попытки");
            player.incrementWinsQuantity();
            return true;
        }
        if (number > guessNumber) {
            System.out.println(" больше задуманного");
        } else {
            System.out.println(" меньше задуманного");
        }
        return false;
    }

    private int inputNumber() {
        Scanner input = new Scanner(System.in);
        int number = 0;
        try {
            number = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        return number;
    }

    private void printPlayerAttempts(Player player) {
        System.out.println("Попытки игрока " + player.getName());
        int[] numbers = player.getGuessNumbers();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private void decideWinner() {
        boolean draw = true;
        Player winner = players[0];
        for (int i = 1; i < players.length; i++) {
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
}
