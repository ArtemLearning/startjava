public class MyFirstGame {

    public static void main(String[] args) {
    int initialNumber = 13;
    int guessNumber = 50;

    do {
        if (guessNumber > initialNumber) {
            guessNumber = guessNumber / 2;
        } else if (guessNumber < initialNumber){
            guessNumber = (guessNumber + guessNumber) / 2;
        }
    } while (guessNumber != initialNumber);
        
    }
}