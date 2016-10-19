//Cameron Priestley
//10/02/2016
//Problem 10
import java.util.Scanner;
import java.util.ArrayList;


public class Problem10smallest
{
    
 public static void main(String[] args){
    
     Scanner scnr        = new Scanner(System.in);
     ArrayList<Integer> elements = new ArrayList<Integer>();
     
     
     System.out.println("Please enter numbers");
     
     int x = 0;
     while(scnr.hasNextInt()){
         x = scnr.nextInt();
        elements.add(x);
        
            if(x == -99){
                System.out.println("works");
               
                elements.remove(Integer.valueOf(-99));
                //System.out.println("this is list" + elements);
                break;
                
            
            }
        
        }
     int largest         = elements.get(0);
     int smallest        = elements.get(0);
       
         for(int i = 1; i < elements.size(); i++){
            
                        if(elements.get(i) > largest){
                                largest = elements.get(i);
                
                        }  
                        
                
          }
                 
          
          for(int j = 1; j < elements.size(); j++){
            
            
                       if(elements.get(j) < smallest){
            
                           smallest = elements.get(j);
                    }
            
            }
           System.out.println("This is the largest number : " + largest + " and this is the smallest : " + smallest);
     
   }
    
    
    
    
    
}
