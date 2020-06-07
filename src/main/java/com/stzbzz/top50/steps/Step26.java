package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

import java.util.Optional;
import java.util.Stack;
import java.util.function.Consumer;

/**
 *
 * Example:
      4
     / \
    2   5
   / \   \
  1   3   6
 1 2 3 4 5 6
 */
public class Step26 implements Solution {
    public static void main(String[] args) {
        Tree<String> tree = new Tree("4");
        tree.root = Tree.Node.of("4");
        tree.root.left("2");
        tree.root.left().get().left("1");
        tree.root.left().get().right("3");

        tree.root.right("5");
        tree.root.right().get().right("6");

        traverseInOrderNR(tree.root, val -> System.out.printf("%s ", val));
    }


    static <T> void traverseInOrderNR(Tree.Node<T> root, Consumer<T> processor) {
        Stack<Tree.Node<T>> nodesToProcess = new Stack<>();
        Optional<Tree.Node<T>> currentNode = Optional.of(root);

        while (currentNode.isPresent() || !nodesToProcess.isEmpty()) {
            if (currentNode.isPresent()) {
                nodesToProcess.push(currentNode.get());
                currentNode = currentNode.get().left();
            } else {
                if (!nodesToProcess.isEmpty()) {
                    currentNode = Optional.of(nodesToProcess.pop());
                    processor.accept(currentNode.get().value);
                    currentNode = currentNode.get().right();
                }
            }
        }
    }

    @Override
    public String toString() {
        return "In-Order binary tree traversal non recursive";
    }
}
