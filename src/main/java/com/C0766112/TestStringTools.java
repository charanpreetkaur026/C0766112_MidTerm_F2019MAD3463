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
    /*public String initaials()
    {
        String givenName=""
    }*/
}
