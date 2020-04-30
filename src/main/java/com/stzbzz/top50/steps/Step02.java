package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

public class Step02 implements Solution {
    @Override
    public String toString() {
        return " A prime number";
    }

    public static boolean isPrime(long num){
        for(long i = 2; i < num; i++){
            if( (num % i) == 0)return false;
        }
        return true;
    }
    
    @Override
    public void run() {
        final int maxNumber = 100;
        for(int i = 0; i < 10; i++){
            long number = Math.round(Math.random()*maxNumber);
            boolean isPrime = isPrime(number);
            System.out.println("Number " + number + " prime : " + isPrime);
        }
        
    }

}