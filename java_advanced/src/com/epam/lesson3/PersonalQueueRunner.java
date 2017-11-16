package com.epam.lesson3;

public class PersonalQueueRunner {

    public static void main(String[] args) {

        //Personal Queue based on 2 stacks
        PersonalQueue<Integer> personalQueue = new PersonalQueue<>();
        personalQueue.offer(11);
        personalQueue.offer(12);
        personalQueue.offer(13);
        personalQueue.offer(14);
        System.out.println("poll + poll: " + personalQueue.poll() + " " + personalQueue.poll());
        System.out.println("peek + peek: " + personalQueue.peek() + " " + personalQueue.peek());

        //Strange behavior
        double i = Double.NaN;
        if (i != i) {
            System.out.println("Works!");
        }
    }

}
