
//Cameron Priestley


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;



import phonebook.PhoneBookEntry;

public class PhoneBookDriver


{




    public static void main(String[] args){


            ArrayList<PhoneBookEntry> names = new ArrayList<PhoneBookEntry>();



               names.add(new PhoneBookEntry("AAA", "800_222_4357"));
               names.add(new PhoneBookEntry("GMAC", "800_200_4622"));
               names.add(new PhoneBookEntry("Allstate Roadside", "800_869_7997"));
               names.add(new PhoneBookEntry("Sallie Mae", "888_272_5543"));
               names.add(new PhoneBookEntry("USAA", "800_531_2265"));
               names.add(new PhoneBookEntry("Merrill Lynch", "800_637_7455"));


                //System.out.println(names.get(1).getName());

                for(int i = 0; i < names.size(); i++){

                    PhoneBookEntry book = names.get(i);
                        System.out.print(book.getName() + "\t\t" );
                        System.out.println(book.getNumber());



                }





    }



}
