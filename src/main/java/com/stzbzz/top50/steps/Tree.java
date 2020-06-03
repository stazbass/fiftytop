package com.stzbzz.top50.steps;

import java.util.Optional;
import java.util.Stack;
import java.util.function.Consumer;

public class Tree<VALUE_TYPE> {
    Node<VALUE_TYPE> root;

    Tree(VALUE_TYPE rootValue) {
        this.root = Node.of(rootValue);
    }

    static <T> void traverse(Consumer<T> valueProcessor, Node<T> rootNode) {
        valueProcessor.accept(rootNode.value);
        if (rootNode.left != null) traverse(valueProcessor, rootNode.left());
        if (rootNode.right != null) traverse(valueProcessor, rootNode.right());
    }

    static <T> void traversePreOrderNR(Consumer<T> valueProcessor, Node<T> rootNode) {
        Stack<Node> nodesToProcess = new Stack<>();
        nodesToProcess.add(rootNode);
        while (!nodesToProcess.isEmpty()) {
            Node<T> node = nodesToProcess.pop();
            valueProcessor.accept(node.value);
            if (node.left.isPresent()) nodesToProcess.add(node.left());
            if (node.right.isPresent()) nodesToProcess.add(node.right());
        }
    }

    void traversePreOrderNR(Consumer<VALUE_TYPE> valueProcessor) {
        traversePreOrderNR(valueProcessor, root);
    }
    @Override
    public String toString() {
        return JsonSerializer.serialize(this);
    }

    static class Node<VALUE_TYPE> {
        VALUE_TYPE value;
        Optional<Node<VALUE_TYPE>> left;
        Optional<Node<VALUE_TYPE>> right;

        Node(VALUE_TYPE value) {
            this.value = value;
            this.left = Optional.empty();
            this.right = Optional.empty();
        }

        static <T> Node<T> of(T value) {
            return new Node<>(value);
        }

        Node<VALUE_TYPE> left(VALUE_TYPE value) {
            left = Optional.of(Node.of(value));
            return left.get();
        }

        Node<VALUE_TYPE> right(VALUE_TYPE value) {
            right = Optional.of(Node.of(value));
            return right.get();
        }

        Node<VALUE_TYPE> left(){
            return left.get();
        }

        Node<VALUE_TYPE> right(){
            return right.get();
        }

        VALUE_TYPE value(){
            return value;
        }


        boolean isLeaf(){
            return left==null&&right==null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }
}
