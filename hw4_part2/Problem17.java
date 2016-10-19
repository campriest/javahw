//Cameron Priestley
//10/09/2016

import java.util.Scanner;
import java.util.*;

public class Problem17
{

    public static void main(String[] args) {

        Random rand       = new Random();
        Scanner key       = new Scanner(System.in);

        int  randomNumber = randomNumber = rand.nextInt(100) + 1;
        int guess         = 0;
        int numberOfGuess = 1;

        
        
        do{
            System.out.println("Guess a number between 1 and 100!");
            guess = key.nextInt();;

            while(guess == 0 || guess>100){
                System.out.println("Invalid! Please enter a number between 1 and 100.");
                guess = key.nextInt();

                numberOfGuess++;
            }

            if(guess > randomNumber){

                System.out.println("Too high! Try again.");

            } else if(guess < randomNumber) {

                System.out.println("Too low! Try again.");
            } else if( guess == randomNumber){

                System.out.println("Congratulations! You figured out my number." + "You guessed "+ numberOfGuess + " times.");
                break;
            }  

            numberOfGuess++;
        }while(guess>= 1 && guess<= 100);

    
    }
}
