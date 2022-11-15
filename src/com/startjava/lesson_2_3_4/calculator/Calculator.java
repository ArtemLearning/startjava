package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static long firstOperand;
    private static long secondOperand;
    private static char operation;

    public static float calculate(String expression) {
        parseExpression(expression);
        return switch (operation) {
            case '+' -> (float) Math.addExact(firstOperand, secondOperand);
            case '-' -> (float) Math.subtractExact(firstOperand, secondOperand);
            case '*' -> (float) Math.multiplyExact(firstOperand, secondOperand);
            case '/' -> (float) Math.divideExact(firstOperand, secondOperand);
            case '^' -> (float) Math.pow(firstOperand, secondOperand);
            case '%' -> firstOperand % secondOperand;
            default -> 0f;
        };
    }

    private static void parseExpression(String expression) {
        String[] partsExpression = expression.split(" ");
        if (partsExpression.length != 3) {
            throw new RuntimeException("Строка введена некорректно. " + "Разделяйте числа и операцию пробелами");
        }
        firstOperand = validOperand(partsExpression[0]);
        secondOperand = validOperand(partsExpression[2]);
        operation = validOperation(partsExpression[1]);
    }

    private static int validOperand(String operand) {
        if (!isValid(operand)) {
            String str = "Число " + operand + " некорректно. Введите целое число в интервале (0, 100]";
            throw new RuntimeException(str);
        }
        return Integer.parseInt(operand);
    }

    private static boolean isValid(String operand) {
        try {
            int number = Integer.parseInt(operand);
            if (number <= 0 || number > 100) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private static char validOperation(String expression) {
        char operation = expression.charAt(0);
        if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/'
                || operation == '^' || operation == '%')) {
            String str = "Операция " + operation + " некорректнa.";
            throw new RuntimeException(str);
        }
        return operation;
    }
}