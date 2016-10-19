//Cameron Priestley
//10/02/2016
//Problem 4
import java.util.Scanner;
import java.text.DecimalFormat;

public class Problem4
{
    public static void main(String[] args){
    
        Scanner scnr      = new Scanner(System.in);
        DecimalFormat c   =     new DecimalFormat("#0.##");
        int days          = 0;
        int pennies       = 0;
        int totalSum      = 1;
        int pastSum       = 0;
        int totalPennies  = 0;
        double dollar        = 100;
        double dollarTotal   = 0;
        
        
        do{
        
            System.out.println("Please enter days work!");
            days = scnr.nextInt();
            
                if(days < 1 || days >31){
                    System.out.println("Invalid");
                    System.out.println("Please enter days work!");
                    days = scnr.nextInt();
                    
                 }
                 
                    
                        
                      
                            for( int i = 1; i <= days; i++){
                                
                                    // pastSum = totalSum * (2 ^ (i-1));
                                    totalPennies = i-1;
                                    pastSum = totalSum * (int)Math.pow(2, totalPennies);
                                    
                                    dollarTotal = Double.valueOf(c.format((pastSum/dollar)));
                                    System.out.println("Total amount of days worked : " + days + "\t\t"+ "Total amount of pennies per day: " + pastSum + "\t\t"+ "Total Salary for the day : $" + dollarTotal);
                        
                            }
                            //System.out.println("Total amount of days worked : " + days + "\t\t"+ "Total amount of pennies per day: " + pastSum + "\t\t"+ "Total Salary for the day : $" + dollarTotal);
                            
                            
                           // dollarTotal = Double.valueOf(c.format((pastSum/dollar)));
                           // System.out.println("Total amount of days worked : " + days + "\t\t"+ "Total amount of pennies : " + pastSum + "\t\t"+ "Total Salary for the month : $" + dollarTotal);
                            //System.out.println();
                            
                            
        }while(days >=1 && days <=31);
            
            
            
        
        
        
    
    
    
    }
}
