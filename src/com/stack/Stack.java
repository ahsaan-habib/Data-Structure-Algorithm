package com.stack;

import java.util.Arrays;

public class Stack {
    private int[] items;
    private void setSize(int size){
        if(size <= 0)
            throw new IllegalArgumentException("Size of Stack cannot be 0 or less.");
        else
            this.items = new int[size];
    }
    public Stack(int size){
        setSize(size);
    }

    private int count = 0;
    public void push(int item){
        if(count == items.length)
            throw new StackOverflowError();

        items[count] = item;
        count++;
    }

    public int pop(){
        if(count == 0)
            throw new IllegalStateException();
        return items[--count];
    }

    public int peek(){
        if(count == 0)
            throw new IllegalStateException();
        return items[count-1];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    @Override
    public String toString(){
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }


//    *features to implement
//    push()
//    pop()
//    peek()
//    isEmpty()
//    notice to full stack(int[])
}
