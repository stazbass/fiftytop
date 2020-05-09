package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

import java.util.stream.Stream;

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

    public static void main(String[] args) {
        System.out.println(new Step07().toString());
        Stream.of(1,2,3,4,5,6,7,8,9,10).forEach(num->{
            long number = num;
            long factorial = fact(number);
            String message = String.format("Number : %0$d fact %0$d", number, factorial);
            System.out.println(message);
        });
    }
}
