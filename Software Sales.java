/*
A software company sells a package that retails for $99. Quantit> discounts arc given according to the following tahlc: Quantity
Discount 10-19 20-49 50-99 100 or more
20% 30% 40% 50%
Write a program that asks the user to enter the number of packages purchased. The program should then display the amount of the discount
 lif
 any) and the total Amount of
 the
purchase after the discount
_____________________________________________________________________________________________________________________________________
*/

import java.util.Scanner;

public class SoftwareSales
{
	public static void main (String [] args)
	{
		double packages;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number of packages bought");
		packages = input.nextDouble();
		
		double Tpackage = packages * 99;
		double total1 = Tpackage * .2;
		double total2 = Tpackage * .3;
		double total3 = Tpackage * .4;
		double total4 = Tpackage * .5;
		
		
		if (packages >= 10 && packages <= 19) {
		System.out.println("You get a discount of 20%, therefore, your total is $" + total1);
														  }
														  
														  
		if (packages >= 20 && packages <= 49) {
		System.out.println("You get a discount of 30%, therefore, your total is $" + total2);
														  }
														  
														  
		if (packages >= 50 && packages <= 99) {
		System.out.println("You get a discount of 40%, therefore, your total is $" + total3);
														  }
		if (packages >= 100) {
		System.out.println("You get a discount of 50%, therefore, your total is $" + total4);
								   }
	}
}
		
		
