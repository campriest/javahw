//Cameron Priestley
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

// i: int
// +lookUp(): void 
// +find(): void 




public class NameSearch 
{
    int i = 0;
    
     
    
    public NameSearch()
    {
        
        
        
       
    }
   
    
    public void lookUp(String name, ArrayList now){
    
      for(int i = 0; i < now.size(); i++){
        
          if(now.get(i).equals(name) ){
            
              System.out.print("It's a Match: " + now.get(i) );
            
            
            }
        
            
            
        
        }
            
        
        
    }
    
    
    public void  find(String name, ArrayList now){
    
    
        for(i = 0 ; i < now.size(); i++){
            
            if(now.get(i).equals(name)){
        
                System.out.print("Found! " + now.get(i));
        
        
            }
        }
    
           
    }
    
    
    
    
}
