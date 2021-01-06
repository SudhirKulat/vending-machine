package com.vending.example;

public interface VendingMachineInterface {
    void insertCoin(Product product);
    Product selectProductAndGetPrice();
    void displayProduct();
    void reset();
}
