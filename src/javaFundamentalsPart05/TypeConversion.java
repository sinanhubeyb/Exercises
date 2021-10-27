package javaFundamentalsPart05;

public class TypeConversion {
    public static void main(String[] args) {
        boolean aBoolean = false; //default
        char aCharacter = 'd';
        byte aByte = 126;
        short aShort = 1568;
        int aInteger = 1256456;
        long aLong = 45631341L;
        float aFloat = 1256.32F;
        double aDouble = 12.365987451236;

        final double PI = 3.14; //to create constant variables.
   //     PI = 3.15; If you try the change the final variable you will take compile error
       // aByte = aShort; -> Compile time error
        aByte = (byte)aShort; // ->But if you want to convert this is the way



        System.out.println(aBoolean);
        System.out.println(aCharacter);
        System.out.println(aByte);
        System.out.println(aShort);
        System.out.println(aInteger);
        System.out.println(aLong);
        System.out.println(aFloat);
        System.out.println(aDouble);
    }
}
