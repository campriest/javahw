
//Cameron Priestley 
//11/27/16


public class Int2DArrayDriver
{
    public static void main(String[] args){
        int [][] cArray = {{2,1,9},{7,3,4},{5,6,8}};
        
        Int2DArray sea = new Int2DArray(cArray);
        
        
        
        
        System.out.println(sea.getTotal());
        System.out.println(sea.getAverage());
        System.out.println(sea.getRowTotal(2));
        System.out.println(sea.getColumnTotal(0));
        System.out.println(sea.getHighestInRow());
        System.out.println(sea.getLowestInRow());
        
        
        
    }
}
