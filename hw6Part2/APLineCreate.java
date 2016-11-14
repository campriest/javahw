//Cameron Priestley
//11/13/2016


public class APLineCreate
{
   public static void main(String[] args){
    APLine line1 = new APLine(5, 4, -17);
    
    double slopeOne = line1.getSlope();
    boolean onLine1 = line1.getIsOnLine(5, -2);
    
    System.out.println(slopeOne);
    System.out.println(onLine1);
    
    
    APLine line2 = new APLine(-25, 40, 30);
    double slopeTwo = line2.getSlope();
    boolean onLine2 = line2.getIsOnLine(5, -2);
    
    System.out.println(slopeTwo);
    System.out.println(onLine2);
    }
}
