package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                doCalculation();
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            Scanner input = new Scanner(System.in);
            answer = input.nextLine();
        } while (!answer.equals("no"));
    }

    private static void doCalculation() {
        System.out.print("Введите математическое выражение: ");
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Результат = " + Calculator.calculate(input.nextLine()));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            doCalculation();
        }
    }
}