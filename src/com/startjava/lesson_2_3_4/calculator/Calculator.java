package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    private static int firstOperand;
    private static int secondOperand;
    private static char operation;

    public static float calculate(String expression) {
        parseExpression(expression);
        switch (operation) {
            case '+' -> {
                return (float) Math.addExact(firstOperand, secondOperand);
            }
            case '-' -> {
                return (float) Math.subtractExact(firstOperand, secondOperand);
            }
            case '*' -> {
                return (float) Math.multiplyExact(firstOperand, secondOperand);
            }
            case '/' -> {
                return (float) Math.divideExact(firstOperand, secondOperand);
            }
            case '^' -> {
                return (float) Math.pow(firstOperand, secondOperand);
            }
            case '%' -> {
                return firstOperand % secondOperand;
            }
            default -> {
                return 0f;
            }
        }

    }

    private static void parseExpression(String expression) {
        String[] partsExpression = expression.split(" ");
        while (partsExpression.length != 3) {
            System.out.println("Строка введена некорректно. Разделяйте числа и операцию пробелами");
            partsExpression = getNewExpression();
        }
        firstOperand = getOperand(partsExpression[0]);
        secondOperand = getOperand(partsExpression[2]);
        operation = partsExpression[1].charAt(0);
    }

    private static int getOperand(String operand) {
        if (isValid(operand)) {
            return Integer.parseInt(operand);
        }
        return 0;
    }

    private static boolean isValid(String operand) {
        try {
            int number = Integer.parseInt(operand);
            if (number <= 0) {
                do {
                    System.out.println("Число " + operand + " меньше нуля.");
                }
                while (!isValid(getOperand()));
            }
        } catch (NumberFormatException e) {
            do {
                System.out.println("Число " + operand + " не целое.");
            }
            while (!isValid(getOperand()));
        }
        return true;
    }

    private static String getOperand() {
        System.out.print("Введите корректное число :");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private static String[] getNewExpression() {
        System.out.println("Введите математическое выражение");
        Scanner input = new Scanner(System.in);
        return input.nextLine().split(" ");
    }
}