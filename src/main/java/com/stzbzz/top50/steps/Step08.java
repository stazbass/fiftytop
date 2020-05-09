package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

public class Step08 implements Solution {
    @Override
    public String toString() {
        return "Reverse a string";
    }

    public static String getReversed(String string){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < string.length(); i++){
            stringBuilder.append(string.charAt(string.length()-i-1));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String sampleString  = "a b c d e f g";
        String reversedString = getReversed(sampleString);
        System.out.println("String reverse");
        System.out.println(sampleString);
        System.out.println(reversedString);
    }
}
