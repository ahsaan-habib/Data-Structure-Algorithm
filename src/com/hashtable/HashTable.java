package com.hashtable;

import java.util.Arrays;
import java.util.LinkedList;

public class HashTable {
    private static class Entry {
        public int key;
        public String value;

        public Entry(int key, String value){
            this.key = key;
            this.value = value;
        }
    }

    private final LinkedList<Entry>[] items = new LinkedList[10];

    public void put(int key, String value){
        var index = hash(key);
        var list =  items[index];

        if (list == null)
            list = new LinkedList<Entry>();
        else
            for (var entry : list) {
                if (entry.key == key){
                    entry.value = value;
                    return;
                }
            }
        list.addLast(new Entry(key, value));
        items[index] = list;
    }

    public String get(int key){
        var index = hash(key);
        var list =  items[index];
        if (list != null)
            for (var entry : list)
                if (entry.key == key)
                    return entry.value;
        return null;
//        throw new NoSuchElementException();
    }

    public String remove(int key){
        var index = hash(key);
        var list =  items[index];
        if (list == null)
            throw new IllegalStateException();

        for (var entry : list)
            if (entry.key == key) {
                var value = entry.value;
                list.remove(entry);
                return value;
            }

        throw new IllegalStateException();
    }

    private int hash(int key){
        return key % items.length;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}

