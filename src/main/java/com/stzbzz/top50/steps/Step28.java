package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

import java.util.Optional;
import java.util.Stack;
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
 1) visit the left subtree
 2) visit the right subtree
 3) print the value of current node or root.
 *
 */
public class Step28 implements Solution {
    public static void main(String[] args) {
        Tree<String> tree = new Tree<>("45");
        tree.root.left("25").left("15").left("5");
        tree.root.left().get().right("35").left("77");
        tree.root.left().get().right().get().right("88");

        tree.root.right("55").right("65");

        traversePostOrder(tree.root, v-> System.out.printf("%s ", v));
        System.out.println();
        traversePostOrderNR(tree.root, v-> System.out.printf("%s ", v));

    }

    static <T> void traversePostOrder(Tree.Node<T> root, Consumer<T> processor){
        if(root.left.isPresent())traversePostOrder(root.left.get(), processor);
        if(root.right.isPresent())traversePostOrder(root.right.get(), processor);
        processor.accept(root.value);
    }

    static <T> void traversePostOrderNR(Tree.Node<T> root, Consumer<T> processor){
        Tree.Node<T> currentElement = root;
        Stack<Tree.Node<T>> nodesToProcess = new Stack<>();
        nodesToProcess.push(currentElement);
        while(!nodesToProcess.isEmpty()){
            currentElement = nodesToProcess.peek();
            if(currentElement.isLeaf()){
                Tree.Node<T> node = nodesToProcess.pop();
                processor.accept(node.value);
            }else{
                if(currentElement.right.isPresent()){
                    nodesToProcess.push(currentElement.right.get());
                    currentElement.right = Optional.empty();
                }
                if(currentElement.left.isPresent()){
                    nodesToProcess.push(currentElement.left.get());
                    currentElement.left = Optional.empty();
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Post-order traversal recursive";
    }
}
