//Cameron Priestley
//11/21/16
// 
// -total: double
// -average: double
// -all: double 
// 
// +getTotalRainFall(): double
// +getRainAveFall(): double
// +getMostMonth(): double
// +getLeastMonth(): double
// +printMonth(): void


public class Rainfall

{
    private double total   = 0;
    private double average = 0;
    private double all     = 0;

   
    String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    double[] rain = {0.40, 0.94, 3.21, 3.74, 1.73, 1.03, 1.27, 2.58, 6.98, 6.90, 2.80, 2.53};
    int i = 0;
    double most         = rain[0];
    double least        = rain[0];

    public Rainfall()
    {

        
    }
    public double getTotalRainFall(){
        for(i = 0; i<rain.length; i++){
            total = total + rain[i];
        }

        return total;

    }
    
    public double getAveRainFall(){

        for(i= 0; i<rain.length; i++){

            average = average + rain[i];

        }
        double newAve = average/12;

        return newAve;

    }
    
    public double getMostMonth(){

        
        for(i = 0; i< rain.length; i++){
            
            if(rain[i] > most){
                most = rain[i];
            
            
                
            }
        
        }

        return most;

    }
    
    public double getLeastMonth(){

        for(i = 0; i < rain.length; i++){

            if(rain[i] < least){

                least = rain[i];

            }
        
        }

        
        return least;

    }

    public void printMonth(){

        for(i = 0; i < rain.length; i++){

            System.out.println(months[i] + "\t\t" + rain[i]);

        }

    }
   
}
