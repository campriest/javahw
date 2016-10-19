
//Cameron Priestley
//10/09/2016
import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class Problem3withdraw
{
    public static void main(String[] args) throws IOException{

        File file = new File("Deposits.txt");

        File fileTwo = new File("Withdrawals.txt");
        DecimalFormat c   =     new DecimalFormat("#0.##");

        double sumOne = 0.0;
        double sumTwo = 0.0;

        Scanner inputFile = new Scanner(file);
        Scanner inputFileTwo = new Scanner(fileTwo);

        while(inputFile.hasNext()){

            double number = inputFile.nextDouble();
            double numberTwo = inputFileTwo.nextDouble();

            sumOne = Double.valueOf(c.format(sumOne + number));
            sumTwo = Double.valueOf(c.format(sumTwo + numberTwo));

        
        
        
        }

        inputFile.close();
    
        System.out.printf("The total sum of Deposits : %.2f.\n", sumOne);
        //System.out.println("The total sum of Withdrawals : " + sumTwo);
        System.out.printf("The total sum of Withdrawals : %.2f.", sumTwo);

    }

    
}
