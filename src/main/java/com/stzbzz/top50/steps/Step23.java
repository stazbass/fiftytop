package com.stzbzz.top50.steps;

import java.util.function.Consumer;

public class Step23 {
    public static class TreeNode {
        TreeNode(String value) {
            data = value;
            left = null;
            right = null;
        }

        String data;
        TreeNode left;
        TreeNode right;



        boolean isLeaf() {
            return (left == null && right == null);
        }
    }

    public static void preOrderTraversal(TreeNode treeNode, Consumer<String> dataConsumer){
        if(treeNode == null)return;
        dataConsumer.accept(treeNode.data);
        preOrderTraversal(treeNode.left, dataConsumer);
        preOrderTraversal(treeNode.right, dataConsumer);
    }

    @Override
    public String toString() {
        return "Pre-order traversal";
    }

    public static void main(String[] args) {
        System.out.println(new Step23().toString());
        TreeNode rootNode = new TreeNode("root");
        rootNode.left = new TreeNode("22");
        rootNode.right = new TreeNode("23s");
        preOrderTraversal(rootNode, c-> System.out.println(c));
    }
}
