package com.stzbzz.top50.steps;

import com.stzbzz.top50.Solution;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Step22 implements Solution {

    static class LinkedList<T> {
        class Node<T>{
            public Node(Node prev, Node next, T value){
                this.next = next;
                this.prev = prev;
                this.value = value;
            }
            Node next;
            Node prev;
            T value;

            @Override
            public String toString() {
                return "Node{" +
                        "value=" + value +
                        '}';
            }
        }
        public Node<T> head;
        public Node<T> tail;
        LinkedList(){
            head = new Node(null, null, null);
            tail = new Node(head, null, null);
            head.next = tail;
        }

        void add(T value){
            Node<T> n = new Node<>(tail.prev, tail, value);
            tail.prev.next = n;
            tail.prev = n;
        }
    }

    @Override
    public String toString() {
        return "Finding Middle element of linked list in one pass";
    }

    public static LinkedList.Node getMiddleLeftNode(LinkedList.Node head, LinkedList.Node tail){
        if(head.next == tail || tail.prev == head){
            return head;
        }else{
            return getMiddleLeftNode(head.next, tail.prev);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Step22().toString());
        LinkedList<String> list= new LinkedList<String>();
        for(int i = 0; i < 100; i++){
            list.add(String.format("value %d", i));
        }
        System.out.println(getMiddleLeftNode(list.head, list.tail));
    }
}
