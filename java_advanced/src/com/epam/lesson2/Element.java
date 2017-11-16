package com.epam.lesson2;

public class Element {

    private Object value;
    private Element next;

    public Element(Object value){
        this.value = value;
    }

    public Element(Object value, Element next){
        this.value = value;
        this.next = next;
    }

    /**
     * Getters and setters (see lombok)
     */
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }
}
