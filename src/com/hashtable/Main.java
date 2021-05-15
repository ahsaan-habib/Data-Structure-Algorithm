package com.hashtable;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "Ahsan");
//        map.put(2, "Habib");
//        var removed = map.remove(1);
//        System.out.println(removed);
//        System.out.println(map);
//
//        CharFinder charfinder = new CharFinder();
//        var result = charfinder.findFirstNonRepeatedChar("ahsan habib");
//        var result2 = charfinder.findFirstRepeatedChar("ahsan habib");
//        System.out.println(result);
//        System.out.println(result2);
        HashTable hash = new HashTable();
        hash.put(4, "habib");
        hash.put(4, "Ahsan");
        hash.put(2, "ahsan");
        hash.put(13, "farhan");
        hash.put(22, "miskat");
        System.out.println(hash.get(4));
        System.out.println(hash.get(2));
        System.out.println("removed: " + hash.remove( 2));
//        System.out.println(hash.get(2));
        System.out.println(hash.get(13));
        System.out.println(hash.get(22));
    }

}
