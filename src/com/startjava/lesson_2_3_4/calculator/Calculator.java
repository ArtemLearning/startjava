package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

        private int firstNumber;
        private int secondNumber;
        private char operation;
        private float result = 1f;

        public int getFirstNumber() {
            return firstNumber;
        }

        public void setFirstNumber(int inputNumber) {
            firstNumber = inputNumber;
        }

        public int getSecondNumber() {
            return secondNumber;
        }

        public void setSecondNumber(int inputNumber) {
            secondNumber = inputNumber;
        }

        public char getOperation() {
            return operation;
        }

        public void setOperation(char inputOperation) {
            operation = inputOperation;
            if (!isCorrectOperation()) {
                operation = ' ';
                System.out.println("Некорректная операция");
            }
        }

        public boolean isCorrectOperation() {
           switch(operation) {
                case '+':
                    return true;
                case '-':
                    return true;
                case '*':
                    return true;
                case '/':
                    return true;
                case '^':
                    return true;
                case '%':
                    return true;
                default:
                    return false;
           }
        }

        public float calculate() {
           switch(operation) {
                case '+' : {
                    return (float) firstNumber + secondNumber;
                }
                case '-': {
                    return (float) firstNumber - secondNumber;
                }
                case '*': {
                    return (float) firstNumber * secondNumber;
                }
                case '/': {
                    return (float) firstNumber / secondNumber;
                }
                case '^': {
                    float result = 1f;
                    for (int i = 0; i < secondNumber; i++) {
                        result = (float) result * firstNumber;
                    }
                    return result;
                }
                case '%': {
                    return firstNumber % secondNumber;
                }
                default: {
                    return 0f;
                }
            }
        }
}