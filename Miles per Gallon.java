import java.util.Scanner;
public class MPG
{
   public static void main (String [] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number of miles & gallons of gas used:");
     
      int miles = input.nextInt();
      int gas = input.nextInt();
      
      int mpg = miles / gas;
      
      System.out.println("Your car's miles-per-gallon is " + mpg);
      
   }
}
