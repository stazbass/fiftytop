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

    @Override
    public void run() {

    }
}
