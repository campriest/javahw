//Cameron Priestley
//09-19-16

import java.util.Scanner;

public class Problem3
{
    
   public static void main(String[] args){
    
       Scanner scanNow = new Scanner(System.in);
       
       int testOne   = 0;
       int testTwo   = 0;
       int testThree = 0;
       
       System.out.println("Please enter three test scores : ");
       
       testOne = scanNow.nextInt();
       testTwo = scanNow.nextInt();
       testThree = scanNow.nextInt();
       
       int[] testScores = { testOne, testTwo, testThree};
       
        for(int i = 0; i < testScores.length; i++){
            
            if(testScores[i] >= 90 && testScores[i] <= 100){
            
                    System.out.println(testScores[i] + " = A");
                
            } else if (testScores[i] >= 80 && testScores[i]<=89){
                
                    System.out.println(testScores[i] + " = B");
            
            } else if(testScores[i] >= 70 && testScores[i] <= 79){
            
                    System.out.println(testScores[i] + " = C");
            
            }else if(testScores[i] >= 60 && testScores[i] <= 69){
            
                    System.out.println(testScores[i] + " = D");
                    
            } else if(testScores[i] >= 50 && testScores[i] <= 59){
                    System.out.println(testScores[i] + " = F");
            
            
            } else if(testScores[i] < 50){
                
                System.out.println("Failure");
            
            }
       
      
       
    }
    
    
    
    
    }
   

   
  
}
