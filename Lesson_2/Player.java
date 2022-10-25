import java.util.Scanner;
public class Player {

    private String playerName;
    private int playerNumber;

    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName() {
        System.out.print(", представьтесь, пожалуйста: ");
        Scanner input = new Scanner(System.in, "cp866");
        playerName = input.nextLine();
    }

    public int getPlayerNumber() {
        return playerNumber;
    }
    public void setPlayerNumber() {
        System.out.print(", введите ваше число: ");
        Scanner input = new Scanner(System.in);
        playerNumber = input.nextInt();
    }
}