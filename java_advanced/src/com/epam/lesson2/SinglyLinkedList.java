package com.epam.lesson2;

import java.util.AbstractList;

public class SinglyLinkedList extends AbstractList {

    private int size;
    private Element head;
    private Element tail;

    public SinglyLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }

    public boolean add(Object obj) {
        Element elementToAdd = new Element(obj);
        if (head == null || tail == null) {
            head = elementToAdd;
            tail = elementToAdd;
        } else {
            tail.setNext(elementToAdd);
            tail = elementToAdd;
        }
        size++;
        return true;
    }

    public Element remove(int index) {
        checkIndex(index);
        Element tmp1 = head;
        for (int i = 0; i < index - 1; i++) {
            tmp1 = tmp1.getNext();
        }
        Element tmp2 = tmp1.getNext();
        if (index == size) {
            tmp1.setNext(null);
            tail = tmp1;
        } else {
            tmp1.setNext(tmp2.getNext());
        }
        this.size--;
        return tmp2;
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        Element targetElement = head;
        for (int i = 0; i < index; i++) {
            targetElement = targetElement.getNext();
        }
        return targetElement.getValue();
    }

    private void checkIndex(int index) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public int size() {
        return size;
    }
}
