//Cameron Priestley
//11/27/16

// -i: int
// -j: int
// -total: int
// -average: double 
// -counter: int 

// +Int2DArray(): int
// +getTotao(): int
// +getAverage(): double 
// +getRowTotal(): int
// +getColumnTotatal(): int
// +getHighestInRow(): int
// +getLowestInRow(): int

public class Int2DArray
{
    private int i = 0;
    private int j = 0;
    private int total = 0;
    private double average = 0;
    private int counter = 0 ;
    
    //private int [][] iarray = {{2, 1, 9},
          //  {7, 3, 4},
           // {5, 6, 8}};
    
     private int [][] iarray;
   
    public Int2DArray(int [][] nowIarray)
    {
        
         iarray = nowIarray;
        
        
       
    }

    public int getTotal(){
        
        
        
        for(i = 0; i<iarray.length; i++){
            
            for(j = 0; j < iarray[i].length; j++){
                
                
                 total += iarray[i][j];
                
                
                
            }
            
            
            
        }
    
            return total;
        
        
    }
    
    public double getAverage(){
       double nowAverage = 0;
        for(i = 0 ; i < iarray.length; i++){
            for(j = 0; j < iarray[i].length; j++){
                
                counter++;
            
                average = (average + iarray[i][j]);
                    
            
            }
       
            
        
        
        
        }
            nowAverage = average/counter;
            return nowAverage;
       
       }
       
       public int getRowTotal(int totalRow){
        
           int total = 0;
           
           
           
            for(i = 0; i < iarray[totalRow].length; i++){
            
                total = total + iarray[totalRow][i];
            
            
            }
        
            
            return total;
            
            
        
        }
        
       public int getColumnTotal(int totalColumn){
           int total = 0;
           
           
           
           
           for(i= 0; i< iarray.length; i++){
            
               for(j = 0; j < iarray[i].length; j++){
                
                   if(j == totalColumn){
                    
                    
                       total += iarray[i][j];
                       
                    
                    }
                
                }
            
            
            
            
            }
           
        
            return total;
        }
        
        public int getHighestInRow(){
            
            int highest = iarray[0][0];
            
            for(i = 0; i < iarray.length; i++){
            
                for(j = 0 + 1; j < iarray[i].length; j++){
                
                    if(iarray[i][j] > highest){
                    
                        
                     highest = iarray[i][j];   
                    
                    
                    
                    }
                
                
                
                }
            
            
            }
                
                return highest;
            
            
        }
        
        
        public int getLowestInRow(){
            
            int lowest = iarray[0][0];
            
            for(i = 0; i < iarray.length; i++){
            
                for(j = 0 +1; j < iarray[i].length; j++){
                
                    if(iarray[i][j] < lowest){
                    
                        
                     lowest = iarray[i][j];   
                    
                    
                    
                    }
                
                
                
                }
            
            
            }
                
                return lowest;
            
            
        }
    
    
    
    
    
}


    
  

