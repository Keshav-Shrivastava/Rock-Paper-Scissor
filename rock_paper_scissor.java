import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] rps = {"r", "p", "s"};                                    // r = rock, p = paper, s = scissors
            String systemMove = rps[new Random().nextInt(rps.length)];         // system-move

            String playerMove;

            while(true) {
                System.out.println("Please enter your move (r, p, or s)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move.");
            }

            System.out.println("System played: " + systemMove);

            if (playerMove.equals(systemMove)) {
                System.out.println("The game was a tie!");
            }
            else if (playerMove.equals("r")) {
                if (systemMove.equals("p")) {
                    System.out.println("You lose!");

                } else if (systemMove.equals("s")) {
                    System.out.println("You win!");
                }
            }

            else if (playerMove.equals("p")) {
                if (systemMove.equals("r")) {
                    System.out.println("You win!");

                } else if (systemMove.equals("s")) {
                    System.out.println("You lose!");
                }
            }

            else if (playerMove.equals("s")) {
                if (systemMove.equals("p")) {
                    System.out.println("You win!");

                } else if (systemMove.equals("r")) {
                    System.out.println("You lose!");
                }
            }

            System.out.println("Play again? (y/n)");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("y")) {
                break;
            }
        }
        scanner.close();
    }
};
