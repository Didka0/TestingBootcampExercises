import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise9 {
    public static void main ( String [] args ) {
        System.out.println("Choose one of: rock,paper,scissors: ");
        String player_choise;
        Scanner scanner = new Scanner(System.in);

        player_choise = scanner.next();
        System.out.println("You chose: " + player_choise);

        int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        if (randomNum == 1) {
            System.out.println("Computer chose: rock");
            if (player_choise.equals("rock")){
                System.out.println("Draw");
            }
            if (player_choise.equals("paper" )) {
                System.out.println("You won");
            }
            if (player_choise.equals("scissors")) {
                System.out.println("Computer won");
            }
        }
        if (randomNum == 2) {
            System.out.println("Computer chose: paper");
            if (player_choise.equals("rock")){
                System.out.println("Computer won");
            }
            if (player_choise.equals("paper")) {
                System.out.println("Draw");
            }
            if (player_choise.equals("scissors")) {
                System.out.println("You won");
            }
        }
        if (randomNum == 3) {
            System.out.println("Computer chose: scissors");
            if (player_choise.equals("rock")){
                System.out.println("You won");
            }
            if (player_choise.equals("paper" )) {
                System.out.println("Computer won");
            }
            if (player_choise.equals("scissors")) {
                System.out.println("Draw");
            }
        }

    }
}
