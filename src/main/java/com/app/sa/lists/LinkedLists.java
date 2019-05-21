
package com.app.sa.lists;

import java.util.Iterator;
import java.util.LinkedList;

import com.app.sa.LoadClassMethods;

public class LinkedLists {

    public static DemoLinkedLists demoLinkedLists = new DemoLinkedLists();

    public static void main(String[] args) {

        demoLinkedLists.callClassMethods();
    }

}

class DemoLinkedLists extends LoadClassMethods {

    // OR Singly LinkedList //
    LinkedList<String> stringLinkedList = new LinkedList<>();

    /**
     * Add data to the given data structure.
     */
    @Override
    public void addData() {

        // Add Sequentially at last //
        stringLinkedList.add("ANIM");
        stringLinkedList.add("HUGHES");
        stringLinkedList.add("YASHIKA");
        stringLinkedList.add("GIN");
        stringLinkedList.add("ROMAN");
        stringLinkedList.add("FINN");
        displayData();

        // Invalid Entry //
        // stringLinkedList.add ( 343 );

        // Adding at First //
        System.out.println("Adding at First...");
        stringLinkedList.addFirst("YUOSEF");
        displayData();

        // Adding at Index //
        System.out.println("Adding at Index...");
        stringLinkedList.add(2, "ROGER");
        displayData();
    }

    /**
     * Modify data in the given data structure.
     */
    @Override
    public void modifyData() {
        stringLinkedList.set(1, "VINITA");
        stringLinkedList.add(3, "USHA");
    }

    /**
     * Remove data from the given data structure.
     */
    @Override
    public void removeData() {

        // Remove the head of the list //
        System.out.println("Removing Head...");
        stringLinkedList.remove();
        displayData();

        System.out.println("Removing Index...");
        stringLinkedList.remove(2);
        displayData();

        System.out.println("Removing Last...");
        stringLinkedList.removeLast();
        displayData();

        System.out.println("Removing Specific...");
        stringLinkedList.remove("YASHIKA");
        displayData();
    }

    /**
     * Display data as a sequence of String in given data
     * structure.
     */
    @Override
    public void displayData() {
        System.out.println(stringLinkedList);

        // Display First Element //
        System.out.println(
                "First::" + stringLinkedList.getFirst());

        // Display Last Element //
        System.out.println(
                "Last::" + stringLinkedList.getLast());

        // Display First Element //
        // System.out.println ( "First::" +
        // stringLinkedList.element ( ) );

    }

    /**
     * Iterate through data in the given data structure
     * using Iterator.
     */
    @Override
    public void iterateData() {
        Iterator<String> it = stringLinkedList.iterator();
        for (String str : stringLinkedList) {
            System.out.println(str);
        }

    }

    /**
     * Defines the cause of existence of the givern class.
     *
     * @return Description of the current class
     *         demonstration.
     */
    @Override
    public String getDemoDescription() {
        return null;
    }
}
