package com.example.stockmarketpredictor.controllers;



import com.example.stockmarketpredictor.models.StockData;

import java.util.*;

public class NewsParser {

    public static void main(String[] args) {

        StockData stockData = new StockData();
       // stockData.loadDataFromFile("C:\\stocks\\gm-ford-news-yahoo.txt");
        // Set text in a string
        String text = "Good morning class. Have a good learning class. Enjoy learning with fun!";
        // Create a TreeMap to hold words as key and count as value
        //String text = stockData.loadDataFromFile("C:\\stocks\\gm-ford-news-yahoo.txt");
        //System.out.println(stockData.loadDataFromFile("C:\\stocks\\gm-ford-news-yahoo.txt"));
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        String[] words = text.split(" "); //Splitting sentance based on String
        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();
            if (key.length() > 0) {
                if (map.get(key) == null) {
                    map.put(key, 1);
                } else {
                    int value = map.get(key).intValue();
                    value++;
                    map.put(key, value);
                }
            }
        }
        System.out.println(map);
    }


}
