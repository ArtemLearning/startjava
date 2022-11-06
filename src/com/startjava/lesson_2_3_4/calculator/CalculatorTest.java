package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;
        do {
            do {
                System.out.print("Введите математическое выражение: ");
            }
            while (!Calculator.parseExpression(input.nextLine()));
            System.out.println("Результат = " + Calculator.calculate());
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                answer = input.nextLine();
            }
            while (!(answer.equals("yes") || answer.equals(("no"))));
        } while (!answer.equals("no"));
    }
}