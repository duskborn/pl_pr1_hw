package com.gmail.mozhgru.sleepcls;

import java.util.Scanner;

public class SumDoubleCls {

    public static void main( String[] args ) {
        System.out.println("Please enter a and b.");
        System.out.print("a = ");

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        System.out.print("b = ");

        int b = in.nextInt();

        System.out.println(sumDouble(a,b));
    }

    public static int sumDouble(int a, int b) {
        sum = a+b;
        if (a==b) sum*=2;        
        return sum;
    }
}
