//Cameron Priestley
//09-25-16
import java.util.Scanner;

public class Problem2{
    
public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    
    int numberEnter = 0;
    
    numberEnter = scnr.nextInt();
    
    System.out.println("Please enter number within the range of 1 through 10");
    
    if(numberEnter == 1){
    
        System.out.println("I");
    
    
    } else if (numberEnter == 2){
        
        System.out.println("II");
    
    
    } else if (numberEnter == 3) {
        
        System.out.println("III");
    
    } else if (numberEnter == 4) {
        
        System.out.println("IV");
    
    
    } else if ( numberEnter == 5) {
    
        System.out.println("V");
    } else if ( numberEnter == 6) {
        System.out.println("VI");
    
    
    
    } else if ( numberEnter ==7) {
    
        System.out.println("VII");
    
    } else if ( numberEnter == 8){
        System.out.println("VIII");
    
    } else if (numberEnter ==9) {
        System.out.println("IX");
    
    
    } else if (numberEnter ==10){
        System.out.println("X");
    
    
    } else if ( numberEnter < 1 || numberEnter > 10) {
    
        System.out.println("Invalid Entry");
    
    }
   
    
    
    
    
    
    
    
    }
}
