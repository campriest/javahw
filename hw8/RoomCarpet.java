 



public class RoomCarpet{

    private RoomDimension size;
    private double carpetCost;
    private double total;



public RoomCarpet(double cost, RoomDimension dim){


    carpetCost = cost;
    size = dim;

}

public double getTotalCost(){


    total = carpetCost * size.area();


    return total;

}


public String toString(){

String printNow = String.format("Total cost of Carpet:  $%,.2f", getTotalCost());




return printNow;
}


}
