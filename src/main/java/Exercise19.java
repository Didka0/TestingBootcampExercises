import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise19 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose one of: rock,paper,scissors or exit: ");
            String player_choice;
            Scanner scanner = new Scanner(System.in);
            player_choice = scanner.next();

            if (player_choice.equals("exit")) {
                break;
            }

            if (!player_choice.equals("rock") && !player_choice.equals("paper") && !player_choice.equals("scissors")) {
                System.out.println("Invalid input");
                return;
            }



            System.out.println("You chose:" + player_choice);

            int computer_choice = ThreadLocalRandom.current().nextInt(1, 3 + 1);
            if (computer_choice == 1) {
                System.out.println("Computer chose: rock");
                if (player_choice.equals("rock")) {
                    System.out.println("Draw");
                }
                if (player_choice.equals("paper")) {
                    System.out.println("You won");
                }
                if (player_choice.equals("scissors")) {
                    System.out.println("Computer won");
                }
            }
            if (computer_choice == 2) {
                System.out.println("Computer chose: paper");
                if (player_choice.equals("rock")) {
                    System.out.println("Computer won");
                }
                if (player_choice.equals("paper")) {
                    System.out.println("Draw");
                }
                if (player_choice.equals("scissors")) {
                    System.out.println("You won");
                }
            }
            if (computer_choice == 3) {
                System.out.println("Computer chose: scissors");
                if (player_choice.equals("rock")) {
                    System.out.println("You won");
                }
                if (player_choice.equals("paper")) {
                    System.out.println("Computer won");
                }
                if (player_choice.equals("scissors")) {
                    System.out.println("Draw");
                }
            }
        }
        }
    }