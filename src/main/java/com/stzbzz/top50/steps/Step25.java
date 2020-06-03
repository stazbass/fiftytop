package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

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
        Tree tree = new Tree("4");
        tree.root.left("2");
        tree.root.left().left("1");
        tree.root.left().right("3");

        tree.root.right("5");
        tree.root.right().right("6");

        traverseInOrder(tree.root, val-> System.out.printf("%s ", val));
        traverseInOrderNR(tree.root, val-> System.out.printf("%s ", val));
    }

    static <T>void traverseInOrder(Tree.Node<T> root, Consumer<T> processor){
        if(root.left.isPresent()){
            traverseInOrder(root.left(), processor);
        }
        processor.accept(root.value);
        if(root.right.isPresent()){
            traverseInOrder(root.right(), processor);
        }
    }
    static <T>void traverseInOrderNR(Tree.Node<T> root, Consumer<T> processor){
        Stack<Tree.Node<T>> nodesToProcess = new Stack<>();
        Tree.Node<T> nextNode = root;
        while (nextNode != null && !nodesToProcess.isEmpty()){
            if(nextNode.left.isPresent())nodesToProcess.add(nextNode.left());
            nodesToProcess.add(nextNode);
            if(nextNode.right.isPresent())nodesToProcess.add(nextNode.right());
            if(nextNode != null)processor.accept(nextNode.value);
            nextNode = nodesToProcess.isEmpty()?null:nodesToProcess.peek();
        }
    }

    @Override
    public String toString() {
        return "In order binary tree traversal";
    }
}
