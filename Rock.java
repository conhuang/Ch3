
/**
 * Allows user to play a game of rock, paper, scissors with the computer.
 *
 * @author Connie Huang
 * @version September 12, 2017
 */
import java.util.Scanner;

public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay = "U";  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number for computer play

        Scanner scan = new Scanner(System.in);

        System.out.print("\fPlay Rock, Paper, Scissors!\n"+
                        "Enter your play (\"R\" for Rock, \"P\" for paper, and \"S\" for scissors): ");
        personPlay = scan.nextLine();
        personPlay = personPlay.toUpperCase();

        while (!personPlay.equals("Q")){
           computerInt = (int) (Math.random()*3);
           if (computerInt == 0)
                computerPlay = "R";
           else if (computerInt == 1)
                computerPlay = "P";
           else
                computerPlay = "S";
             
            if (personPlay.equals(computerPlay))  {
                System.out.println ("Computer play: " + computerPlay);
                System.out.println("It's a tie!");
                System.out.print("\nEnter another play (q to quit): ");
                personPlay = scan.nextLine();
               personPlay = personPlay.toUpperCase();
            } else if (personPlay.equals("R")){
                System.out.println ("Computer play: " + computerPlay);
                if (computerPlay.equals("S"))
                    System.out.println("Rock crushes scissors.  You win!!");
                else if (computerPlay.equals("P"))
                    System.out.println("Paper beats rock. You lose :(");
                System.out.print("\nEnter another play (q to quit): ");
                personPlay = scan.nextLine();
                personPlay = personPlay.toUpperCase();
            }else if (personPlay.equals("S")){
                System.out.println ("Computer play: " + computerPlay);
                if (computerPlay.equals("R"))
                    System.out.println("Rock crushes scissors. You lose :(");
                else if (computerPlay.equals("P"))
                    System.out.println("Scissors cut up paper. You win!!");
                System.out.print("\nEnter another play (q to quit): ");
                personPlay = scan.nextLine();
                personPlay = personPlay.toUpperCase();
           }else if (personPlay.equals("P")){
               System.out.println ("Computer play: " + computerPlay);
                if (computerPlay.equals("R"))
                    System.out.println("Paper beats rock. You win!!");
                else if (computerPlay.equals("S"))
                    System.out.println("Scissors cut up paper. You lose :(");
                System.out.print("\nEnter another play (q to quit): ");
                    personPlay = scan.nextLine();
                    personPlay = personPlay.toUpperCase();
           }else{
                System.out.print("Invalid input. Enter another play (q to quit): ");
                personPlay = scan.nextLine();
                personPlay = personPlay.toUpperCase();
            }
           
        }
        System.out.println ("Thanks for playing!");
    }
}
