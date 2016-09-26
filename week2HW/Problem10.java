package hw1;
import java.util.Scanner;
//Cameron Priestley
//09/18/16
//Problem 10

public class Problem10 {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double testOne = 0;
		double testTwo = 0;
		double testThree = 0;
		
		int totalTest = 3;
		
		double testAverage = 0;
		
		testOne = scnr.nextInt();
		testTwo = scnr.nextInt();
		testThree = scnr.nextInt();
		
		testAverage = (testOne + testTwo + testThree) / totalTest;
		
		
		System.out.print("The average of the total test scores : " + testAverage);
		
		
	}
	

}
