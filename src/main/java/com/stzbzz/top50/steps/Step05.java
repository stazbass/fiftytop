package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

public class Step05 implements Solution {
    @Override
    public String toString() {
        return "Armstrong number";
    }

    public static long sumDigitCubes(long num){
        if(num > 0){
            long digit = num%10;
            return digit*digit*digit + sumDigitCubes(num/10);
        }else{
            return 0;
        }
    }

    public static boolean isArmstrongNumber(long number){
        return number == sumDigitCubes(number);
    }

    public static void main(String[] args) {
        System.out.println(new Step05().toString());
        long number = 153;
        System.out.println(number + " " + (isArmstrongNumber(number)?"is":"isn't") + " armstrong number");
        number = 154;
        System.out.println(number + " " + (isArmstrongNumber(number)?"is":"isn't") + " armstrong number");
    }
}
