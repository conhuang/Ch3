
/**
 * Write a description of class Guess here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;

public class Guess
{
    public static void main(String[] args)
    {
      int numToGuess;       //Number the user tries to guess
      int guess;            //The user's guess

	Scanner scan = new Scanner(System.in);
	Random generator = new Random();

	numToGuess = generator.nextInt(10) + 1;//randomly generate the  number to guess

	System.out.println ("\fI am thinking of a number from 1 to 10...\n"+
	                    "Enter your guess: ");
	guess = scan.nextInt();
	//read in guess
        int counth = 0, countl = 0, count = 0;        
	while ( guess != numToGuess )  //keep going as long as the guess is wrong
        {
	    if (guess>=1 && guess<=10)
	    {
	        if(guess>numToGuess){
	               System.out.print ("Too high, guess again: ");
	               guess = scan.nextInt();
	               counth++;
	        }else{
	               System.out.print ("Too low, guess again: ");
	               guess = scan.nextInt();
	               countl++;
	        }
	    }
	    else{
	        System.out.print ("Outside range, guess again from 1 to 10: ");
	        guess = scan.nextInt();
	        count++;
	       }
	}
	System.out.println ("You got it! You attempted " + (count + counth +countl)
	                       + " times!\n" + counth + " guesses were too high."+
	                       "\n" + countl + " guesses were too low.");
	if (count>0)
	   System.out.println (count +" guesses were out of range.");

	//print message saying guess is right
    }
}

    

    

 