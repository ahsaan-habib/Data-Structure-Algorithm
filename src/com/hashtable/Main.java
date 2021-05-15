package com.hashtable;

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
        HashTable table = new HashTable();
        table.put(4, "habib");
        System.out.println(table.get(4));
        table.put(4, "Ahsan");
        table.put(2, "ahsan");
        table.put(12, "muzahid");
        table.put(22, "miskat");
        System.out.println("updated: " + table.get(4));
        System.out.println(table.get(2));
        System.out.println("removed: " + table.remove( 2));
        System.out.println(table.get(2));
        System.out.println(table.get(13));
        System.out.println(table.get(22));
        System.out.println(table.toString());
    }

}
