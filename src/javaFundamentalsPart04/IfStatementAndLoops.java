package javaFundamentalsPart04;

import java.util.Random;
import java.util.Scanner;

public class IfStatementAndLoops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Input from user with Scanner class

        Random random = new Random();//Creates random number generator.

        int numberToGuess = random.nextInt(100);//Limit

        System.out.println("Enter a number: ");
        boolean guessed = false;

        while(!guessed){  //loop mechanism
            int guess = scanner.nextInt();
            if (guess<numberToGuess){  //with if else we are creating some conditions
                System.out.println("Higher!");
            }
            else if(guess>numberToGuess){
                System.out.println("Lower!");
            }else {
                System.out.println("Bingoooo!!");
                guessed=true;
            }
        }





    }
}
