package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Step09 implements Solution {

    static public Collection removeDuplicates(Collection inputCollection){
        LinkedHashSet<?> result = new LinkedHashSet<>();
        result.addAll(inputCollection);
        return result;
    }

    @Override
    public String toString() {
        return "Remove duplicates from an array";
    }

    public static void main(String[] args) {

    }
}
