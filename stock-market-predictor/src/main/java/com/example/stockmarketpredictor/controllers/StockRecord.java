package com.example.stockmarketpredictor.controllers;

import java.math.BigDecimal;

public class StockRecord {
    public StockRecord(String date, double open, double high, double low, double close, BigDecimal volume, String name) {
        this.date = date;
        this.name = name;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;

    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    private String date, name;
    private double open, high , low, close;
    BigDecimal volume;







    public String toString() {
        return "date: "+ date + "   open "+ open+"  high: "+ high+ "  low: " + low+ "  close: " + close + " volume: " + volume
                + "  name: "+ name ;
    }
}


