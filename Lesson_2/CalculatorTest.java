import java.util.Scanner;
public class CalculatorTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator simpleCalc = new Calculator();
        String answer = " ";

        while(true) {
            System.out.print("Введите первое число: ");
            simpleCalc.setFirstNumber(input.nextInt());
            do {
                System.out.print("\nВведите знак математической операции: ");
                simpleCalc.setOperation(input.next().charAt(0));
            }
            while (!simpleCalc.isCorrectOperation());
            System.out.print("\nВведите второе число: ");
            simpleCalc.setSecondNumber(input.nextInt());
            answer = input.nextLine();
            System.out.println("Результат = " + simpleCalc.calculate());
            while (!(answer.equals("yes") || answer.equals(("no")))) {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                answer = input.nextLine();
            }
            if (answer.equals("no")) {
                break;
            }
        }
    }
}