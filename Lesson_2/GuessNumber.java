public class GuessNumber {

    private int guessNumber = 1 + (int) (Math.random() * 100);

    public int getGuessNumber() {
        return guessNumber;
    }

    public boolean isEqual(int number) {
        if (number == guessNumber) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isBigger(int number) {
        if (number > guessNumber) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isSmaller(int number) {
        if (number < guessNumber) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isGuessed(int number) {
        if (isEqual(number)) {
            System.out.println(", вы угадали!");
            return true;
        } else if (isBigger(number)) {
            System.out.println(", ваше число больше задуманного");
            return false;
        } else if (isSmaller(number)) {
            System.out.println(", ваше число меньше задуманного");
            return false;
        } else {
            return false;
        }
    }
}