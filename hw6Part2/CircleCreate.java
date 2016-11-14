
//Cameron Priestley
//11/13/2016
public class CircleCreate
{
    public static void main(String[] args){
    
    Circle one   = new Circle();
    Circle two   = new Circle();
    Circle three = new Circle();
    Circle four  = new Circle();
    Circle five  = new Circle();
    
    two.setRadius(0.5);
    three.setRadius(1);
    four.setRadius(1.5);
    five.setRadius(2);
    
    System.out.printf("Radius" + "\t\t" + "Diameter" + "\t\t" + "Perimeter" + "\t\t"+ "Area" + "\n");
    System.out.printf(one.getRadius() + "\t\t" + one.getDiameter() + "\t\t\t" + one.getCircumference() + "\t\t\t" + one.getArea() + "\n");
    System.out.printf(two.getRadius() + "\t\t" + two.getDiameter() + "\t\t\t" + two.getCircumference() + "\t\t\t" + two.getArea() + "\n");
    System.out.printf(three.getRadius() + "\t\t" + three.getDiameter() + "\t\t\t" + three.getCircumference() + "\t\t\t" + three.getArea() + "\n");
    System.out.printf(four.getRadius() + "\t\t" + four.getDiameter() + "\t\t\t" + four.getCircumference() + "\t" + four.getArea() + "\n");
    System.out.printf(five.getRadius() + "\t\t" + five.getDiameter() + "\t\t\t" + five.getCircumference() + "\t\t" + five.getArea() + "\n");
    
    
    
    }
}
