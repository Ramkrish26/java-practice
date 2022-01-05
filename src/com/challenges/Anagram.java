package com.challenges;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String newString = "listen";
        String newString2 = "silenfdt";

        char[] charString = newString.toCharArray();
        Arrays.sort(charString);
        String newStringSorted = new String(charString);

        char[] charString1 = newString2.toCharArray();
        Arrays.sort(charString1);
        String newString2Sorted = new String(charString1);

        if(newStringSorted.equals(newString2Sorted))
            System.out.println("Anagram");
    }
}
