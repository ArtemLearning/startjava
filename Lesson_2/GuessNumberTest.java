import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        GuessNumber game = new GuessNumber();
        while(true) {
            String answer = " ";
            game.play();
            while (!answer.equals("yes") && !answer.equals("no")) {
                    System.out.println("Хотите продолжить игру? [yes/no]: ");
                    Scanner input = new Scanner(System.in);
                    answer = input.nextLine();
            }
            if (answer.equals("no")) {
                break;
            }
        }
    }
}