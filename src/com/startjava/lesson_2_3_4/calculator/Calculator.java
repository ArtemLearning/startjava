package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static long firstOperand;
    private static long secondOperand;
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
                return (float) Math.divideExact(firstOperand,secondOperand);
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

    private static void parseExpression(String expression) throws RuntimeException {
        String[] partsExpression = expression.split(" ");
        if (partsExpression.length != 3) {
            RuntimeException mistake = new RuntimeException("Строка введена некорректно. " +
                    "Разделяйте числа и операцию пробелами");
            throw new RuntimeException(mistake);
        }
        firstOperand = validOperand(partsExpression[0]);
        secondOperand = validOperand(partsExpression[2]);
        operation = validOperation(partsExpression[1]);
    }

    private static int validOperand(String operand) throws RuntimeException {
        if (!isValid(operand)) {
            String str = "Число " + operand + " некорректно. Введите целое число в интервале (0, 100]";
            RuntimeException mistake = new RuntimeException(str);
            throw new RuntimeException(mistake);
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

    private static char validOperation(String expression) throws RuntimeException {
        char operation = expression.charAt(0);
        if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/'
                || operation == '^' || operation == '%')) {
            String str = "Операция " + operation + " некорректнa.";
            RuntimeException mistake = new RuntimeException(str);
            throw new RuntimeException(mistake);
        }
        return operation;
    }
}