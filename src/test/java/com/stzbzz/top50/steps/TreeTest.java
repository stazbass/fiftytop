package com.stzbzz.top50.steps;

import junit.framework.TestCase;
import org.junit.Test;

public class TreeTest extends TestCase {
    @Test
    public void testLeaf(){
        Tree.Node<String> node = new Tree.Node<>("v");
        assertTrue(node.isLeaf());
        node.left("vs");
        assertFalse(node.isLeaf());
    }
    @Test
    public void testLeaf2(){
        Tree.Node<String> node = new Tree.Node<>("v");
        assertTrue(node.isLeaf());
        node.left("vs");
        node.right("vs");
        assertFalse(node.isLeaf());
    }
}