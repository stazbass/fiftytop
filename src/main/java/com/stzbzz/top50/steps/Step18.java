package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

import java.util.Arrays;

public class Step18 implements Solution  {
    @Override
    public String toString() {
        return "String anagram";
    }

    public static boolean isAnagram(String arg1, String arg2){
        char [] array1 = arg1.toLowerCase().toCharArray();
        char [] array2 = arg2.toLowerCase().toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        if(array1.length == array2.length){
            for(int i = 0; i < array1.length; i++){
                if(array1[i] != array2[i])return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }

}
