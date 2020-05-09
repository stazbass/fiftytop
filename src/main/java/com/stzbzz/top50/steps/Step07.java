package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

public class Step07 implements Solution {
    @Override
    public String toString() {
        return "Factorial";
    }

    public static long fact(long num){
        long accumulator = 1;
        for(int i = 2; i <= num; i++){
            accumulator *= i;
        }
        return accumulator;
    }

    @Override
    public void run() {
        String s = "";

    }
}
