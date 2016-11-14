//Cameron Priestley
//11/13/2016
/* TestScore(Class)
 * 
 * Fields: 
 * id: int
 * testOne: double
 * testTwo: double
 * testThree: double
 * 
 * Methods: 
 * +TestScore(newId: int, newTestOne: double, newTestTwo: double, newTestThree: double)
 * +getOne(): double
 * +setOne(nowOne: double): void
 * +getTwo(): double
 * +setTwo(nowTwo: double): void 
 * +getThree(): double
 * +setThree(nowThree: double): void
 * +getAverage(): double
 * +printTestMethod(): void
 * 
 * 
 * 
 * 
 * 
 */

import java.util.*;
public class TestScore
{
   
    private int id           = 0;
    private double testOne   = 0;
    private double testTwo   = 0;
    private double testThree = 0;
    
    
     
    public TestScore(int newId, double newTestOne, double newTestTwo, double newTestThree)
    {
        id        = newId;
        testOne   = newTestOne;
        testTwo   = newTestTwo;
        testThree = newTestThree;
        
    }
    
    public double getOne(){
    
    return testOne;
    
    }
    
    public void setOne(double nowOne){
    
        testOne = nowOne;
    
    }
    
    public double getTwo(){
    
        
      return testTwo;
    
    
    
    }
    
    public void setTwo(double nowTwo){
    
    
        testTwo = nowTwo;
    
    }
    
    public double getThree(){
        
        return testThree;
    
    
    }
    
    public void setThree(double nowThree){
    
        testThree =  nowThree;
    
    }
    public double getAverage(){
        
        double average = (testOne + testTwo + testThree)/3;
        
        return average;
    
    
    }
    
    public void printTestMethod(){
    
        
        System.out.printf(id +  "\t" + testOne +  "\t\t"+ testTwo +  "\t\t" + testThree + "\t\t" + "%.2f\n", getAverage());
        
    
    }
 
   
    
}
