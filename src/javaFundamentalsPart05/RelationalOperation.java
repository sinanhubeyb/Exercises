package javaFundamentalsPart05;

import java.util.Scanner;

public class RelationalOperation {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 number");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println(number1);
        System.out.println(number2);

        System.out.println("number1<number2: " + (number1<number2));
        System.out.println("number1<=number2: " + (number1<=number2));
        System.out.println("number1>number2: " + (number1>number2));
        System.out.println("number1>=number2: " + (number1>=number2));
        System.out.println("number1==number2: " + (number1==number2));
        System.out.println("number1!=number2: " + (number1=number2));








    }
}
