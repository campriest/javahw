//Cameron Priestley
//10/16/16
//Problem 2

import java.util.Scanner;

public class Problem2Chapter5
{

    
    public static void main(String[] args)
    {

        double length, // The rectangle&#39;s length
        width, // The rectangle&#39;s width
        area; // The rectangle&#39;s area

        // Get the rectangle&#39;s length from the user.

        length = getLength();

        // Get the rectangle&#39;s width from the user.
        width = getWidth();
        // Get the rectangle&#39;s area.
        area = getArea(length, width);
        // Display the rectangle data.
        displayData(length, width, area);

    }

    public static double getLength(){
        System.out.println("Enter rectangle's length: ");
        Scanner scan = new Scanner(System.in);
        double answer = scan.nextDouble();

        return answer;

    }
    public static double getWidth(){
        System.out.println("Enter rectangle's width: ");

        Scanner scan = new Scanner(System.in);
        double answer = scan.nextDouble();
        return answer;

    }
    public static double getArea(double length, double width){
        double area = length * width;

        return area;

    }
    public static void displayData(double length, double width, double area){
        System.out.println("Rectangle length is " + length);
        System.out.println("Rectangle width is " + width);
        System.out.println("Rectangle area is " + area);

    }
}
