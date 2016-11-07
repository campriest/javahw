
//Cameron Priestley
//11/06/2016

public class CarCreate
{
    public static void main(String[] args){
    
        Car blue = new Car(1990, "BMW 328i");
        for(int i =0; i<= 4; i++){
            blue.accelerate();
        }

        System.out.println("Current speed: " + blue.getSpeed());
        
        for(int j = 0 ; j<=4; j++){
        
            blue.brake();
        
        }
        
        System.out.println("Current speed: " + blue.getSpeed());
    }
    
}
