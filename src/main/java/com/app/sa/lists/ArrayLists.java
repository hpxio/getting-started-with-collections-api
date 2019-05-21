
package com.app.sa.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.app.sa.LoadClassMethods;

public class ArrayLists {

    private static ArrayListsDemo arrayListDemo = new ArrayListsDemo();

    public static void main(String[] args) {
        arrayListDemo.callClassMethods();
    }
}

/**
 * Iterable > Collection > List > ArrayList (extends
 * AbstractCollection > AbstractList )
 */
class ArrayListsDemo extends LoadClassMethods {

    // Specific type list //
    private ArrayList<String> strList = new ArrayList<>();

    // Generic (non-typed) list //
    private ArrayList genList = new ArrayList<>();

    /**
     * Add data to the given data structure.
     */
    @Override
    public void addData() {

        // String List //
        strList.add("AKJH");
        strList.add("JDHG");
        strList.add("JDHG");
        strList.add("GUY");
        strList.add("IUYi");
        // Illegal entry //
        // strList.add ( 23 );
        // strList.add ( 'A' );

        // Adding at index //
        strList.add(2, "FINN");

        // Generic List //
        genList.add(34);
        genList.add('A');
        genList.add("Hi");
        genList.add(3.435F);
    }

    /**
     * Modify data in the given data structure.
     */
    @Override
    public void modifyData() {
        // String List //
        strList.set(4, "RECHL");

        // Runtime exception - since no data in this index
        // //
        // strList.set ( 5, "RECHL" );

        // Generic List //
        genList.set(1, 'G');

        System.out.println("Sorting...");
        sortData();
    }

    /**
     * Remove data from the given data structure.
     */
    @Override
    public void removeData() {
        // String List //
        strList.remove(0);
        // OR //
        strList.remove("GUY");
        // NOTE - If the passed value is not present then
        // there won't be nay change nor any error //
    }

    /**
     * Display data as a sequence of String in given data
     * structure.
     */
    @Override
    public void displayData() {
        // String List //
        System.out.println(strList);

        // Generic List //
        System.out.println(genList);
    }

    /**
     * Iterate through data in the given data structure
     * using Iterator.
     */
    @Override
    public void iterateData() {

        Iterator<String> i = strList.iterator();

        Iterator<?> j = genList.iterator();

        // Using Enhanced For //
        System.out.println("Using Enhanced For...");
        for (Object o : genList) {
            System.out.println(o);
        }

        // Using Iterator //
        System.out.println("\nUsing Ietrator.hasNext()...");
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println(
                "\nUsing Ietrator and ArrayList.size()");
        for (int k = 0; k < genList.size(); k++) {
            System.out.println(j.next());
        }

    }

    public void sortData() {
        Collections.sort(strList);
        System.out.println(strList);
    }

    /**
     * Defines the cause of existence of the given class.
     *
     * @return Description of the current class
     *         demonstration.
     */
    @Override
    public String getDemoDescription() {
        return "Demo simple operations in ArrayList.\n"
                + "Properties:\n 1. Indexed storing & access.\n"
                + "2. Duplicates are not allowed\n"
                + "3. This class is marked as for RandomAccess tag, hence access to ay element is always O(1) complexity.\n"
                + "4. ArrayList is serializable";
    }
}
