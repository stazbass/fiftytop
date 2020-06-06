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

        tree.root.left().get().left("C1");
        tree.root.left().get().right("C2");
        tree.root.right().get().left("C3");
        tree.root.right().get().right("C4");
        tree.root.right().get().right().get().left("D5");

        tree.root.left().get().left().get().left("D1");
        tree.root.left().get().left().get().right("D2");
        tree.root.left().get().right().get().left("D3");
        tree.root.left().get().right().get().right("D4");

        tree.traversePreOrderNR(v -> System.out.printf("%s ",v));
    }

    @Override
    public String toString() {
        return "Pre-order traversal without recursion";
    }
}
