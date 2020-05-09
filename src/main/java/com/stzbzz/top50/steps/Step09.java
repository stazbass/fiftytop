package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

public class Step09 implements Solution {
    @Override
    public String toString() {
        return "Remove duplicates from an array";
    }

    static public Collection removeDuplicates(Collection inputCollection){
        LinkedHashSet<?> result = new LinkedHashSet<>();
        result.addAll(inputCollection);
        return result;
    }


    public static void main(String[] args) {
        System.out.println(new Step09().toString());
        List<Integer> sampleList = Arrays.asList(1,2,3,4,5,6,7,1,2,3,10);
        Collection result = removeDuplicates(sampleList);
        System.out.println("Input : \n" + sampleList);
        System.out.println("Output : \n" + result);
    }
}
