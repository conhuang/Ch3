
/**
 * Write a description of class Chars here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Chars
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\fPlease enter a string of characters: ");
        String x = scan.nextLine();
        int k = 0, length = x.length();
        while (length > 0){
            System.out.println (x.substring(k,(k+1)));
            k++;
            length--;
        }    
    }   
}