package com.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CharFinder {
    public char findFirstNonRepeatedChar(String input){

        Map<Character, Integer> map = new HashMap<>();

        var chars = input.toCharArray();
        for (char ch : chars){
            var count = map.getOrDefault(ch, 0);
            map.put(ch, count + 1);
        }
        System.out.println(map);
        for (char ch : chars)
            if(map.get(ch) == 1)
                return ch;

        return Character.MIN_VALUE;
    }

    public char findFirstRepeatedChar(String input){
        HashSet<Character> set = new HashSet<>();

        for (char ch : input.toCharArray()){
            if(set.contains(ch))
                return ch;
            set.add(ch);
        }
        return Character.MIN_VALUE;
    }
}
