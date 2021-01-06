package com.vending.example;

public class Product {

    private int id;
    private String item;
    private int price;
    private int qty;


    public Product(int id, String item, int price, int qty) {
        this.id = id;
        this.item = item;
        this.price = price;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return  id+" | "+item+" | "+price+" | "+qty;
    }
}
