package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

import java.util.Calendar;

public class Step16 implements Solution {
    @Override
    public String toString() {
        return "Leap year";
    }
    /*
     * This method checks whether a year is leap or not by using Java Date
     * and Time API. Calendar class has utility method to return maximum
     * number of days in a year which can be used to check if its
     * greater than 365 or not
     */
    public static boolean isLeapYear(int year){
        Calendar cal = Calendar.getInstance(); //gets Calendar based on local timezone and locale
        cal.set(Calendar.YEAR, year); //setting the calendar year
        int noOfDays = cal.getActualMaximum(Calendar.DAY_OF_YEAR);

        if(noOfDays > 365){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Step16().toString());
        System.out.println("Leap year - 2012 : "+ isLeapYear(2012));
        System.out.println("Leap year - 1901 : "+ isLeapYear(1901));
    }
}
