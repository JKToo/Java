/* Write a Java program that will ask the user to input an amount; then calculate the tax amount
 * (amount * 0.85. Print the amount and the tax amount. Use a loop to repeat this process 3 times.
 */
 
 import java.util.Scanner;
 import java.text.DecimalFormat;
 import javax.swing.JTextArea;
 import javax.swing.JOptionPane;
 
 public class LoopTaxCalculation2Output
 {
 	public static void main (String[] args)
 	{
 		Scanner       input      = new Scanner ( System.in);
 		DecimalFormat twoDecimal = new DecimalFormat("0.00") ;
 		
 		JTextArea report = new JTextArea(2,2);
 
 		double amount, taxAmount, sum = 0, average, sumTaxAmount=0, averageTaxAmount;
 		int count = 0 ;			// starting action
 		String output = "";
 	
 		while( count < 5 )		// ending action
 		{
 			System.out.println("Enter amount");
 			amount = input.nextDouble();
 			taxAmount = amount * 0.085;
 			
 			output = output + "\nAmount = "+ twoDecimal.format(amount)+ "  Tax Amount = " + twoDecimal.format(taxAmount);
 			
 			sum = sum + amount;						// accumulators
 			sumTaxAmount = sumTaxAmount + taxAmount;
 			count ++;			// kicking action
 		}
 		
 	
 		average = sum / count;
 		averageTaxAmount = sumTaxAmount /count;
 		
 		output = output + "\nThe Total Amount is " + twoDecimal.format( sum);
 		output = output + "The Average Amount is " + twoDecimal.format(average) ;
 		
 		output = output + "\nThe Total Tax Amount is " + twoDecimal.format( sumTaxAmount);
 		output = output + "The Average Tax Amount is " + twoDecimal.format(averageTaxAmount) ;
 		
 		System.out.println ( output);
 		
 		report.append(output);
 		JOptionPane.showMessageDialog(null, report);
 	}
 }	
 		
