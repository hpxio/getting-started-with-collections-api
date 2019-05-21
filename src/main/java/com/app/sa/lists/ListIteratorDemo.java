package com.app.sa.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

// FIXME: Not working //
public class ListIteratorDemo {

    List<Integer> I = new ArrayList<>();
    ListIterator<Integer> L = I.listIterator();

    public void add(Integer i) {
        this.I.add(i);
    }

    public void display() {
        this.I.stream().forEach(System.out::println);
    }

    /**
     * Remove odd numbers from the list and add twice the
     * value removed in the location.
     */
    public void removeOdd() {
        int m = 0;
        while (L.hasNext()) {
            m = L.next();
            if (m % 2 != 0) {
                L.remove();
                L.add(m * 2);
            }
        }
    }

    public static void main(String[] args) {
        ListIteratorDemo demo = new ListIteratorDemo();
        demo.add(0);
        demo.add(1);
        demo.add(7);
        demo.add(9);
        demo.add(2);
        demo.add(4);
        demo.add(3);
        demo.display();

        demo.removeOdd();
        demo.display();

    }
}