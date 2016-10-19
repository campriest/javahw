
//Cameron Priestley
//10/16/16
//Problem 3

import java.util.Scanner;
public class Problem3Chapter5
{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double tempF = 0.0;
        double tempC = 0.0;

        System.out.println("Enter temperature: ");
        tempF = scan.nextDouble();

        tempC = celsius(tempF);

        System.out.printf("Celsius temperature is %.2f\n",tempC);
        System.out.println("Conversion Table: ");

        for(int i = 32; i<=212; i+=20){

            double conC = celsius(i);
            System.out.printf(i + " degrees fahrenheit equals " +" %.2f\t\n",conC);
        }
    }

    public static double celsius(double tempF){
        double celTemp = (tempF-32)/1.8;

        return celTemp; 
    }
}
