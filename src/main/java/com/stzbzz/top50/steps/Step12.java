package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

public class Step12  implements Solution {
    @Override
    public String toString() {
        return "Find greatest common divider";
    }

    public static int findGCD(int d1, int d2){
        if(d2 == 0){
            return d1;
        }
        return findGCD(d2, d1%d2);
    }

    public static void main(String[] args) {
        System.out.println("GCD on 54 GCD 24 is " + findGCD(54, 24));
    }
}
