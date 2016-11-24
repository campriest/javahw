
//Cameron Priestley
//11/21/2016

public class RainfallDriver
{
    public static void main(String[] args){

        Rainfall austin = new Rainfall();

        austin.printMonth();

        System.out.printf("Total" + "\t\t" + "%.2f\n",austin.getTotalRainFall());
        System.out.printf("Average" + "\t\t" + "%.2f\n",austin.getAveRainFall());
        System.out.printf("Most" + "\t\t" + "%.2f\n", austin.getMostMonth());
        System.out.printf("Least" + "\t\t" + "%.2f\n", austin.getLeastMonth());

        
    }
}
