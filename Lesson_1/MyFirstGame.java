public class MyFirstGame {

    public static void main(String[] args) {
        int targetNum = 34;
        int guessNumber = 0;
        int lowerLimit = 0;

        while (guessNumber != targetNum) {
            if (guessNumber < targetNum) {
                guessNumber = lowerLimit + 5;
            }
            if (guessNumber < targetNum) {
                XSystem.out.println("Число " + guessNumber + " меньше задуманного");
                lowerLimit = guessNumber + 5;
            } else {
                System.out.println("Число " + guessNumber + " больше задуманного");
                guessNumber--;
            }
        }
        System.out.println("Вы победили!");
    }
}