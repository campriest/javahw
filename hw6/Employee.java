//Cameron Priestley
//11/06/2016
/*
 * Employee (Class)
 * 
 * Fields:
 * name: String
 * idNumber: int
 * department: string
 * position: string
 * 
 * Methods: 
 * 
 * +Employee(actualName: string, actualId: int, actualDepartment: string, actualPosition: string)
 * +getName(): String
 * +setName(newName: string): void
 * +getId(): String
 * +setId(newID: string): void
 * +getDepartment(): String
 * +setDepartment(newDepartment: string):  void
 * +getPosition(): String
 * +setPosition(newPosition: string): void 
 * 
 * 
 * 
 * 
 * 
 */

import java.util.*;

public class Employee
{
    
     

    private String name;
    private int idNumber;
    private String department;
    private String position;
      
   
    public Employee(String actualName, int actualId, String actualDepartment, String actualPosition)
    {
            
        
            name                = actualName;
            idNumber            = actualId;
            department           = actualDepartment;
            position            = actualPosition; 
         
     
        
        
        
    }
  
    
    public String getName(){
    
        return name;
    
    }
    
    
    
    
    public void setName(String newName){
    
        name = newName;
        
        
    }
    
    public int getID(){
        
        return idNumber;
        
        
    }
    
    public void setID(int newID){
        idNumber = newID;
    
    }
    
    public String getDepartment(){
        
        return department;
    
    }
    
    
    
    public void setDepartment(String newDepartment){
        
        department = newDepartment;
    
    }
    
    public String getPosition(){
    
        return position;
    
    }
    
    
    
    public void setPosition(String newPosition){
        
        position = newPosition;
        
    
    }
    
   
   
    }
    
    
  
