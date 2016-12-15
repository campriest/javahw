


public class RoomDriver{




        public static void main(String[] args){

            RoomDimension rugOne = new RoomDimension(12,10);
            RoomDimension rugThree = new RoomDimension(12.5, 10.5);
            RoomCarpet rugTwo = new RoomCarpet(8, rugOne);
            RoomCarpet rugFour = new RoomCarpet(10.50, rugThree);

            System.out.println(rugTwo.toString());
            System.out.println(rugFour.toString());



        }



}
