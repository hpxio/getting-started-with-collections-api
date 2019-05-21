
package com.app.sa;

public abstract class LoadClassMethods {

    /**
     * Load methods from the class.
     */
    public void callClassMethods() {

        System.out.println(getDemoDescription());

        System.out.println("Adding Data...");
        addData();

        System.out.println("After Adding...");
        displayData();

        System.out.println("\nModifying Data...");
        modifyData();

        System.out.println("After Modifying...");
        displayData();

        System.out.println("\nRemoving Data...");
        removeData();

        System.out.println("After Removing...");
        displayData();

        System.out.println("\nIterating Data...");
        iterateData();
    }

    /**
     * Add data to the given data structure.
     */
    public abstract void addData();

    /**
     * Modify data in the given data structure.
     */
    public abstract void modifyData();

    /**
     * Remove data from the given data structure.
     */
    public abstract void removeData();

    /**
     * Display data as a sequence of String in given data
     * structure.
     */
    public abstract void displayData();

    /**
     * Iterate through data in the given data structure
     * using Iterator.
     */
    public abstract void iterateData();

    /**
     * Defines the cause of existence of the givern class.
     * 
     * @return Description of the current class
     *         demonstration.
     */
    public String getDemoDescription() {
        return "Explains what this class do."
                + "\nYou can describe the concepts which are used in this class.";
    }

}
