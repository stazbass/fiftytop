package com.stzbzz.top50.steps;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Step15 {
    @Override
    public String toString() {
        return "Reverse words in sentence";
    }

    public static String reverse(String sentence){
        List<String> reversed = Arrays.asList(sentence.split("\\s"));
        Collections.reverse(reversed);
        return reversed.stream().map(e->e.toString()).collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(new Step15().toString());
        System.out.println(reverse("abcd dddd eeee ffff gggg xxxxx"));
    }
}
