
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

        System.out.println ("\fPlay Rock, Paper, Scissors!\n"+
                        "Enter your play (\"R\" for Rock, \"P\" for paper, and \"S\" for scissors): ");
        personPlay = scan.nextLine();
        personPlay = personPlay.toUpperCase();//Make player's play uppercase for ease of comparison

        computerInt = (int) (Math.random()*3);//Generate computer's play (0,1,2). Use the Math.random() method

        //Translate computer's randomly generated play to string
        if (computerInt == 0)
            computerPlay = "R";
        else if (computerInt == 1)
            computerPlay = "P";
        else
            computerPlay = "S";

        System.out.println ("Computer play: " + computerPlay);//Print computer's play

        //See who won.  Use nested ifs instead of &&.
        if (personPlay.equals(computerPlay))  
            System.out.println("It's a tie!");
        else if (personPlay.equals("R")){
           if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors.  You win!!");
           else if (computerPlay.equals("P"))
                System.out.println("Paper beats rock. You lose :(");
        }
         else if (personPlay.equals("S")){
            if (computerPlay.equals("R"))
                System.out.println("Rock crushes scissors. You lose :(");
            else if (computerPlay.equals("P"))
                System.out.println("Scissors cut up paper. You win!!");
        }
        else if (personPlay.equals("P")){
            if (computerPlay.equals("R"))
                System.out.println("Paper beats rock. You win!!");
            else if (computerPlay.equals("S"))
                System.out.println("Scissors cut up paper. You lose :(");
        }
    }
}
