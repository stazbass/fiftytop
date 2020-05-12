package com.stzbzz.top50.steps;

import junit.framework.TestCase;

public class Step18Test extends TestCase {

    public void testIsAnagram() {
        assertTrue(Step18.isAnagram("word", "wrdo"));
        assertTrue(Step18.isAnagram("mary", "army"));
        assertTrue(Step18.isAnagram("stop", "tops"));
        assertTrue(Step18.isAnagram("boat", "btoa"));
        assertFalse(Step18.isAnagram("pure", "in"));
        assertFalse(Step18.isAnagram("fill", "fil"));
        assertFalse(Step18.isAnagram("b", "bbb"));
        assertTrue(Step18.isAnagram("a", "a"));
        assertFalse(Step18.isAnagram("sleep", "slep"));

    }
}