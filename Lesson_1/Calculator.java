public class Calculator {

    public static void main(String[] args) {
    int calcNum1 = 123;
    int calcNum2 = 12;
    char operation = '/';
    float result = 1f;

    System.out.println("\nКалькулятор");
    System.out.println("Число 1 = " + calcNum1);
    System.out.println("Число 2 = " + calcNum2);
    System.out.println("Операция - " + operation);

    if (operation == '+') {
        result = (float) calcNum1 + calcNum2;
    } else if(operation == '-') {
        result = (float) calcNum1 - calcNum2;
    } else if(operation == '*') {
        result = (float) calcNum1 * calcNum2;
    } else if(operation == '/') {
        if (calcNum2 !=0) {
            result = (float) calcNum1 / calcNum2;
        } else {
            System.out.println("Деление на ноль!");
            if (calcNum1 > 0) {
                result = (float) Float.POSITIVE_INFINITY;
            } else if (calcNum1 < 0) {
            result = (float) Float.NEGATIVE_INFINITY;
            } else {
                result = (float) Float.NaN;
            }
        }   
    } else if(operation == '%') {
        result = (float) calcNum1 % calcNum2;
    } else if(operation == '^') {
        for (int i = 0; i < calcNum2; i++) {
            result = (float) result * calcNum1;
        }
    }
    System.out.println(calcNum1 + " " + operation + " " + calcNum2 + " = " + result);
    }
}