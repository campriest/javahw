


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

import wordlist.WordList;


public class WorldList_Driver
{
    public static void main(String[] args)
    {
        WordList animals = new WordList();
        animals.ad("cat");
        animals.ad("mouse");
        animals.ad("frog");
        animals.ad("dog");
        animals.ad("dog");

        System.out.println(animals);

        System.out.println(animals.numWordsOfLength(4));    // 1
        System.out.println(animals.numWordsOfLength(3));    //  3
        System.out.println(animals.numWordsOfLength(2));    //  0

        animals.removeWordsOfLength(4);
        System.out.println(animals);    //["cat", "mouse", "dog", "dog"]

        animals.removeWordsOfLength(3);
        System.out.println(animals);    //["mouse"]

        animals.removeWordsOfLength(2);
        System.out.println(animals);    //["mouse"]
    }
}
