public class MyFirstGame {

    public static void main(String[] args) {
        int targetNum = 34;
        int guessNumber = 5;

        while (guessNumber != targetNum) {
            if (guessNumber < targetNum) {
                System.out.println("Число " + guessNumber + " меньше задуманного");
                guessNumber = guessNumber + 5;
            } else if (guessNumber > targetNum) {
                System.out.println("Число " + guessNumber + " больше задуманного");
                guessNumber--;
            }
        }
        System.out.println("Вы победили!");
    }
}