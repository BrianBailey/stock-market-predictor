package com.example.stockmarketpredictor.controllers;


public class Inventory {

    private String item;
    private int qty;
    private float price;

    public Inventory(String item, int qty, float price) {
        this.item = item;
        this.qty = qty;
        this.price = price;
    }

    public float getTotal(){

        return qty * price;
    }

    public String toString() {
        return "Item: " + item + "\n" + "Quantiity: " + qty
            + "\n" + "Price: "  + price;
    }

}
