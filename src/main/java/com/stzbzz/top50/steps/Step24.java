package com.stzbzz.top50.steps;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.stzbzz.top50.Solution;

import java.util.Stack;
import java.util.function.Consumer;

public class Step24 implements Solution {
    public static void main(String[] args) {
        /*
                   A
              B1       B2
          C1     C2   C3 C4
        D1  D2 D3  D4      D4
         */
        Tree<String> tree = new Tree("A");
        tree.root = Tree.Node.of("A");
        tree.root.left("B1");
        tree.root.right("B2");

        tree.root.left.left("C1");
        tree.root.left.right("C2");
        tree.root.right.left("C3");
        tree.root.right.right("C4");
        tree.root.right.right.left("D5");

        tree.root.left.left.left("D1");
        tree.root.left.left.right("D2");
        tree.root.left.right.left("D3");
        tree.root.left.right.right("D4");

        tree.traverseNR(v -> System.out.printf("%s ",v));
        System.out.println("");
        tree.traverse(v -> System.out.printf("%s ", v));

    }

    @Override
    public String toString() {
        return "Pre-order traversal without recursion";
    }

    /**
     * Internal Tree implementation
     * @param <T>
     */
    static class Tree<T> {
        Node<T> root;

        Tree(T rootValue) {
            this.root = Node.of(rootValue);
        }

        static <T> void traverse(Consumer<T> valueProcessor, Node<T> rootNode) {
            valueProcessor.accept(rootNode.value);
            if (rootNode.left != null) traverse(valueProcessor, rootNode.left);
            if (rootNode.right != null) traverse(valueProcessor, rootNode.right);
        }

        static <T> void traverseNR(Consumer<T> valueProcessor, Node<T> rootNode) {
            Stack<Node> nodesToProcess = new Stack<>();
            nodesToProcess.add(rootNode);
            while (!nodesToProcess.isEmpty()) {
                Node<T> node = nodesToProcess.pop();
                valueProcessor.accept(node.value);
                if (node.left != null) nodesToProcess.add(node.left);
                if (node.right != null) nodesToProcess.add(node.right);
            }
        }

        void traverse(Consumer<T> valueProcessor) {
            Tree.traverse(valueProcessor, root);
        }
        void traverseNR(Consumer<T> valueProcessor) {
            Tree.traverseNR(valueProcessor, root);
        }
        @Override
        public String toString() {
            return JsonSerializer.serialize(this);
        }

        static class Node<T> {
            T value;
            Node<T> left;
            Node<T> right;

            Node(T value) {
                this.value = value;
            }

            static <T> Node<T> of(T value) {
                return new Node<>(value);
            }

            Node<T> left(T value) {
                left = Node.of(value);
                return left;
            }

            Node<T> right(T value) {
                right = Node.of(value);
                return right;
            }

            @Override
            public String toString() {
                return "Node{" +
                        "value=" + value +
                        '}';
            }
        }
    }
}
