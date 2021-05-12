package com.queue;

import java.util.Stack;

public class StackQueue {
    private final Stack<Integer> stack1 = new Stack<>();
    private final Stack<Integer> stack2 = new Stack<>();

//    O(1)
    public void enqueue(int item){
        this.stack1.push(item);
    }

//    O(n)
    public int dequeue(){
        if (isEmpty())
            throw new IllegalStateException();

        moveStack1ToStack2();
        return stack2.pop();
    }

    private void moveStack1ToStack2() {
        if (stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
    }

    public int peek(){
        if (isEmpty())
            throw new IllegalStateException();

        moveStack1ToStack2();
        return stack2.peek();
    }

    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    @Override
    public String toString(){
        String show = "";
        show += stack2.toString();
        show += stack1.toString();
        return show;
    }


}
