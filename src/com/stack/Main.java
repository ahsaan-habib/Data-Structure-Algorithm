package com.stack;

public class Main {
    public static void main(String[] args){
        String testString = "TEST";
        var reverser =  new ReverseString();
        var reversed = reverser.reverse(testString);
        var reversedWithoutStack = reverser.reverseStringWithoutStack(testString);
        System.out.println(reversed);
        System.out.println(reversedWithoutStack);

        String testBalancedExp = "[<{2+4}>+[({a+b})]+(fd)]";
        Expression balanceChecker = new Expression();
        var result = balanceChecker.isBalanced(testBalancedExp);
        System.out.println(result);;

        Stack stack = new Stack(5);
        stack.push(12);
        stack.push(14);
        stack.push(16);
        stack.push(18);
        stack.pop();

        System.out.println(stack.peek());
        var stackValues = stack.toString();
        System.out.println("stack :" + stackValues);

    }

}
