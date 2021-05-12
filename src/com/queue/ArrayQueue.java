package com.queue;

import java.util.Arrays;

public class ArrayQueue {
//    dynamic array size setter can be implemented instead of 5
    private int[] items;

    private int front;
    private int rear;
    private int count;

    public ArrayQueue(int capacity){
        this.items = new int[capacity];
    }

    public void enqueue(int item){
        if (count == items.length)
            throw new IllegalStateException();
        items[rear] = item;
//        to create circular Array
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue(){
        if (count == 0)
            throw new IllegalStateException();

        var item = items[front];
        items[front] = 0;
//        to create circular Array
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }



    @Override
    public String toString(){
//        System.out.println(front);
//        System.out.println(rear);
//        var content = Arrays.copyOfRange(items, front, rear);
//        return Arrays.toString(content);
        return Arrays.toString(items);
    }

}
