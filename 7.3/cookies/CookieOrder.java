
package cookies;

public class CookieOrder
{
        private String type;
        private int boxes;
      /** Constructs a new CookieOrder object. */
      public CookieOrder(String variety, int numBoxes)
      { /* implementation not shown */

                type      = variety;
                boxes     = numBoxes;

      }

      /** @return the variety of cookie being ordered
      */
      public String getVariety()
      { /* implementation not shown */


          return type;
      }

      /** @return the number of boxes being ordered
      */
      public int getNumBoxes()
      { /* implementation not shown */


          return boxes;
      }

// There may be instance variables, constructors, and methods that are not shown.
}
