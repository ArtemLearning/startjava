public class Calculator {

    public static void main(String[] args) {
        int a = 123;
        int b = 12;
        char operation = '/';
        float result = 1f;

        System.out.println("\nКалькулятор");
        System.out.println("Число 1 = " + a);
        System.out.println("Число 2 = " + b);
        System.out.println("Операция - " + operation);

        if (operation == '+') {
            result = (float) a + b;
        } else if(operation == '-') {
            result = (float) a - b;
        } else if(operation == '*') {
            result = (float) a * b;
        } else if(operation == '/') {
            if (a !=0) {
                result = (float) a / b;
            } else {
                System.out.println("Деление на ноль!");
                if (a > 0) {
                    result = (float) Float.POSITIVE_INFINITY;
                } else if (a < 0) {
                result = (float) Float.NEGATIVE_INFINITY;
                } else {
                    result = (float) Float.NaN;
                }
            }
        } else if(operation == '%') {
            result = (float) a % b;
        } else if(operation == '^') {
            for (int i = 0; i < b; i++) {
                result = (float) result * a;
            }
        }
        System.out.println(a + " " + operation + " " + b + " = " + result);
    }
}