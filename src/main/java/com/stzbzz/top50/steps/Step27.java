package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

import java.util.function.Consumer;

/**
 *
 * Example:
     45
    / \
   25 55
   / \ \
  15 35 65
  / / \
 5 77 88
 Output: 5 15 35 25 77 88 65 55 45
 *
 */
public class Step27 implements Solution {
    public static void main(String[] args) {
        Tree<String> tree = new Tree<>("45");
        tree.root.left("25").left("15").left("5");
        tree.root.left().get().right("35").left("77");
        tree.root.left().get().right().get().right("88");

        tree.root.right("55").right("65");

        traversePostOrder(tree.root, v-> System.out.printf("%s ", v));
    }

    static <T> void traversePostOrder(Tree.Node<T> root, Consumer<T> processor){
        if(root.left.isPresent())traversePostOrder(root.left.get(), processor);
        if(root.right.isPresent())traversePostOrder(root.right.get(), processor);
        processor.accept(root.value);
    }

    @Override
    public String toString() {
        return "Post-order traversal recursive";
    }
}
