package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

public class Step03 implements Solution {
    @Override
    public String toString() {
        return "String Palindrome";
    }

    /**
     * Case insensitive version
     * @param testedString
     * @return
     */
    public static boolean isPalindrome(String testedString){
        testedString = testedString.toLowerCase();
        for(int i = 0; i < testedString.length()/2; i++){
            if(testedString.charAt(i) != testedString.charAt(testedString.length()-i-1))return false;
        }
        return true;
    }

    @Override
    public void run() {

    }
}
