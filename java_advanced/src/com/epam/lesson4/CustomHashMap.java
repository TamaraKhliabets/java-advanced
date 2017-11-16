package com.epam.lesson4;

import java.util.*;

public class CustomHashMap<K,V>{

    private class Record<K2,V2>{

        private V2 value;
        private K2 key;

        Record(K2 key, V2 value){
            this.key = key;
            this.value = value;
        }
    }

    private ArrayList<Record<K,V>> list;
    private int size;

    CustomHashMap(){
        size = 0;
        list = new ArrayList<>();
    }


    public V get(K key) {
        for(int i = 0; i<list.size(); i++ ){
            if (list.get(i).key.equals(key)){
                return list.get(i).value;
            }
        }
        return null;
    }

    public V push(K key, V value){
        for(int i = 0; i<list.size(); i++ ){
            if (list.get(i).key.equals(key)){
                list.remove(i);
                size--;
                break;
            }
        }
        list.add(new Record(key, value));
        size++;
        return value;
    }

    public boolean remove(K key){
        boolean flag = false;
        for(int i = 0; i<list.size(); i++ ){
            if (list.get(i).key.equals(key)){
                list.remove(i);
                flag = true;
                size--;
                break;
            }
        }
        return flag;
    }

    public int size() {
        return size;
    }
}
