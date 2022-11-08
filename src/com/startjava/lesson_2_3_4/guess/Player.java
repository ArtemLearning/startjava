package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] guessNumbers = new int[10];
    private int attemptNumber;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getGuessNumbers() {
        return guessNumbers;
    }

    public void setGuessNumbers(int attemptNumber, int guessNumber) {
        this.attemptNumber = attemptNumber;
        guessNumbers[attemptNumber - 1] = guessNumber;
    }

    public int getLastAttempt() {
        return  attemptNumber;
    }

    public void initializeNumbers() {
        Arrays.fill(guessNumbers, 0);
    }

}