package com.stzbzz.top50.steps;

import junit.framework.TestCase;
import org.junit.Test;

public class Step05Test extends TestCase {
    @Test
    public void testSumDigitCubes() {
        final long testNumber = 153;
        assertEquals(testNumber, Step05.sumDigitCubes(testNumber));
    }
}