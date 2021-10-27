package javaFundamentalsPart05;

import java.util.Scanner;

public class ConditionalOperation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 number:");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        System.out.println("Number1: " + number1);
        System.out.println("Number2: " + number2);
        System.out.println("Number3: " + number3);

        System.out.println("(number1<number2)?number1:number2: " + ((number1<number2)?number1:number2));
        System.out.println("(number1<number3)?number1:number3: " + ((number1<number3)?number1:number3));
        System.out.println("(number2<number1)?number2:number1: " + ((number2<number1)?number2:number1));
        System.out.println("(number2<number3)?number2:number3: " + ((number2<number3)?number2:number3));
        System.out.println("(number3<number1)?number3:number1: " + ((number3<number1)?number3:number1));
        System.out.println("(number3<number2)?number3:number2: " + ((number3<number2)?number3:number2));








    }
}
