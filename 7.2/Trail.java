//Cameron Priestley
//11/27/16


import java.lang.*;


public class Trail
{
    /** Representation of the trail. The number of markers on the trail is markers.length. */
    private int[] markers;
    
    public Trail(int [] segments)
    {
        markers = segments;
    }
    /** Determines if a trail segment is level. A trail segment is defined by a starting marker,
     * an ending marker, and all markers between those two markers.
     * A trail segment is level if it has a difference between the maximum elevation
     * and minimum elevation that is less than or equal to 10 meters.
     * @param start the index of the starting marker
     * @param end the index of the ending marker
     * Precondition: 0 <= start < end <= markers.length - 1
     * @return true if the difference between the maximum and minimum
     * elevation on this segment of the trail is less than or equal to 10 meters;
     * false otherwise.
     */
    public boolean isLevelTrailSegment(int start, int end)
    { 
        
        if( (end - start) <= 10){
        
            return true;
        
        }else
        
        return false; // replace with your code
    }

    /** Determines if this trail is rated difficult. A trail is rated by counting the number of changes in
     * elevation that are at least 30 meters (up or down) between two consecutive markers. A trail
     * with 3 or more such changes is rated difficult.
     * @return true if the trail is rated difficult; false otherwise.
     */
    public boolean isDifficult(int markerStart, int  markerEnd)
    { /* to be implemented in part (b) */ 
        
        int counter = 0;
       for(int i = markerStart; i < markerEnd; i++){
        
           int dif = markers[i] - markers[markerEnd];
           
           if(Math.abs(dif) >= 30){
            
            counter++;
            System.out.println(counter);
           
            if(counter >= 3){
                
                    return true;
            }
               
            
            }
        
        }
        
           
        
        return false; // replace with your code
    }
    // There may be instance variables, constructors, and methods that are not shown.
}