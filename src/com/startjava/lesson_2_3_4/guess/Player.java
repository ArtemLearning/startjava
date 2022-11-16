package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final int ARRAY_MAX_INDEX = 10;
    private final String name;
    private final int[] guessNumbers = new int[ARRAY_MAX_INDEX];
    private int attemptNumber = 0;
    private int wins;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getGuessNumbers() {
        return Arrays.copyOf(guessNumbers, attemptNumber);
    }

    public boolean setGuessNumbers(int guessNumber) {
        if (isInRange(guessNumber)) {
            attemptNumber++;
            guessNumbers[attemptNumber - 1] = guessNumber;
            return true;
        }
        return false;
    }

    public int getAttemptNumber() {
        return attemptNumber;
    }

    public int getWinsQuantity() {
        return wins;
    }

    public void incrementWinsQuantity() {
        wins++;
    }

    public void clearAttempts() {
        Arrays.fill(guessNumbers, 0, attemptNumber - 1, 0);
        attemptNumber = 0;
    }

    private boolean isInRange(int number) {
        return number > 0 && number <= 100;
    }
}