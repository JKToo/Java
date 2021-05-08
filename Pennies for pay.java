Write a program that calculates the amount a person would earn over a period of time if his or her salary is one penny the first day,
two pennies the second day, and continues to double each day. Theprogram should display a table showing 
the salary for each day, and then show the total pay at the end of the period. The output should be displayed in a dollar Problem amount, 
not the number of pennies.
Input Validation: Do not accept a numher less than t for the number of days worked

_____________________________________________________________________________________________________________________________
import java.util.Scanner;

public class Pennies
{
   public static void main (String [] args)
   {
      Scanner input = new Scanner (System.in);
           
      int pennies = 1, days, day = 1, total;
 
      
      System.out.println("Enter a number of days you worked");
      days = input.nextInt();  

         while ( day < days) 
               {
                 pennies = pennies * 2; 
                 day += 1;  
               }
                   
           System.out.println("Your total is $" + pennies);  
      }
}
