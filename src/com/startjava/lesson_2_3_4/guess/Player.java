package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final int arrayMaxIndex = 10;
    private final String name;
    private final int[] guessNumbers = new int[arrayMaxIndex];
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
        } else {
            return false;
        }
    }

    public int getAttemptNumber() {
        return  attemptNumber;
    }

    public void initializeNumbers() {
        Arrays.fill(guessNumbers, 0);
        attemptNumber = 0;
    }

    public int getWins() {
        return wins;
    }

    public void setWins() {
        wins++;
    }

    private boolean isInRange(int number) {
        return number > 0 && number <= 100;
    }
}