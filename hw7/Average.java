//Cameron Priestley
//11/21/16

import java.util.Scanner;
import java.util.Arrays;

public class Average
{
    Scanner scan = new Scanner(System.in);
    int[] data = new int[5];
    double[] newData = new double[5];
    double mean = 0;

    int i = 0;
    double temp;
    double highest = data[0];
    double newNum;

    int maxIndex;
    int maxValue;
    double []newNumbers = new double[5];
    public Average()
    {

        for( i = 0; i<data.length; i++){

            System.out.println("Please enter score" + (i + 1 ));
            data[i] = scan.nextInt();

        }

        selectionSort();
        calculateMean();
        System.out.println("Total Test scores: " + toString());

    }

    public void calculateMean(){

        double meanNew = 0;
        int counter = 0;
        for(i = 0; i < data.length; i++){

            meanNew = meanNew + data[i];

            counter++;

        }
        mean = meanNew/counter;
        System.out.println("Average Test Score: " + mean);
    }
    public String toString(){
        
        String nowNum = "";
        for(i = 0; i<= newNumbers.length-1; i++){
            nowNum += newNumbers[i] + " ";
            
        }
        return nowNum;
        
    }
    public void selectionSort(){
       
        for (int startScan = 0; startScan < data.length; startScan++)
        {
            maxIndex = startScan;
            maxValue = data[startScan];
            for (int index = startScan + 1; index < data.length; index++)
            {
                if (data[index] > maxValue)
                {
                    maxValue = data[index];
                    maxIndex = index;
                }
            }
            data[maxIndex] = data[startScan];
            data[startScan] = maxValue;
            newNumbers[startScan] = data[startScan];

			
        }
    }

       
    
}
