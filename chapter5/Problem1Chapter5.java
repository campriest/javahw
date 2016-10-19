//Cameron Priestley
//10/16/16
//Problem 1

import java.util.Scanner;

public class Problem1Chapter5
{

    public static double calculateRetail(double wholeSale, double markUp){

        double sum = wholeSale * (markUp/100);

        double wholeSum = wholeSale + sum;

        return wholeSum;
    
    }

    
    public static void main (String [] args){

        Scanner scan     = new Scanner(System.in);
        double wholeSale = 0.0;
        double markUp    = 0.0;
        double retailPrice = 0.0;

        System.out.println("Please enter wholesale price: ");
        wholeSale = scan.nextDouble();
        System.out.println("Plese enter markup percentage: ");
        markUp = scan.nextDouble();

        retailPrice = calculateRetail(wholeSale, markUp);

        System.out.printf("Item's retail price: $%.2f\n", retailPrice);

    }

    
    
    
}
