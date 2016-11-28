
//Cameron Priestley
//11/27/16
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class NameSearchDriver
{
    
    public static void main(String[] args) throws IOException{
        NameSearch b = new NameSearch();
        NameSearch a = new NameSearch();
        File boys         = new File("BoyNames.txt");
        File girls        = new File("GirlNames.txt");
        Scanner inputFile = new Scanner(boys);
        Scanner inputTwo  = new Scanner(girls);
       
       ArrayList<String> list = new ArrayList<String>();
       ArrayList<String> listTwo = new ArrayList<String>();
   
        
        
     while(inputFile.hasNext()){
        
        list.add(inputFile.nextLine());
        listTwo.add(inputTwo.nextLine());
        
        }
       
       inputFile.close();
       inputTwo.close();
      
      
       b.lookUp("James", list);
       System.out.println();
       a.lookUp("Sarah", listTwo);
       
    }
    
    
   
}
