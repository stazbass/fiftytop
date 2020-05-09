package com.stzbzz.top50.steps;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Step09Test extends TestCase {

    public void testRemoveDuplicates() {
        Collection<String> sampleList = Arrays.asList("el1", "el1", "el2");
        Collection filtered = Step09.removeDuplicates(sampleList);
        System.out.println(filtered);
    }
}