package com.array;


public class Main {

    public static void main(String[] args) {
        Array numbers = new Array(5);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(40);
        numbers.insert(21);
        numbers.insert(32);
        System.out.println("length Of numbers: " + numbers.length());
        numbers.print();
        System.out.println("index of the number: " + numbers.indexOf(40));
        numbers.remove(32);
        numbers.print();
    }
}
