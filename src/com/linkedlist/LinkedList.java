package com.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }
    public Node first;
    private Node last;
    private int size = 0;

    private boolean isEmpty(){
        return first == null;
    }

    public void addFirst(int item){
        var node = new Node(item);
        if (isEmpty()){
            first = last = node;
        }
        else{
            node.next = first;
            first = node;
        }
        size++;
    }

    public void addLast(int item){
        var node = new Node(item);
        if (isEmpty())
            first = node;
        else
            last.next = node;
        last = node;
        size++;
    }

    public int indexOf(int item){
        int index = 0;
        var current = first;
        while (current != null){
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    public void removeFirst(){
        if(isEmpty())
            throw new NoSuchElementException();

//      or check if first & last node are same
        if (first.next != null) {
            var newFirst = first.next;
            first.next = null;
            first = newFirst;
        }
        else
            first = last = null;
        size--;
    }

    public void removeLast(){
        if (isEmpty())
            throw new NoSuchElementException();
        if (first.next != null){
            last = getPrevious(last);
            assert last != null;
            last.next = null;
        }
        else
            first = last = null;
        size--;
    }

    private  Node getPrevious(Node node){
        var target = first;
        while(target != null ) {
            if (target.next == node) return target;
            target = target.next;
            }
        return null;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while(current != null){
            array[index] = current.value;
            current = current.next;
            index++;
        }
        return array;
    }

//    10 -> 20 -> 30 -> 40 -> 50 to
//    10 <- 20 <- 30 <- 40 <- 50
    public void reverse(){
        if(isEmpty()) return;
        var previous = first;
        var current = previous.next;

        while (current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last= first;
        last.next = null;

        first = previous;
    }


//    10 -> 20 -> 30 -> 40 -> 50
//    find kth node from the end in one pass
//  setting two pointer
    public int getKthFromTheEnd(int k){
        if(isEmpty())
            throw new IllegalStateException();

        var targetNode = first;
        var secondaryNode = first;

//      set secondaryNode to targetNode
        for (int i = 0; i < k-1; i++){
            secondaryNode = secondaryNode.next;
            if (secondaryNode == null)
                throw new IllegalArgumentException();
        }

//      shift pointers to forward node till find the target
        while(secondaryNode != last){
            targetNode = targetNode.next;
            secondaryNode = secondaryNode.next;
        }
        return targetNode.value;
    }

    public void printMiddle(){
        if (isEmpty())
            throw new IllegalStateException();

        var targetNode = first;
        var secondaryNode = first;

        while (secondaryNode != last && secondaryNode.next != last){
            targetNode = targetNode.next;
            secondaryNode = secondaryNode.next.next;
        }

        if(secondaryNode == last)
            System.out.println("Middle: " + targetNode.value);

        else
            System.out.println("Middles: " + targetNode.value +" "+ targetNode.next.value);

    }

    public boolean hasLoop() {
        var slow = first;
        var fast = first;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }

    public static LinkedList createWithLoop() {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        // Get a reference to 30
        var node = list.last;

        list.addLast(40);
        list.addLast(50);

        // Create the loop
        list.last.next = node;

        return list;
    }



//  tried using swapping (doesn't work yet)
    public void altReverse(){
        swap(first,last);
    }

    private int swapCount = 0;
    public void swap(Node left, Node right){
        if (left != right && swapCount < size/2){
            var tempRight = new Node(right.value);
            var tempLeft = new Node(left.value);

            tempRight.next = left.next;

            if(right.next != null) {
                tempLeft.next = right.next;
            }
            else {
                tempLeft.next = null;
            }

            var lastPrev = getPrevious(right);

            left = tempRight;
            right = tempLeft;

            if(lastPrev != null) {
                lastPrev.next = right;
            }

            swapCount++;
            System.out.println(swapCount);
            if(left.next != lastPrev){
                swap(left.next, lastPrev);
            }
        }
    }

}
