package com.example.stockmarketpredictor.controllers;

import com.example.stockmarketpredictor.models.StockData;

import java.io.*;

// java.util.*;      can use this as well

public class Main {

    public static void main(String[] args) {

        StockData stockData = new StockData();

        //StockData stockParse = new StockData();



          stockData.loadDataFromFile("src/main/resources/3_day_gm_data.csv");
//        stockData.loadDataFromFile("C:\\stocks\\individual_stocks_5r.zip\\individual_stocks_5yr\\GE_data.csv");

//        stockData.loadDataFromFile("C:\\stocks\\all_stocks_5yr.csv");
        // see if can pull off of computer  "C:\\stocks\\all_stocks_5yr.csv"
        // C:\stocks
//        stockData.loadDataFromFile("src/main/resources/big_file_stocks.csv");

//        stockData.loadDataFromFile("src/main/resources/gm_data_5_years.csv");
//
//        stockData.loadDataFromFile("src/main/resources/ford_data_5_years.csv");




        System.out.println("Number of records is: "+stockData.getNumberOfRecords());
        System.out.println();

        System.out.println("Record 0 is: "+ stockData.getRecordNumber(0));
        System.out.println();

        System.out.println("Record 1 is: "+ stockData.getRecordNumber(1));
        System.out.println();


        System.out.println("Record 2 is: "+ stockData.getRecordNumber(2));
        System.out.println();

//        System.out.println("Get lowest low: "+ stockData.getLowestLow());
//        System.out.println();
//
//        System.out.println("Get Largest High: "+ stockData.getLargestHigh());
//        System.out.println();
//
//        System.out.println("Get largest open close difference: "+ stockData.getLargestOpeningClosingDiff());
//        System.out.println();
//
//        System.out.println("Get Largest high low difference: "+ stockData.getLargestHighLowDiff());



    }

}