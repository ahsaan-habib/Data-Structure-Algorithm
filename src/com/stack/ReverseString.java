package com.stack;

import java.util.Stack;

public class ReverseString {

//    reverse string using Stack
    public String reverse(String input){
        if(input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();

//        for (int i = 0; i < input.length(); i++)
//            stack.push(input.charAt(i));

        for (char ch : input.toCharArray())
            stack.push(ch);

        StringBuilder reversed = new StringBuilder();
        while(!stack.empty())
            reversed.append(stack.pop());

        return reversed.toString();
    }

//    reverse string without using Stack in java
    public String reverseStringWithoutStack(String input){
        if(input == null)
            throw new IllegalArgumentException();

        char[] chars = input.toCharArray();
        StringBuilder reverse = new StringBuilder();
        for (int i = chars.length-1; i >= 0; i--){
            reverse.append(chars[i]);
        }
        return reverse.toString();
    }
}
