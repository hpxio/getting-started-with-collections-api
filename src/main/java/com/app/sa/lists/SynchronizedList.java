package com.app.sa.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * AL is not Thread Safe. To retain threas safety we go for
 * Vector. But if we need Synchronized AL we use
 * Collections.synchronized() method.
 */
public class SynchronizedList {

    /*
     * TODO: Put up a better example to demo this scenario
     */

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();

        /*
         * To make the above list as Thread Safe or
         * Synchronized we can use Collections method as
         * follows.
         */
        List<Integer> L = Collections.synchronizedList(l);

        Thread T1, T2, TA, TB;

        /*
         * Instaed of passing just the simple List we can
         * now pass the thread safe one.
         */
        boolean isSafe = true;
        if (isSafe) {
            TA = new Thread(new AnomalyInAlWithThread1(L));
            TB = new Thread(new AnomalyInAlWithThread1(L));
            TA.start();
            TB.start();
        } else {
            T1 = new Thread(new AnomalyInAlWithThread1(l));
            T2 = new Thread(new AnomalyInAlWithThread1(l));
            T1.start();
            T2.start();
        }
    }
}

class AnomalyInAlWithThread1 implements Runnable {
    List<Integer> list;

    public AnomalyInAlWithThread1(List<Integer> l) {
        this.list = l;
    }

    @Override
    public void run() {

        System.out.println(list + " :: "
                + Thread.currentThread().getName());

        list.add(12);
        System.out.println(list + " :: "
                + Thread.currentThread().getName());

        list.add(34);
        System.out.println(list + " :: "
                + Thread.currentThread().getName());
    }

}
