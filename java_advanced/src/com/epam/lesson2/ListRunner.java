package com.epam.lesson2;

import java.util.*;

public class ListRunner {

    public static void main(String[] args) {

        //1. Check if String has only unique characters
        System.out.println("The string has unique characters: " + strHasAllUniqueChars("abcb"));

        //2. Remove duplicates from unsorted list
        LinkedList<Integer> unsortedLinkedList = new LinkedList<>();
        unsortedLinkedList.add(1);
        unsortedLinkedList.add(2);
        unsortedLinkedList.add(3);
        unsortedLinkedList.add(4);
        unsortedLinkedList.add(3);
        System.out.println(removeDuplicatesFromList(unsortedLinkedList));

        //3. Get n-th to the last element of com.epam.lesson2.SinglyLinkedList
        List singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add(10);
        singlyLinkedList.add(20);
        singlyLinkedList.add(30);
        singlyLinkedList.add(40);
        Object o = singlyLinkedList.get(2);
        o = 1;
        System.out.println("Result list looks like: " + singlyLinkedList);
        int index = 2;
        System.out.println(index + " to the last element is: " + getNthToLastElement(2, singlyLinkedList));

        //4. Remove element from the middle of list
        singlyLinkedList.remove(index);
        System.out.println("After remove element with index " + 2 + " the list looks like: " + singlyLinkedList);


    }

    private static List<Integer> removeDuplicatesFromList(List<Integer> list) {
        /*Set<Integer> set = new HashSet<>();
        set.addAll(list);
        return new ArrayList<>(set);*/

       /*return list.stream().distinct().collect(Collectors.toList());*/

        for (int index = 0; index < list.size(); index++) {
            Integer currElement = list.get(index);
            for (Iterator iterator = list.listIterator(index + 1); iterator.hasNext(); ) {
                if (iterator.next().equals(currElement)) {
                    iterator.remove();
                }
            }
        }
        return list;
    }


    private static boolean strHasAllUniqueChars(String str) {
        List<String> arrL = Arrays.asList(str.split(""));
        Set<String> set = new HashSet<>();
        for (String s : arrL) {
            if (set.contains(s)) {
                return false;
            }
            set.add(s);
        }
        return true;
    }

    private static Object getNthToLastElement(int index, List list) {
        if (list.size() < index) {
            throw new IndexOutOfBoundsException();
        }
        int targetIndex = list.size() - index;
        return list.get(targetIndex);
    }

}
