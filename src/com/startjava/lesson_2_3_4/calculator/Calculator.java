package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static int firstOperand;
    private static int secondOperand;
    private static char operation;

        public static float calculate() {
           switch(operation) {
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

        public static boolean isGood(String operand) {
            try {
                int number = Integer.parseInt(operand);
                if (number <= 0) {
                    System.out.println("Число " + operand + " меньше нуля.");
                    return false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Число " + operand + " не целое.");
                return false;
            }
            return true;
        }
        public static boolean parseExpression(String input) {
            String[] expression = input.split(" ");
            try {
                firstOperand = Calculator.isGood(expression[0]) ? Integer.parseInt(expression[0]) : -1;
                secondOperand = Calculator.isGood(expression[2]) ? Integer.parseInt(expression[2]) : -1;
                operation = expression[1].charAt(0);
                return firstOperand != -1 && secondOperand != -1;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Строка введена некорректно. Разделяйте числа и операцию пробелами");
                return false;
            }
    }

}