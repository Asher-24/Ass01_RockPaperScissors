import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String play = "";
        boolean done = false;

        do { //looping the program

            do { //looping until player A inputs R,P,S
                System.out.println("Player A enter your move [RPS]: ");
                playerA = sc.nextLine();
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {
                    done = true;
                } else {
                    System.out.println("\nInvalid move! Try again with [RPS]: ");
                }
            } while (!done);

            done = false;
            do { //Looping until player B inputs RPS
                System.out.println("Player B enter your move [RPS]: ");
                playerB = sc.nextLine();
                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) {
                    done = true;
                } else {
                    System.out.println("\nInvalid move! Try again with [RPS]: ");
                }
            } while (!done);

            if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock it's a Tie!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock, player B wins!");
                } else if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Rock breaks Scissors, player A wins!");
                }
            } else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock, player A wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper, it's a tie!");
                } else if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors cuts Paper, player B wins!");
                }
            } else if (playerA.equalsIgnoreCase("S")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors, player B wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper, player A wins!");
                } else if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors vs Scissors, it's a tie!");
                }
            }

            System.out.println("Do you want to play again? [Y/N]: ");
            play = sc.nextLine();


        } while (play.equalsIgnoreCase("Y") || play.equalsIgnoreCase("y")); //Loop the program again if user inputs Yes
    }
}