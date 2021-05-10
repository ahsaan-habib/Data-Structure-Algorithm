package com.array;

public class Array {
    private int initLength;
    private int insertCount = 0;
    private int[] items;
    public Array(int length){
        setInitLength(length);
        items = new int[this.initLength];
    }

    private void setInitLength(int initLength){
       if(initLength <= 0)
           throw new IllegalArgumentException("Length of Array cannot be 0 or less.");
        this.initLength = initLength;
    }

    public void insert(int item){
        if(items.length == insertCount){
            int[] newItems = new int[insertCount * 2];
            for (int i = 0; i < insertCount; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[insertCount++] = item;
    }

    public int indexOf(int item){
        int indexOf = -1;
        for (int i = 0; i < items.length; i++)
            if(item == items[i]) {
                indexOf = i;
                return indexOf;
            }
        return indexOf;
    }

    public void remove(int item){
        int foundIndex = indexOf(item);
        if (foundIndex != -1){
            for (int i = foundIndex; i < insertCount-1; i++){
                items[i] = items[i+1];
            }
            insertCount--;
        }
        else {
            System.out.println("Item not found!");
        }

    }

    public int length(){
        return items.length;
    }

    public void print(){
        for(int i=0; i<insertCount; i++){
            System.out.println(items[i]);
        }
    }


}
