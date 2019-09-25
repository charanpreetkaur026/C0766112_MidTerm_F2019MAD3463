package com.C0766112;

import java.util.Arrays;

public class LambtonStringTools
{


    public static void main(String[] args)
    {
        TestStringTools object = new TestStringTools();
        System.out.println(" Given String is: Lambton\n Reversed String is: " + object.reverse("Lambton"));
        System.out.println(" Given String is:  1001 \n Equilavent integer:" + object.binaryToDecimal("1001"));
        System.out.println( object.initaials("jean luc peacrd"));
        System.out.println(" Given String is:  welcome to lambton college in toronto \n Most frequent character:" + object.mostFrequent("welcome to lambton college in toronto"));
       // System.out.println(" Given String is:  the dog jumped over the fence \n New String is:" + object.subString("the dog jumped over the fence"));

    }



}
