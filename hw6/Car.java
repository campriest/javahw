
//Cameron Priestley
//11/06/2016

/*
 * Car (Class)
 * 
 * Fields: 
 * yearModel: String
 * make: String
 * speed: int
 * 
 * Methods:
 * +Car(newYear: string, newMake: string)
 * +getYear():Int 
 * +setYear(nowYear: int):void
 * +getMake(): String
 * +setMake(nowMake: string):void
 * +getSpeed():Int
 * +setSpeed(nowSpeed: int):void 
 * +accerlate():int
 * +brake():int
 * 
 * 
 * 
 * 
 * 
 */

public class Car
{

    private int yearModel;
    private String make;
    private int speed;

    public Car(int newYear, String newMake){

        yearModel = newYear;
        make      = newMake;
        speed     = 0;

    }
    public int getYear(){
        return yearModel;
    }
    public void  setYear(int nowYear){
        yearModel = nowYear;
    
    }

    public String getMake(){
        return make;

    }
    public void  setMake(String nowMake){
        make = nowMake;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int nowSpeed){
        speed = nowSpeed;
    
    }

    public int accelerate(){
        return speed += 5;

    }
    public int brake(){
        return speed -= 5;

    }
    

}

