import java.util.Scanner;
public class GuessNumberTest {

    public static void main(String[] args) {

        System.out.print("Первый игрок");
        Player playerOne = new Player();
        playerOne.setPlayerName();

        System.out.print("\nВторой игрок");
        Player playerTwo = new Player();
        playerTwo.setPlayerName();

        Scanner input = new Scanner(System.in);
        while(true) {
        String answer = " ";
        GuessNumber game = new GuessNumber();
        System.out.println("Число загадано, начинаем игру");
            while(true) {
                System.out.print(playerOne.getPlayerName());
                playerOne.setPlayerNumber();
                System.out.print(playerOne.getPlayerName());
                if (game.isGuessed(playerOne.getPlayerNumber())) {
                    break;
                }
                System.out.print(playerTwo.getPlayerName());
                playerTwo.setPlayerNumber();
                System.out.print(playerTwo.getPlayerName());
                if (game.isGuessed(playerTwo.getPlayerNumber())) {
                    break;
                }
            }
            while (!(answer.equals("yes") || answer.equals(("no")))) {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                answer = input.nextLine();
            }
            if (answer.equals("no")) {
                break;
            }
        }
    }
}