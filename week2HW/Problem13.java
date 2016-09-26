
import java.util.Scanner;
import java.text.DecimalFormat;
//Cameron Priestley
//09/18/16
//Problem 13


public class Problem13 {
	public static void main(String[] args) {
		
		Scanner scnrTwo = new Scanner(System.in);
		DecimalFormat c = new DecimalFormat("##.00");
		
			double totalCharge = 0;
			double tax = .085;
			double tip = .15;
			
			double total = 0;
			double taxTotal = 0;
			double tipTotal = 0;
			
			System.out.println("Please enter your total bill: ");
			
			totalCharge = scnrTwo.nextDouble();
			
			taxTotal = totalCharge * tax;
			
			String newTaxTotal = c.format(taxTotal);
			
			System.out.println("Tax is $" + newTaxTotal + ".");
			
			tipTotal = totalCharge * tip;
			
			String newTipTotal = c.format(tipTotal);
			
			System.out.println("Tip is $" + newTipTotal + ".");
			
			
			total = totalCharge + taxTotal + tipTotal;
			
			String newTotal = c.format(total);
			
			System.out.println("Your total charge is $" + newTotal ".");
			
			
			
			
			
			
			
			
			
			
			
			
		
		
	}
	
	

}
