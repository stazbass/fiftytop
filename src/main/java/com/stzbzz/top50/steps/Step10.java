package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

public class Step10 implements Solution {
    @Override
    public String toString() {
        return "Printing patterns - pyramid";
    }

    /**
     * *
     * * *
     * * * *
     * * * * *
     * @return *
     */
    public static String getPyramidLine(int lineNumber, int height){
        StringBuilder result = new StringBuilder();
        int prefixSpace = height - lineNumber;
        for(int i = 0; i < prefixSpace; i++){
            result.append(" ");
        }
        for(int i = 0; i < lineNumber; i++){
            result.append("* ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println(getPyramidLine(i, 10));
        }
    }
}
