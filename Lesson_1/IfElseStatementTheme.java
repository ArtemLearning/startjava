public class IfElseStatementTheme {

    public static void main(String[] args) {
    printItem1();

    public static void printItem1() {
        int age = 32;
        boolean isMale = false;
        float height = 1.92f;
        char name = "Maxine";

        System.out.println("\n1. Перевод псевдокода на язык Java");
        if (age > 20) {
            System.out.println("Уже можно покупать алкоголь");
        } else {
            System.out.println("Алкоголь покупать запрещено");
        }

        if (!isMale) {
            System.out.println("Предложить ювелирные украшения");
        } else {
            System.out.println("Предложить электронику");
        }

        if (height < 1.80) {
            System.out.println("Предложить футбольный мяч");
        } else {
            System.out.println("Предложить баскетбольный мяч");
        }

        if (name.charAt(0) == 'M') {
            System.out.println("Предложить именную ложку на букву М");
        } else if (name.charAt(0) == 'I') {
            System.out.println("Предложить именную футболку");
        } else {
            System.out.println("Предложить общие вещи");
        }
}