
//Cameron Priestley
//11/06/2016
public class Television
{
    // instance variables - replace the example below with your own
    private String manufacturer;
    private int screenSize;
    private boolean powerOn = false;
    private int channel = 2;
    private int volume = 20;

    //constructor provides initial attributes when object is created 
    public Television(String newMake, int newSize)
    {
        manufacturer = newMake;
        screenSize   = newSize;
        
        
        
    }

  
    //sets channel
    public void setChannel(int currentChannel){
        
        channel = currentChannel;
    }
    //power on or off
    public void  power(){
        
        powerOn = !powerOn; 
    }
    //volume up
    public int increaseVolume(){
        
       return volume += 1;
    
    }
    //volume down
    public int decreaseVolume(){
        
        return volume -= 1;
    
    }
    
    //gets current channel
    public int getChannel(){
        
        return channel;
    
    }
    
    //gets volume level
    public int getVolume(){
        
        return volume;
    
    }
    public String getManufacturer(){
    
        return manufacturer;
    }
    //gets screensize
    
    public int getScreenSize(){
    
          return screenSize;
    
    }
    
    
}
