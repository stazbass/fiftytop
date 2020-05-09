package com.stzbzz.top50.steps;

import junit.framework.TestCase;

public class Step08Test extends TestCase {

    public void testGetReversed() {
        String input = "a b c d e f g";
        String reversed = Step08.getReversed(input);
        System.out.println(reversed);
    }
}