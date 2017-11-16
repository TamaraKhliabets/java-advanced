package com.epam.lesson4;

public class MapRunner {

    public static void main(String[] args) {
        //CustomMap
        CustomHashMap<Integer, String> customMap = new CustomHashMap<>();
        customMap.push(2, "Hello");
        customMap.push(2, "World");
        customMap.push(4, "!");
        System.out.println(customMap.get(2));
        System.out.println(customMap.get(4));
        System.out.println(customMap.size());

    }

}
