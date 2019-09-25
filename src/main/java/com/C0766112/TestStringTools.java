package com.C0766112;

import java.util.Arrays;

public class TestStringTools {

    private String gString;

    public String reverse(String s)
    {
        StringBuilder revString = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            revString.append(s.charAt(i));
        }
        return revString.toString();
    }
    public int binaryToDecimal(String binary) {
        int decimal = 0;
        int binaryMultiplier = 1;
        for (char c : reverse(binary).toCharArray()) {
            if (c == '1') {
                decimal += binaryMultiplier;
            } else if (c == '0') {
            } else {
                return -1;
            }
            binaryMultiplier *= 2;
        }
        return decimal;
    }
    public String initaials(String s) {
        System.out.println("Given String is:" + s);
        int length = s.length();
        s = s.trim();
        String string1 = "";
        System.out.print("Initials is: ");
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                string1 = string1 + ch;
            } else {
                System.out.print(Character.toUpperCase(string1.charAt(0)) + ". ");
                string1 = "";
            }
        }
        String str2 = "";
        for (int j = 0; j < string1.length(); j++) {
            if (j == 0)
                str2 = str2 + Character.toUpperCase(string1.charAt(0));
            else
                str2 = str2 + Character.toLowerCase(string1.charAt(j));
        }
        return str2;

    }
    /*
    public String mostFrequent(String s)
    {


    }
    public  String subString( String s)
    {

    }*/


}
