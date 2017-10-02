/**
 *This program allows the user to order a pizza
 *
 * @author Connie Huang
 * @version September 12, 2017
 */
import java.util.Scanner;
import java.text.NumberFormat;

public class PizzaOrder
{
    public static void main (String [] args)
    {

        
        Scanner scan = new Scanner (System.in);

        String firstName;                   //user's first name
        boolean discount = false;           //flag, true if user is eligible for discount
        int inches;                         //size of the pizza
        char crustType;                     //code for type of crust
        String crust = "Hand-tossed";       //name of crust
        double cost = 12.99;                //cost of the pizza
        final double TAX_RATE = .08;        //sales tax rate
        double tax;                         //amount of tax
        char choice;                        //user's choice
        String input;                       //user input
        String toppings = "Cheese ";        //list of toppings
        int numberOfToppings = 0;           //number of toppings

        
        System.out.println("\fWelcome to Mike and Diane's Pizza");
        System.out.print("Enter your first name:  ");
        firstName = scan.nextLine();

     

        if (firstName.equalsIgnoreCase("Diane") || firstName.equalsIgnoreCase("Mike"))
        {
            discount = true;
        }

        System.out.println("Pizza Size (inches)   Cost");
        System.out.println("        10            $10.99");
        System.out.println("        12            $12.99");
        System.out.println("        14            $14.99");
        System.out.println("        16            $16.99");
        System.out.println("What size pizza would you like?");
        System.out.print("10, 12, 14, or 16 (enter the number only): ");
        inches = scan.nextInt();

 
        if (inches == 10)
        {
            cost = 10.99;
        }else if (inches == 12){
            cost = 12.99;
        }else if (inches == 14){
            cost = 14.99;
        }else if (inches == 16){
            cost = 16.99;
        }else{
            System.out.println ("\nInvalid size. A 12 inch pizza will be made.\n");
            cost = 12.99;
        }


        System.out.println("What type of crust do you want? ");
        System.out.print("(H)Hand-tossed, (T) Thin-crust, or " +
            "(D) Deep-dish (enter H, T, or D): ");
        input = scan.next();
        crustType = input.charAt(0);
        if (crustType == 'h' ||crustType =='H')
            crust = "Hand-tossed";
        else if (crustType == 't' ||crustType =='T')
            crust = "Thin-crust";
        else if (crustType == 'd' ||crustType =='D')
            crust = "Deep-dish";
        else
            System.out.println ("Invalid input. A Hand-tossed pizza will be made.");
        
        System.out.println("All pizzas come with cheese.");
        System.out.println("Additional toppings are $1.25 each,"
                +" choose from");
        System.out.println("Pepperoni, Sausage, Onion, Mushroom");

        System.out.print("Do you want Pepperoni?  (Y/N):  ");
        input = scan.next();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Pepperoni ";
        }
        System.out.print("Do you want Sausage?  (Y/N):  ");
        input = scan.next();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Sausage ";
        }

        System.out.print("Do you want Onion?  (Y/N):  ");
        input = scan.next();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Onion ";
        }
        System.out.print("Do you want Mushroom?  (Y/N):  ");
        input = scan.next();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Mushroom ";
        }
       
        cost = cost + (1.25*numberOfToppings);

       
        System.out.println();
        System.out.println("Your order is as follows: ");
        if (inches == 10 || inches ==12||inches ==14 || inches==16)
            System.out.println(inches + " inch pizza");
        else
            System.out.println("12 inch pizza");
        System.out.println(crust + " crust");
        System.out.println(toppings);

        
        if (discount == true)
        {
            System.out.println ("\nCongratulations! Because your name is " + firstName +
                                ", you are eligible for a " +"$2.00 discount.\n");
            cost = cost - 2.0;
        }

        NumberFormat total = NumberFormat.getCurrencyInstance();
      
        System.out.println("The cost of your order is: " + total.format(cost));

        tax = cost * TAX_RATE;
        System.out.println("The tax is:  " + total.format(tax));
        System.out.println("The total due is:  " + total.format(tax+cost));

        System.out.println("Your order will be ready for pickup in 30 minutes.");
    }
}
