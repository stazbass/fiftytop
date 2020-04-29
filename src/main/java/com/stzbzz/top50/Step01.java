package com.stzbzz.top50;

import java.util.LinkedList;
import java.util.List;

public class Step01 implements Solution {
    @Override
    public String toString() {
        return "Fibonacci series";
    }

    @Override
    public void run() {
        int steps = 30;
        Long prevA = 1L;
        Long prevB = 1L;
        List<Long> result = new LinkedList<>();
        result.add(prevA);
        result.add(prevB);
        for(int i = 0; i < steps; i++){
            Long val = prevA + prevB;
            result.add(val);
            prevA = prevB;
            prevB = val;
        }
        System.out.println(result);
    }
}