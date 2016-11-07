//Cameron Priestley
//11/06/16

public class EmployeeCreate
{
    
     public static void main(String[] args){
        
        
        Employee susan = new Employee("Susan Meyers", 47899, "Accounting", "Vice president"); 
        Employee mark  = new Employee("Mark Jones", 39119, "IT", "Programmar");
        Employee joy   = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        
        System.out.println("Name"+ "\t\t" + "ID Number" + "\t" + "Department" + "\t" + "Position");
        System.out.println(susan.getName() + "\t" + susan.getID() + "\t\t" + susan.getDepartment() + "\t" + susan.getPosition());
        System.out.println(mark.getName()  + "\t" + mark.getID() + "\t\t" + mark.getDepartment() + "\t\t" + mark.getPosition());
        System.out.println(joy.getName() + "\t" + joy.getID() + "\t\t" + joy.getDepartment() + "\t" + joy.getPosition());
        
        
        
        
    }
    
    
    
    
}
