
/**
 * Write a description of class Factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Factorial
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.print ("\fEnter a non-negative integer: ");
        int x = scan.nextInt();
        while (x<0){
            System.out.print ("Invalid input. Enter a non-negative number: ");
            x = scan.nextInt();
        }
        while (x>=0){
            int factorial=1;
            int y = x;
            if (y>=1){
                while (y>=1){
                    factorial *= y;
                    y--;
                }
                System.out.println (x + "! = " +factorial);
            }
            else if (y==0){
                System.out.println ("0! = 1");
            }
            System.out.print ("Enter another non-negative integer " + 
                              "(negative number to quit): ");
            x = scan.nextInt();
        }
    }
}