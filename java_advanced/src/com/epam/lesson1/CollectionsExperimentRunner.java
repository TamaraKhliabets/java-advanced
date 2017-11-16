package com.epam.lesson1;

import java.util.*;

public class CollectionsExperimentRunner {

    public static void main(String[] args) {
        //Experimenting with ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(7);
        list.add(10);
        //list.forEach(it -> System.out.println(it));
        for (Iterator i = list.iterator(); i.hasNext(); ) {
            System.out.println(i.next());
        }
        System.out.println(list.get(1));
        System.out.println(list.contains(10));
        System.out.println(list.isEmpty());
        System.out.println(Collections.addAll(list, 1, 2, 3));
        Integer abc = 123;
        list.add(123);
        System.out.println(list.indexOf(abc));

        //Experimenting with Map
        Map<String, String> map = new HashMap<>();
        map.put("Hello", "world");
        map.put("Yo", "guys");
        System.out.println(map.isEmpty());
        System.out.println(map.values());
        System.out.println(map.get("Yo"));
        System.out.println();
    }
}
