
/**
 * Calculates how many even, odd, or zero digits there are in an integer
 *
 * @author Connie Huang
 * @version Sep 13, 2017
 */
import java.util.Scanner;
public class OddEven
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.print("\fPlease enter a positive integer: ");
        int num = scan.nextInt();
        int even=0, odd=0, zero=0, k=1;
        while (num>0){
            if (num%10 ==0)
                zero++;
            else if (num%2 == 0)
                even++;
            else 
                odd++;
                num = num/10;
        }
        if (even>1 || even==0)
            System.out.println("There are " +even + " even digits.");
        else if(even==1)
            System.out.println("There is 1 even digit.");
        if (odd>1 || odd==0)
            System.out.println("There are " + odd + " odd digits.");
        else if(odd==1)
            System.out.println("There is 1 odd digit.");
        if (zero>1 || zero==0)
            System.out.println("There are " + zero + " zero digits.");
        else if(zero==1)
            System.out.println("There is 1 zero digit.");
            
    }
}