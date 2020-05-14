package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

public class Step21 implements Solution {
    @Override
    public String toString() {
        return "The first non-repeated character of String";
    }

    public static char getFirstNonRepeated(String argument) {
        char [] array = argument.toCharArray();
        for (int i = 0; i < array.length; i++){
            if(argument.indexOf(array[i], i+1) == -1 && argument.indexOf(array[i]) == i){
                return array[i];
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(new Step21().toString());
        System.out.println(getFirstNonRepeated("k"));
    }
}
