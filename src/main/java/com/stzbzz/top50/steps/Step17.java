package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

import java.util.Arrays;

public class Step17 implements Solution {
    @Override
    public String toString() {
        return "Binary search";
    }

    public static int findElement(int [] array, int value){
        int startIndex = 0;
        int endIndex = array.length-1;
        while( (endIndex - startIndex) > 2){
            int middle = startIndex + (endIndex-startIndex)/2;
            if(array[startIndex] == value)return startIndex;
            if(array[endIndex] == value)return endIndex;
            if(array[middle] == value)return middle;
            if(array[middle] < value){
                startIndex = middle;
            }
            if(array[middle] > value){
                endIndex = middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findElement(new int[] {1,2,3,4,5,6,7,8,9,10,11,20,30,40,50,80,100}, 1));
    }
}
