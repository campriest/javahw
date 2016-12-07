package cookies;
import java.util.ArrayList;




public class MasterOrder
{
    /** The list of all cookie orders */
    private ArrayList<CookieOrder> orders;

    private int total    = 0;
    private int newTotal = 0;
    private int remove   = 0;
    /** Constructs a new MasterOrder object. */
    public MasterOrder()
    {

        orders = new ArrayList<CookieOrder>();
    }

    /** Adds theOrder to the master order.
     * @param theOrder the cookie order to add to the master order
     */
    public void addOrder(CookieOrder theOrder)
    {
        orders.add(theOrder);


    }

    /** @return the sum of the number of boxes of all of the cookie orders
     */
    public int getTotalBoxes()
    { /* to be implemented in part (a) */



        for(int i = 0; i < orders.size(); i++){

            total = total + orders.get(i).getNumBoxes();



                newTotal = total;


        }

        total = 0;

        return newTotal;
    }

    /** Removes all cookie orders from the master order that have the same variety of
     * cookie as cookieVar and returns the total number of boxes that were removed.
     * @param cookieVar the variety of cookies to remove from the master order
     * @return the total number of boxes of cookieVar in the cookie orders removed
     */

    public int removeVariety(String cookieVar)
    { /* to be implemented in part (b) */

        for(int i = 0 ; i < orders.size(); i++){


            if(cookieVar.equals(orders.get(i).getVariety())){

                orders.remove(orders.get(i));

            } 



        }






            remove++;

            return remove;

    }

    // There may be instance variables, constructors, and methods that are not shown.
    public void showOrders()
    { /* to be implemented */

        for(int i = 0; i < orders.size(); i++){


            System.out.println(orders.get(i).getVariety());



        }

    }


}
