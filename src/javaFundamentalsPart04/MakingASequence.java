package javaFundamentalsPart04;

import java.util.Scanner;

public class MakingASequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//We are asking some input from user with Scanner class

        System.out.println("Enter a number" );
        int number1 = scanner.nextInt(); //Input from user

        System.out.println("Enter another number: ");
        int number2 = scanner.nextInt();//Input from user

        int sum = number1+number2;
        System.out.println("The sum is: " + sum);//Output



    }
}
