//Cameron Priestley
//10/02/16
//Problem 1
import java.util.Scanner;

public class Problem1
{
    public static void main(String[] args){
    Scanner scnr      = new Scanner(System.in);
    int answer        = 0;
    int sum           = 0;
    int sumTotal      = 0;
    
   
    System.out.println("Please enter a positive number");
        answer = scnr.nextInt();
    
    do{
        if(answer < 1){
        System.out.println("Invalid. Please Enter a positive number!");
        
        }else {
       
       sumTotal = sumTotal + sum; 
       sum++;
       
    
       
    }
    
   }while(sum <= answer);
      
       System.out.println("sum equals " + sumTotal);
       
    
    
    
    
    
    
    }

    
   
}
