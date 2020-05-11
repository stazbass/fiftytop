package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Step11 implements Solution {
    @Override
    public String toString() {
        return "Find repeated characters";
    }

    public static String findReps(String string){
        char [] chars = string.toCharArray();
        Set<Character> result = new HashSet<>();
        for(int i = 0; i < chars.length; i++){
            for(int j = i; j < chars.length; j++){
                if(i != j && chars[i] == chars[j])result.add(chars[i]);
            }
        }
        return result.stream().map(character -> String.valueOf(character)).collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
        System.out.println(findReps("aabbccddd"));
    }
}
