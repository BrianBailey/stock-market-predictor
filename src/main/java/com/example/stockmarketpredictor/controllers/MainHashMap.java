package com.example.stockmarketpredictor.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainHashMap {
    public static void main(String args[]) {

        HashMap<String, Double> hm = new HashMap<String, Double>();

        hm.put("A", new Double(3.34));
        hm.put("B", new Double(1.22));
        hm.put("C", new Double(1.00));
        hm.put("D", new Double(9.22));
        hm.put("E", new Double(-19.08));

        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        double balance = hm.get("A");
        hm.put("A", balance + 1000);

        System.out.println(hm.get("A"));
    }
}


