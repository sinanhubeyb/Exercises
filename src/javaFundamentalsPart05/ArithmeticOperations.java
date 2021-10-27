package javaFundamentalsPart05;

import java.util.*; //-> " * " importing all util library

public class ArithmeticOperations {
    public static void main(String[] args) {
 /*
        System.out.println(3+8);
        System.out.println("The sum of 3 + 8= " + (3+8));*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int sum = number1 + number2;
        System.out.println("The sum is : " + sum);

        int min = number1 - number2;
        System.out.println("The min is : " + min);

        int mul = number1 * number2;
        System.out.println("The mul is : " + mul);

        --number1;
        System.out.println("--number1 => " + number1);
        number1--;
        System.out.println("number1-- => " + number1);

        ++number1;
        System.out.println("++number1 => " + number1);
        number1++;
        System.out.println("number1++ => " + number1);







    }
}
