package com.vending.example;


public class Home {
    public static void main(String[] args){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.displayProduct();
        Product product = vendingMachine.selectProductAndGetPrice();
        vendingMachine.insertCoin(product);
        vendingMachine.displayProduct();
    }
}
