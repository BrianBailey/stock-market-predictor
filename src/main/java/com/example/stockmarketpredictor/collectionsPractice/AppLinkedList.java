package com.example.stockmarketpredictor.collectionsPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AppLinkedList {

    /*
    ArrayList manage arrays internally
     */

    public static void main(String[] args){

        List<Integer> arrayList = new ArrayList<Integer>();

        /*
        LinkedLists consists of elements where each element
        has a reference to the previous and next element
         */

        List<Integer> linkedList = new LinkedList<Integer>();

        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);

    }

    private static void doTimings(String type, List<Integer> list) {
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();


//        // Add items at end of list
//        for (int i=0; i<1E5; i++){
//            list.add(i);
//        }

        // Add items elsewhere in list
        for (int i = 0; i <1E5; i++){
            list.add(list.size() - 100,i);
        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken: "+ (end - start) + "ms for  "+ type);

    }




}
