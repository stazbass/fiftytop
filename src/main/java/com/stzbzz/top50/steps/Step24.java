package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

/**
 * Pre-order traversal without recursion
 */
public class Step24 implements Solution {
    public static void main(String[] args) {
        Tree<String> tree = new Tree("A");
        tree.root = Tree.Node.of("A");
        tree.root.left("B1");
        tree.root.right("B2");

        tree.root.left().left("C1");
        tree.root.left().right("C2");
        tree.root.right().left("C3");
        tree.root.right().right("C4");
        tree.root.right().right().left("D5");

        tree.root.left().left().left("D1");
        tree.root.left().left().right("D2");
        tree.root.left().right().left("D3");
        tree.root.left().right().right("D4");

        tree.traversePreOrderNR(v -> System.out.printf("%s ",v));
    }

    @Override
    public String toString() {
        return "Pre-order traversal without recursion";
    }
}
