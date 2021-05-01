import java.util.Scanner;

public class Retail
{
   public static void main (String [] args)
   {
      double retail, x, y;
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the item's wholesale cost: ");
      x = input.nextDouble();
      
      System.out.println("Enter the item's markup percent cost: ");
      y = input.nextDouble();
      
      retail = calculateRetail(x, y);
      System.out.println("Retail is $" + retail);
   }
   
   public static double calculateRetail(double x, double y)
   {
      double retail;
     retail = (y / 100) * x + x;
      
      return retail;
     }
}
      
