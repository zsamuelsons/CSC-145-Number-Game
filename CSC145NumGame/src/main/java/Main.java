//Zach Samuelson & Issac Henson
//CSC 145 Assignment 4

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random randGen = new Random();
        Scanner userInput = new Scanner(System.in);

        System.out.println("Hello and welcome to the GAAAAAAAAAAAAME ZONE!!!");
        System.out.println("This doo-hickey will create a random number for you!");
        System.out.println("THEN, you try and guess that random number!!!");
        System.out.println("HOWEVER, if you can't guess the number within 10 tries...");
        System.out.println("We ask that you please delete System 32 and have a nice day! :) !");
        System.out.println(" ");
        System.out.println("Now lets play GUESS THE NUMBER!!!!!!!!!!!!");
        System.out.println(" ");

        char g = 'y';
        while(g == 'y'){

            System.out.print("Guess a number from 1 to 100: ");
            int n = 0;                          //n = Number to guess to progress game
            int t = 0;                          //t = counter for how many guesses it took you
            int x = randGen.nextInt(100) + 1;   //x = random integer 1-100

            while(n != x){

                n = userInput.nextInt();
                t = t + 1;

                if(x > n){
                    System.out.println(n + " is too low...");
                    System.out.print("Try again: ");
                }else if(x < n){
                    System.out.println(n + " is too high...");
                    System.out.print("Try again: ");
                }else{
                    System.out.println("Correct!");
                    System.out.println("It took you " + t + " tries.");
                }
            }

            if(t > 10){
                System.out.println("Uh-oh... you didn't guess right in 10 tries.");
                System.out.println("You know what that means....");
                System.out.println("PLEASE DELETE SYSTEM 32 AND HAVE A FANTASTIC DAY!!!");
            }else{
                System.out.println("CONGRATULATIONS!!! You guessed right under 10 tries!");
                System.out.println("You can keep your system 32 for now...");
            }

            System.out.println("Would you like to play again? (y/n)");
            g = userInput.next().charAt(0);

            while(g != 'y' && g != 'n'){
                System.out.println("Please enter a valid answer! (y/n)");
                g = userInput.next().charAt(0);
            }
        }
        System.out.print("Thank you for playing!");
    }
}
