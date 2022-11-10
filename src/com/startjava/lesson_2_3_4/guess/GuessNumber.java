package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private final int playerQuantity = 3;
    private final int numberOfAttempts = 10;
    private final Player[] players; // = new Player[playerQuantity];
    private int guessNumber;

    public GuessNumber(Player... players) {
        this.players = players;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < playerQuantity; i++) {
            System.out.print("Игрок " + (i + 1) + " представьтесь, пожалуйста: ");
            players[i] = new Player(input.nextLine());
        }
        shufflePlayers(players);
        System.out.println("После жеребьёвки порядок следующий: ");
        for (int i = 0; i < playerQuantity; i++) {
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
        for (int i = 1; i <= numberOfAttempts; i++) {
            if (playFinished()) {
                break;
            }
        }
    }

    private boolean playFinished() {
        for (int i = 0; i < playerQuantity; i++) {
            if (isCorrect(players[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean isGuessed(Player player) {
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
                player.setWins();
                return true;
            }
        }
    }

    private void initialize() {
        guessNumber = 1 + (int) (Math.random() * 100);
        System.out.println("Число загадано, начинаем игру");
        System.out.println("У каждого игрока по " + numberOfAttempts + "  попыток");
        for (int i = 0; i < playerQuantity; i++) {
            players[i].initializeNumbers();
        }
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

    private void endOfAttempts(Player player) {
        if (player.getAttemptNumber() == numberOfAttempts) {
            System.out.println("У " + player.getName() + " закончились попытки");
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

    private char compareNumbers(int number) {
        return number > guessNumber ? '>' : number < guessNumber ? '<' : '=';
    }

    private int getGuessNumber() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private void shufflePlayers(Player[] players) {
        for (int i = playerQuantity - 1; i >= 0; i--) {
            int j = (int) (Math.random() * i);
            swap(players, i, j);
        }
    }

    public void winner() {
        boolean draw = true;
        Player winner = players[0];
        for (int i = 1; i < playerQuantity; i++) {
            if (players[i].getWins() > winner.getWins()) {
                winner = players[i];
                draw = false;
            }
        }
        if (draw) {
            System.out.println("\nПобедила дружба");
        } else {
            System.out.println("\nПобедил игрок " + winner.getName());
        }

    }
}
