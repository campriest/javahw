//Cameron Priestley


package phonebook;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


import phonebook.*;


public class PhoneBookEntry  {


        private String phoneNumber;
        private  String name;
        private int id;

        public PhoneBookEntry(String nowName, String nowNumber){

            this.phoneNumber = nowNumber;
            this.name        = nowName;




        }
        public String getName(){



            return name;

        }

        public String getNumber(){

            return phoneNumber;


        }








}
