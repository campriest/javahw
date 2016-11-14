//Cameron Priestley
//11/13/2016
/*
 * Circle (Class)
 * 
 * Fields:
 * radius: double
 * PI : double
 * 
 * Methods: 
 * +Circle(): double
 * +Circle(nowRadius, double)
 * +getRadius(): double
 * +setRadius(newRadius, double): void
 * +getArea(): double
 * +getDiameter(): double
 * +getCircumference(): double
 * 
 * 
 */

import java.util.*;

public class Circle
{
    
    private double radius;
    private final double PI = 3.14159;
    
    
    public Circle(){
    
    double radius = 0.0;
    
    }
    public Circle(double nowRadius)
    {
       
        
      double radius = nowRadius;
        
    }

    
   
    
    public double getRadius(){
    
    return radius;
    
    }
    
    
    public void setRadius(double newRadius){
    
    radius = newRadius;
    
    
    
    }
    
    public double getArea(){
    
     double area = PI * radius * radius;
        
        
     return area;
     
   }
    public double getDiameter(){
    
    double diameter = radius * 2;
    
    return diameter;
    
    
    }
    
    public double getCircumference(){
    
    double circumference = 2 * PI * radius;
    
    return circumference;
    
    
    }
    
  
    
    
  
}
