import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String newGame = "";
        do {
            // Declare variables
            Scanner in = new Scanner(System.in);
            String playerAMove = "";
            String playerBMove = "";
            Boolean done = false;

            // Get user input
            do
            {
                System.out.println("Player A: Please enter a move (R, P, or S).");
                playerAMove = in.nextLine();
                if(playerAMove.equalsIgnoreCase("r") || playerAMove.equalsIgnoreCase("p") || playerAMove.equalsIgnoreCase("s"))
                {
                    done = true;
                } else {
                    System.out.println("Invalid input " + playerAMove + ". Please enter a valid move (R, P, or S).");
                }
            }while(done == false);
            done = false;

            do
            {
                System.out.println("Player B: Please enter a move (R, P, or S).");
                playerBMove = in.nextLine();
                if(playerBMove.equalsIgnoreCase("r") || playerBMove.equalsIgnoreCase("p") || playerBMove.equalsIgnoreCase("s"))
                {
                    done = true;
                } else {
                    System.out.println("Invalid input " + playerBMove + ". Please enter a valid move (R, P, or S).");
                }
            }while(done == false);

            // Determine game outcome
            if(playerAMove.equalsIgnoreCase("r"))
            {
                if(playerBMove.equalsIgnoreCase("r"))
                {
                    System.out.println("Rock vs Rock; It's a tie!");
                } else if(playerBMove.equalsIgnoreCase("p")) {
                    System.out.println("Paper covers Rock; Player B wins!");
                } else {
                    System.out.println("Rock beats Scissors; Player A wins!");
                }
            } else if(playerAMove.equalsIgnoreCase("p")) {
                if(playerBMove.equalsIgnoreCase("r"))
                {
                    System.out.println("Paper covers Rock; Player A wins!");
                } else if(playerBMove.equalsIgnoreCase("p")) {
                    System.out.println("Paper vs Paper; It's a tie!");
                } else {
                    System.out.println("Scissors cuts Paper; Player B wins!");
                }
            } else {
                if(playerBMove.equalsIgnoreCase("r"))
                {
                    System.out.println("Rock beats Scissors; Player B wins!");
                } else if(playerBMove.equalsIgnoreCase("p")) {
                    System.out.println("Scissors cuts Paper; Player A wins!");
                } else {
                    System.out.println("Scissors vs Scissors; It's a tie!");
                }
            }

            // Prompt for new game
            System.out.println("Play again? [Y/N]");
            newGame = in.nextLine();
            System.out.println("");
        }while(newGame.equalsIgnoreCase("y"));
    }
}