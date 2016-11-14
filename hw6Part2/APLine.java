//Cameron Priestley
//11/13/2016



/*
 * APLine (Class)
 * 
 * Fields: 
 * a: int
 * b: int 
 * c: int
 * 
 * Methods: 
 * +APLine(nowA: int, nowB: b, nowC: c)
 * +getSlope()
 * +getIsOnLine(pointA: double, pointB: double)
 * 
 * 
 * 
 */
import java.util.*;

public class APLine
{

    private int a;
    private int b;
    private int c;

    public APLine(int nowA, int nowB, int nowC)
    {

        a = nowA;
        b = nowB;
        c = nowC;

    }

    public double getSlope(){
        double newA = -1 * a;

        double slope = (newA/b);

        return slope;
    }

    public boolean getIsOnLine(double pointA, double pointB){

        double lineA = (a * pointA) + (b * pointB) + (c);

        if(lineA == 0){

            return true;

        }
        else {

            return false;

        }

    }
    
}
