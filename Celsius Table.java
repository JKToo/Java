import java.util.Scanner;

public class celsiustable
{
   public static void main (String [] args)
   {
      int cels;
      cels = celcius();
      System.out.println("Celcius is: " + cels);
      System.out.println("Fahr: Cel: " + 
                        "\n 0 : -17.8" +
                        "\n 1 : -17.2" + 
                        "\n 2 : -16.7" +
                        "\n 3 : -17.2" + 
                        "\n 4 : -15.6" +
                        "\n 5 : -15.0" + 
                        "\n 6 : -14.4" +
                        "\n 7 : -13.9" + 
                        "\n 8 : -13.3" +
                        "\n 9 : -12.8" + 
                        "\n 10 : 12.2" +
                        "\n 11 : -11.7" + 
                        "\n 12 : -11.1" +
                        "\n 13 : -10.6" + 
                        "\n 14 : -10.0" +
                        "\n 15 : -9.44" + 
                        "\n 16 : -8.89" +
                        "\n 17 : -8.33" + 
                        "\n 18 : -7.78" +
                        "\n 19 : -7.22" +
                        "\n 20 : -6.67");

      
   }
   
   public static int celcius()
   {
      int c, f;
      
      Scanner input = new Scanner(System.in);
     
      System.out.println("Enter a fahrenheit temp: ");
      f = input.nextInt();
      c = (f - 32) * 5 / 9;

      
      return c;
     }
  }         
