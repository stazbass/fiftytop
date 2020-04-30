package com.stzbzz.top50.steps;

import junit.framework.TestCase;

public class Step03Test extends TestCase {

    public void testIsPalindrome() {
        assertTrue(Step03.isPalindrome("b"));
        assertTrue(Step03.isPalindrome("bb"));
        assertTrue(Step03.isPalindrome("bob"));
        assertFalse(Step03.isPalindrome("sbob"));
        assertFalse(Step03.isPalindrome("bobss"));
        assertTrue(Step03.isPalindrome("Bob"));
    }
}