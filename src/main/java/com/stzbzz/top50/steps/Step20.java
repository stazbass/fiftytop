package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

public class Step20 implements Solution {
    @Override
    public String toString() {
        return "Reverse a number";
    }

    public static int reverseInt(int value){
        int result = 0;
        while(value != 0){
            result = (result*10) + value%10;
            value = value/10;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 1234567;
        System.out.println(num + " | " + reverseInt(num));
        num = 1;
        System.out.println(num + " | " + reverseInt(num));
        num = 12;
        System.out.println(num + " | " + reverseInt(num));
    }
}
