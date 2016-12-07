


import cookies.CookieOrder;
import cookies.MasterOrder;


public class CookieDriver
{
    public static void main(String [] args)
    {
        MasterOrder goodies = new MasterOrder();
        goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
        goodies.addOrder(new CookieOrder("Shortbread", 5));
        goodies.addOrder(new CookieOrder("Macaroon", 2));
        goodies.addOrder(new CookieOrder("Chocolate Chip", 3));
        goodies.showOrders();
        System.out.println("Total boxes = " + goodies.getTotalBoxes());

        System.out.println("Removing Chocolate Chip");
        goodies.removeVariety("Chocolate Chip");
        goodies.showOrders();
        System.out.println("Total boxes = " + goodies.getTotalBoxes());
    }
}
