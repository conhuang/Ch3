// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;

public class Rock
{
    public static void main(String[] args)
    {
	String personPlay;    //User's play -- "R", "P", or "S"
	String computerPlay = "U";  //Computer's play -- "R", "P", or "S"
	int computerInt;      //Randomly generated number for computer play

        Scanner scan = new Scanner(System.in);

	//Get player's play -- note that this is stored as a string

	//Make player's play uppercase for ease of comparison

	//Generate computer's play (0,1,2). Use the Math.random() method

	//Translate computer's randomly generated play to string
	if (computerInt == 0)
	    computerPlay = "R";
	else if (computerInt == 1)
	
		//...  Fill in rest of code

	//Print computer's play

	//See who won.  Use nested ifs instead of &&.
	if (personPlay.equals(computerPlay))  
	    System.out.println("It's a tie!");
	else if (personPlay.equals("R"))
	    	   if (computerPlay.equals("S"))
			 System.out.println("Rock crushes scissors.  You win!!");
	    	   else

		//...  Fill in rest of code
    }
}
