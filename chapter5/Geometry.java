//Cameron Priestley
//10/16/16
//Lab Task 1/2/3
 

import java.util.Scanner;
import java.lang.Math.*;
import static java.lang.Math.PI;



public class Geometry
{
    public static void main (String [] args)
    {
        int choice;         //the user's choice
        double value = 0;   //the value returned from the method
        char letter;        //the Y or N from the user's decision to exit
        double radius;      //the radius of the circle
        double length;      //the length of the rectangle
        double width;       //the width of the rectangle
        double height;      //the height of the triangle
        double base;        //the base of the triangle
        double side1;       //the first side of the triangle
        double side2;       //the second side of the triangle
        double side3;       //the third side of the triangle

        //create a scanner object to read from the keyboard
        Scanner keyboard = new Scanner (System.in);

        //do loop was chose to allow the menu to be displayed first
        do
        {
            //call the printMenu method
            printMenu();

            choice = keyboard.nextInt();

            switch (choice)
            {
                case 1:
                System.out.print("Enter the radius of the circle:  ");
                radius = keyboard.nextDouble();
                //call the circleArea method and store the result in the value variable     
                value =  circleArea(radius);

                System.out.printf("The area of the circle is %.2f\n",value);
                break;
                case 2:
                System.out.print("Enter the length of the rectangle:  ");
                length = keyboard.nextDouble();
                System.out.print("Enter the width of the rectangle:  ");
                width = keyboard.nextDouble();
                //call the rectangleArea method and store the result in the value variable
                value = rectangleArea(length, width);

                System.out.printf("The area of the rectangle is %.2f\n", value);
                break;
                case 3: 
                System.out.print("Enter the height of the triangle:  ");
                height = keyboard.nextDouble();
                System.out.print("Enter the base of the triangle:  ");
                base = keyboard.nextDouble();
                //call the triangleArea method and store the result in the value variable
                value = triangleArea(base, height);
                System.out.printf("The area of the triangle is %.2f\n", value);
                break;
                case 4:
                System.out.print("Enter the radius of the circle:  ");
                radius = keyboard.nextDouble();
                //call the circumference method and store the result in the value variable

                value = circleCircumference(radius);

                System.out.printf("The circumference of the circle is %.2f\n", value);
                break;
                case 5:
                System.out.print("Enter the length of the rectangle:  ");
                length = keyboard.nextDouble();
                System.out.print("Enter the width of the rectangle:  ");
                width = keyboard.nextDouble();
                //call the perimeter method and store the result in the value variable

                System.out.printf("The perimeter of the rectangle is %.2f\n", value);
                break;
                case 6:
                System.out.print("Enter the length of side 1 of the triangle:  ");
                side1 = keyboard.nextDouble();
                System.out.print("Enter the length of side 2 of the triangle:  ");
                side2 = keyboard.nextDouble();
                System.out.print("Enter the length of side 3 of the triangle:  ");
                side3 = keyboard.nextDouble();
                //call the perimeter method and store the result in the value variable
                value = trianglePerimeter(side1, side2, side3);

                System.out.println("The perimeter of the triangle is " + value);
                break;
                default:
                System.out.println("You did not enter a valid choice.");
            }   
            keyboard.nextLine(); //consumes the new line character after the number                     
            System.out.println("Do you want to exit the program (Y/N)?:  ");
            String answer = keyboard.nextLine();
            letter = answer.charAt(0);
        }while (letter != 'Y' && letter != 'y');

    }

    public static void printMenu(){

        System.out.println("This is a geometry calculator");
        System.out.println("Choose what you would like to calculate");
        System.out.println("1. Find the area of a circle");
        System.out.println("2. Find the area of a rectangle");
        System.out.println("3. Find the are of a triangle");
        System.out.println("4. Find the circumference of a cirlce");
        System.out.println("5. Find the perimeter of a rectangle");
        System.out.println("6. Find the perimteter a triangle");

          
          
    }
    public static double circleArea(double radius){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    public static double rectangleArea(double length, double width){
        double area = length * width;
        return area;

    }
    public static double triangleArea(double base, double height){
        double area = (base * height)/2; 
        return area; 
    }
    public static double circleCircumference(double radius){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public static double rectanglePerimeter(double length, double width){

        double perimeter = (2*length) + (2* width);

        return perimeter;

    }
    public static double trianglePerimeter(double side1, double side2, double side3){
        double perimeter = side1 + side2 + side3;
        return perimeter;
    
    }

          
        
}