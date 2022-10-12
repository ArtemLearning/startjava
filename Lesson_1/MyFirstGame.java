public class MyFirstGame {
    public static void main(String[] args) {

        int initialNumber = 34;
        int guessNumber = 0;
        int lowerLimit = 0;

        while (guessNumber != initialNumber) {
            if (guessNumber < initialNumber) {
                guessNumber = lowerLimit + 5;
            }
            if (guessNumber < initialNumber) {
                System.out.println("Число " + guessNumber + " меньше задуманного");
                lowerLimit = guessNumber + 5;
            } else {
                System.out.println("Число " + guessNumber + " больше задуманного");
                guessNumber = guessNumber - 1;
            }
        }
        System.out.println("Вы победили!");
    }
}