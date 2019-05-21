package com.app.sa.lists;

import java.util.LinkedList;

/**
 * This is a traditional question where in the plain old
 * data structure we use Linked List to implement Stack. Now
 * stack is LIFO. We need to ensure the elements are always
 * added on the top and removed from the top.
 */
public class StackUsingLinkedList {
    Integer max = 5;
    LinkedList<String> list = new LinkedList<>();

    public void push(String s) {
        if (list.size() < max) {
            list.addFirst(s);
        }
    }

    public String pop() {
        if (list.size() != 0) {
            return list.removeFirst();
        } else {
            return "-1";
        }
    }

    public String top() {
        if (list.size() != 0)
            return list.getFirst();
        else
            return "-1";
    }

    public void display() {
        this.list.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        StackUsingLinkedList s = new StackUsingLinkedList();
        s.push("Connor McGregor");
        s.push("Mike Tysom");
        s.display();
        s.pop();
        s.display();
    }

}