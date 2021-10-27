package javaFundamentalsPart05;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {

        //bmi calculation
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your kg");
        double kg = scanner.nextDouble();
        System.out.println("Please enter your height(mt)");
        double mt = scanner.nextDouble();

        double bmi = kg / (mt*mt);
        System.out.println("Your BMI: " + bmi);

        if (bmi<20){
            System.out.println("Underweight");
        }else if (bmi>=20 && bmi <=25){
            System.out.println("Normal");
        }else if (bmi>=25 && bmi<=30) {
            System.out.println("Overweight");
        }else if (bmi>=30 && bmi<=40){
            System.out.println("Obesity");
        }else if (bmi>40){
            System.out.println("Morbid overweight");
        }else{
            System.out.println("Please enter correctly");
        }






    }
}
