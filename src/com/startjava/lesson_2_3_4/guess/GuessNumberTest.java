package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    private static Player player1;
    private static Player player2;
    private static Player player3;

    public static void main(String[] args) {
        GuessNumber game = new GuessNumber(player1, player2, player3);
        int rounds = 0;
        do {
            game.play();
            rounds++;
            if (rounds == 3) {
                game.winner();
            }
        } while(isNotFinished());
    }

    private static boolean isNotFinished() {
        String answer = " ";
        while (!answer.equals("yes") && !answer.equals("no")) {
            System.out.println("\nХотите продолжить игру? [yes/no]:");
            Scanner input = new Scanner(System.in);
            answer = input.nextLine();
        }
        return answer.equals("yes");
    }
}