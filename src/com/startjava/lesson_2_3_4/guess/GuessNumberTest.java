package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Игрок №1, представьтесь, пожалуйста: ");
        Player player1 = new Player(input.nextLine());
        System.out.print("Игрок №2, представьтесь, пожалуйста: ");
        Player player2 = new Player(input.nextLine());
        System.out.print("Игрок №3, представьтесь, пожалуйста: ");
        Player player3 = new Player(input.nextLine());
        GuessNumber game = new GuessNumber(player1, player2, player3);
        do {
            game.play();
        } while (isNext());
    }

        private static boolean isNext() {
        String answer = " ";
        Scanner input = new Scanner(System.in);
        while (!answer.equals("yes") && !answer.equals("no")) {
            System.out.println("\nХотите продолжить игру? [yes/no]:");
            answer = input.nextLine();
        }
        return answer.equals("yes");
    }
}