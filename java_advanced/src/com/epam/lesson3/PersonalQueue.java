package com.epam.lesson3;

import java.util.Stack;

public class PersonalQueue<E> {

    private Stack<E> s1;
    private Stack<E> s2;
    private int size;

    PersonalQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
        size = 0;
    }

    public int size() {
        return size;
    }

    //like add
    public boolean offer(E el) {
        s1.push(el);
        size++;
        return true;
    }

    //extract
    public Object poll() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        size--;
        return s2.pop();
    }

    //look but don't touch
    public Object peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

}
