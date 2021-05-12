package com.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {
    private final List<Character> openExp = Arrays.asList('(','{','[','<');
    private final List<Character> closeExp = Arrays.asList(')','}',']','>');

    public Boolean isBalanced(String input){
//        input = (12+ 23)
        Stack<Character> stack = new Stack<>();
//        var openExp = new char[]{'(','{','[','<'};
//        var closeExp = new char[]{')','}',']','>'};

        for (char ch : input.toCharArray()){
//            if(isContain(ch,openExp))
            if(isOpenExp(ch))
                stack.push(ch);

//            if(isContain(ch,closeExp)){
            if(isCloseExp(ch)){
//                if stack is not empty
                if(stack.empty()) return false;

                var stored = stack.pop();
                if (!(compareExp(stored,ch))) return false;
            }

        }

        return stack.empty();
    }
    private boolean isOpenExp(char ch){
        return openExp.contains(ch);
    }

    private boolean isCloseExp(char ch){
        return closeExp.contains(ch);
    }
//    private boolean isContain(char ch, char[]chars){
//        for (int element : chars) {
//            if (element == ch)
//                return true;
//        }
//        return false;
//    }

    private boolean compareExpAlt(char openingExp, char closingExp){
        if (openingExp == '(' && closingExp == ')') return true;
        else if (openingExp == '{' && closingExp == '}') return true;
        else if (openingExp == '[' && closingExp == ']') return true;
        else return openingExp == '<' && closingExp == '>';
    }

    private boolean compareExp(char openingExp, char closingExp){
        return openExp.indexOf(openingExp) == closeExp.indexOf(closingExp);
    }
}
