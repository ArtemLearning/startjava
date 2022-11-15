package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                doCalculation(input);
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            answer = input.nextLine();
        } while (!answer.equals("no"));
    }

    private static void doCalculation(Scanner input) {
        System.out.print("Введите математическое выражение: ");
        try {
            System.out.println("Результат = " + Calculator.calculate(input.nextLine()));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            doCalculation(input);
        }
    }
}