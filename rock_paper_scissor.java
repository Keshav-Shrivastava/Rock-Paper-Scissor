import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissor {
    public static void main(String[] args) {
        System.out.println("Enter 0 for rock, 1 for paper, 2 for scissor : ");
        Scanner sc = new Scanner(System.in);
        int humanInput = sc.nextInt();

        Random random = new Random();
        int compInput = random.nextInt(3);
        if(humanInput<=2){
            System.out.println("Game Starts");
        }
        else {
            System.out.println("Invalid user input");
            return;
        }
        if (humanInput == compInput) {
            System.out.println("Draw again!");
        } else if (humanInput == 0 && compInput == 2 || humanInput == 1 && compInput == 0 || humanInput == 2 && compInput == 1) {
            System.out.println("You win");

        } else {
            System.out.println("Computer wins!");
        }

        System.out.println("Comp choice :" + compInput);
    }

}