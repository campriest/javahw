//Cameron Priestley
//10/02/16  
//Problem 1B  

import java.util.Scanner;
public class Problem1b
{
   public static void main(String[] args){
    Scanner scnr   =      new Scanner(System.in);
    int numberIn   =      0;
    int sumTotal   =      1;
    
    
    
    
 do{

    System.out.println("Please enter a positive number!");
    numberIn = scnr.nextInt();
    
    
     if(numberIn < 1){
         System.out.println("Invalid");
         System.out.println("Please try again!");
         System.out.println("Please enter a positive number!");
         numberIn = scnr.nextInt();
         
       }
    
        for(int i = 1; i <= numberIn; i++){
            sumTotal = sumTotal * i;
        }
            System.out.println(numberIn + "! = " + sumTotal);
            sumTotal = 1;
    }while(numberIn >= 1);
    
    
    
    
    
    
   
}
}
