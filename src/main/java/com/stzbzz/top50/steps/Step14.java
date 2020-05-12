package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Step14 implements Solution {
    @Override
    public String toString() {
        return "Reverse array in place";
    }

    public static Integer [] swapArray (Integer [] input){
        for(int i = 0; i < input.length/2; i++){
            Integer tmp = input[i];
            input[i] = input[input.length-i-1];
            input[input.length-i-1] = tmp;
        }
        return input;
    }



    public static void main(String[] args) {
        System.out.println(new Step14().toString());
        Integer [] testArray = new Integer[]{1,2,3,4,5,6,7};
        System.out.println(Stream.of(testArray).map(v->v.toString()).collect(Collectors.joining(",")));
        System.out.println(Stream.of(swapArray(testArray)).map(v->v.toString()).collect(Collectors.joining(",")));
    }
}
