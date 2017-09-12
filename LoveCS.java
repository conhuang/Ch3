
/**
 * Write a description of class LoveCS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class LoveCS
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int num;
        System.out.print("\fHow many times would you like the message \"I love"+
                            " Computer Science!!\" to be printed? ");
        num = scan.nextInt();
        final int LIMIT = 10;
        int count = 1;
        int total = 0;
        while (count <= num){
             System.out.println(count + " I love Computer Science!!");
             count++;
        }
        System.out.print ("Printed this message " + num + " times.");
        for (int x = 1; x <= num; x++)
        {
            total += x;
           
        }
        System.out.println (" The sum of the numbers from 1 to " + num + " is " + total +".");
    }
}
