package com.hashtable;

import java.util.LinkedList;
import java.util.NoSuchElementException;

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
        var index = hash(key, 10);
        var list =  items[index];
        if (list != null){
            for (var entry : list) {
                if (entry.key == key){
                    entry.value = value;
                    return;
                }
            }
        }
        else
            list = new LinkedList<Entry>();

        Entry entry = new Entry(key, value);
        list.addLast(entry);
        items[index] = list;
    }

    public String get(int key){
        var index = hash(key, 10);
        var list =  items[index];
        if (list == null)
            throw new IllegalStateException();

        for (var entry : list)
            if (entry.key == key)
                return entry.value;
        throw new NoSuchElementException();
    }

    public String remove(int key){
        var index = hash(key, 10);
        var list =  items[index];
        if (list == null)
            throw new IllegalStateException();

        for (var entry : list)
            if (entry.key == key) {
                var value = entry.value;
                list.remove(entry);
                return value;
            }

        throw new NoSuchElementException();
    }

    private int hash(int key, int tableSize){
        return key % tableSize;
    }
}

