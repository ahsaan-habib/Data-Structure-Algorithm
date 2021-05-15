package com.tree;

public class BinaryTree{
    private Node root;

    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        private Node(int value) {
            this.value = value;
        }
    }

    public void insert(int value){
        var node = new Node(value);
        if (root == null){
            root = node;
            return;
        }

        var current = root;
        while (true) {
            if (value > current.value) {
                if (current.rightChild == null){
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
            else {
                if (current.leftChild == null){
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            }
        }
    }
}
