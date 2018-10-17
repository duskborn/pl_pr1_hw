package com.gmail.mozhgru.sleepcls;
import java.util.Scanner;

public class SleepCls {

    public static void main( String[] args ) {

        boolean weekday = false;
        boolean vacation = false;

        System.out.println("Please enter boolean arguments weekday and vacation.");
        System.out.print("weekday = ");

        Scanner in = new Scanner(System.in);
        String week = in.next();

        if (week.compareTo("false") == 0) {
            weekday = false;
        } else {
            weekday = true;
        }

        System.out.print("vacation = ");

        String vac = in.next();

        if (vac.compareTo("false") == 0) {
            vacation = false;
        } else {
            vacation = true;
        }

        System.out.println(sleepIn(weekday, vacation));
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
