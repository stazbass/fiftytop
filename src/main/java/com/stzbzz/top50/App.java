package com.stzbzz.top50;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.stzbzz.top50.steps.*;

/**
 * Hello world!
 *
 */
public class App {

    public static boolean isValid(String s){
//        Map<Long, String> scores = new HashMap<>();
//        scores.put("{")
        if(s.length() == 0)return true;
        return s.charAt(0) == s.charAt(s.length()-1) && isValid(s.substring(1,s.length()-1));
    }

    public static void main(String[] args) {
        System.out.println(isValid("{}"));
    }
}
