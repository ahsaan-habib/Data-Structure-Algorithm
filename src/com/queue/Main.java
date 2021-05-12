package com.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        queue.add(40);
//        queue.remove();
//        System.out.println(queue);
//        reverse(queue);
//        System.out.println(queue);

//        ArrayQueue queue = new ArrayQueue(5);
        StackQueue queue = new StackQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue());
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println(queue.dequeue());
        queue.enqueue(70);
//        System.out.println(queue.peek());
        System.out.println(queue.toString());

    }

    public static void reverse(Queue<Integer> queue){
        var stack = new Stack<>();
        while (!(queue.isEmpty())){
            stack.push(queue.remove());
        }
        while (!(stack.isEmpty())){
            queue.add((Integer) stack.pop());
        }
    }
}
