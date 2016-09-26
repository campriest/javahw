
//Cameron Priestley
//09-25-16
import java.util.Scanner;



public class Problem5
{
   public static void main(String[] args){
       
       
       
       String colorOne   = "";
       String colorTwo   = "";
       
       
        
       
       
       
      colorQuestion(colorOne, colorTwo);
        
        
       
       
       
       
    
    
    
    }
    
      static void colorQuestion(String colorOne, String colorTwo){
       
       System.out.println("Please enter two primary colors to get the secondary color : ");
         
         Scanner colorScan = new Scanner(System.in);
           
       while(!colorOne.equals("red") || !colorOne.equals("yellow") || !colorOne.equals("blue") || !colorTwo.equals("red") || !colorTwo.equals("yellow") || !colorTwo.equals("blue")){
       
         colorOne =  colorScan.next();
         colorTwo =  colorScan.next();
       
       
         if(colorOne.equals("red") && colorTwo.equals("blue") || colorOne.equals("blue") && colorTwo.equals("red")){
        
           System.out.println("You get purple!");
           
           
        
        }else if(colorOne.equals("red") && colorTwo.equals("yellow") || colorOne.equals("yellow") && colorTwo.equals("red") ){
        
             System.out.println("You get orange!");
             
             
        }else if(colorOne.equals("blue") && colorTwo.equals("yellow") || colorOne.equals("yellow") && colorTwo.equals("blue")){
        
            System.out.println("You get green!");
            
            
        } else if(!colorOne.equals("red") || !colorOne.equals("yellow") || !colorOne.equals("blue") || !colorTwo.equals("red") || !colorTwo.equals("blue") || !colorTwo.equals("yellow")){
        
            System.out.println("Invalid colors!");
            System.out.println("Please try again!");
            
               
                
            
        } 
       
        
   
        
        }
    }
       
    
    
}
