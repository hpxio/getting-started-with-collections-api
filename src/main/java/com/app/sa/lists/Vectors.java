package com.app.sa.lists;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vectors {

    Vector<String> V = new Vector<>(5, 2);

    public void add() {
        V.addElement("Apple");
        V.addElement("Banana");
        V.addElement("Cherry");
    }

    public void display() {
        // <- OR -> //
        this.V.stream().forEach(System.out::println);

        // <- OR -> //
        Iterator<String> I = V.iterator();
        if (I.hasNext())
            System.out.println(I.next());

        Enumeration<String> e = this.V.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }

    public static void main(String[] args) {
        Vectors vectors = new Vectors();
        vectors.add();
        vectors.display();
    }
}