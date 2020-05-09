package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

import java.util.stream.Stream;

public class Step04 implements Solution {

    @Override
    public String toString() {
        return "Integer Palindrome";
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
        Integer []testValues = new Integer[]{10002, 1, 11, 102, 103, 303, 0, 1, 11};
        Stream.of(testValues).forEach(testValue->{
            String message = (testValue.equals(reverseInt(testValue))?"palundra":"!palundra");
            System.out.println(testValue + " - " + message);
        });

    }
}
