package com.gmail.mozhgru.sleepcls;

import java.util.Scanner;

public class AltPairsCls {

    public static void main (String[] args) {
        System.out.println("Please enter string: ");

        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(altPairs(str));
    }

    public static String altPairs(String str) {
        String out = "";

        for (int i = 0; i < str.length(); i += 4) {
            int endIndex = i + 2;
            if (endIndex > str.length()) {
                endIndex = str.length();
            }
            out += str.substring(i, endIndex);
        }

        return out;
    }

}
