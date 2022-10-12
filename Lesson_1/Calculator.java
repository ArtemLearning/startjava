public class Calculator {

    public static void main(String[] args) {
    int testVar1 = 123;
    int testVar2 = 6;
    char operation = '/';
    float result = 1f;

    System.out.println("\nКалькулятор");
    System.out.println("Число 1 = " + testVar1);
    System.out.println("Число 2 = " + testVar2);
    System.out.println("Операция - " + operation);

    if (operation == '+') {
        result = (float) testVar1 + testVar2;
    } else if(operation == '-') {
        result = (float) testVar1 - testVar2;
    } else if(operation == '*') {
        result = (float) testVar1 * testVar2;
    } else if(operation == '/') {
        result = (float) testVar1 / testVar2;
    } else if(operation == '%') {
        result = (float) testVar1 % testVar2;
    } else if(operation == '^') {
        for (int i = 0; i < testVar2; i++) {
            result = (float) result * testVar1;
        }
    }
    System.out.println(testVar1 + " " + operation + " " + testVar2 + " = " + result);
    }
}