package com.linkedlist;

import java.util.Arrays;

public class Main {
    public static void main (String[] args){
        var list = new LinkedList();
        list.addFirst(15);
        list.addLast(35);
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
//        list.removeFirst();
//        list.removeLast();
        System.out.println("size: " + list.size());
        var array = list.toArray();
        System.out.println(Arrays.toString(array));

        list.reverse();
        var array2 = list.toArray();
        System.out.println(Arrays.toString(array2));

        System.out.println(list.getKthFromTheEnd(2));

//        list.altReverse();
//        var array3 = list.toArray();
//        System.out.println(Arrays.toString(array3));

//        System.out.println(list.indexOf(35));
//        System.out.println(list.contains(32));

    }

}
