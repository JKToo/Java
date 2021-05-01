import java.util.Scanner;

public class BankCharges
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is the number of checks written for this month?");
		double check = input.nextDouble();
	   
      double check1 = (check * .10) + 10;
      double check2 = check * .08;
      double check3 = check * .06;
      double check4 = check * .04;
      double fee = 10;
      double fee1 = check1 + fee;
      double fee2 = check2 + 10;
      double fee3 = check3 + 10;
      double fee4 = check4 + 10;
      
      if (check < 20){
      System.out.println("Your bank's service fee (including the $10 fee) for the month is $" + check1);
			            }
      
      if (check <= 39 && check > 20){
      System.out.println("Your bank's service fee (including the $10 fee) for the month is $" + fee2);
			            }
                     
      if (check >= 59){
      System.out.println("Your bank's service fee (including the $10 fee) for the month is $" + fee3);
			            }
                     
      if (check >= 60){
      System.out.println("Your bank's service fee (including the $10 fee) for the month is $" + fee4);
			            }
		
	}
}
