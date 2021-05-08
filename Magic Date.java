import java.util.Scanner;

public class  MagicDate
{
   public static void main (String [] args)
   {
      Scanner input = new Scanner (System.in);
      
      System.out.println("In numeric form, enter a month");
      int month = input.nextInt();
      
      System.out.println("Enter a day");
      int day = input.nextInt();
      
      System.out.println("Enter a two digit year");
      int year = input.nextInt();
      
      int calculation = month * day;
      
      if (calculation == year){
      System.out.println("Your days times month is equal to the years, That's a magic date!");
      }
      
      else{
      System.out.println("That's not a magic date");
      }
      
    }
      
}
