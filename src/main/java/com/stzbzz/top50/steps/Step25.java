package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

import java.util.Optional;
import java.util.Stack;
import java.util.function.Consumer;

/**
 * Example:
     4
    / \
   2   5
  / \   \
 1   3   6
 1 2 3 4 5 6
 */
public class Step25 implements Solution {
    public static void main(String[] args) {
        Tree<String> tree = new Tree("4");
        tree.root = Tree.Node.of("4");
        tree.root.left("2");
        tree.root.left().get().left("1");
        tree.root.left().get().right("3");

        tree.root.right("5");
        tree.root.right().get().right("6");

        traverseInOrder(tree.root, val-> System.out.printf("%s ", val));
    }

    static <T> void traverseInOrder(Tree.Node<T> root, Consumer<T> processor){
        if(root.left.isPresent())traverseInOrder(root.left.get(), processor);
        processor.accept(root.value);
        if(root.right.isPresent())traverseInOrder(root.right.get(), processor);
    }

    @Override
    public String toString() {
        return "In-order binary tree traversal recursion";
    }
}
