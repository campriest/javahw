
//Cameron Priestley
//09/25/16

import java.util.Scanner;
import java.text.DecimalFormat;

public class Problem7week3
{
   public static void main(String[] args){
      
      double moneyEnter =     0.0; 
      
      Scanner scnr      =     new Scanner(System.in);
      DecimalFormat c   =     new DecimalFormat("#0.##");
      
      System.out.println("Enter the amount of money you want change for!");
      
      moneyEnter        =     scnr.nextDouble();
      
      double dollars = (moneyEnter / 100) *100;
      double dollarAmount = Math.floor(dollars);
      System.out.println(dollarAmount + " dollars");
      
      double quaters = Double.valueOf(c.format((dollars - dollarAmount)));
      double quaterAmount = Double.valueOf(c.format((quaters / .25)));
      double quaterTotal = Math.floor(quaterAmount);
      System.out.println(quaterTotal + " quaters");
      
      double dimes = Double.valueOf(c.format((quaters  % .25)));
      double dimeAmount = Double.valueOf(c.format((dimes / .10)));
      double dimeTotal = Double.valueOf(c.format(Math.floor(dimeAmount)));
      System.out.println(dimeTotal + " dimes");
      System.out.println(dimeAmount + "Test");
      
      
      double nickles = Double.valueOf(c.format((dimeAmount - dimeTotal)));
      double nickleTotal = Double.valueOf(c.format((nickles % .05)));
      double nickleAmount = Double.valueOf(c.format(nickleTotal / .05));
      
      //double nickleTotal = Math.floor(nickles);
      
      System.out.println(nickleAmount + " nickles");
      
      
      double cents = Double.valueOf(c.format(((quaters - (quaterTotal* .25)))));
      double centsTwo = Double.valueOf(c.format((cents - (dimeTotal * .10))));
      double centsThree = Double.valueOf(c.format((centsTwo - (nickleAmount * .05))));
      
      double centAmount = Double.valueOf(c.format((centsThree/ .01)));
      
      System.out.println(centAmount + " cents");
        
        //double centsTotal = Double.valueOf(c.format((cents % .01)));
        //double centsAmount = Double.valueOf(c.format((centsTotal / .01)));
        
        
      
      
      
    

      
     
      
      
      
       
       
       
    
    
    
    }
}
