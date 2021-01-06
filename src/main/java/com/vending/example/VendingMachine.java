package com.vending.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VendingMachine implements VendingMachineInterface {

    ProductList productList = new ProductList();


    @Override
    public void reset() {

    }

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void insertCoin(Product product) {
        try {
            int userAmount =Integer.parseInt(reader.readLine());

            if(coinValidation(userAmount)){
                validateProductPrice(product, userAmount);
            }else {
                System.out.println(UserMessage.WRONG_COIN.getMessage());
                insertCoin(product);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    private void validateProductPrice(Product product, int userAmount) {
        if(userAmount < product.getPrice()){
            System.out.println("You still need "+(product.getPrice()-userAmount)+" Rs. more to complete your order");
            needExtraCoin(product, (product.getPrice()-userAmount));
        }
        else{
            System.out.println("Collect your "+ product.getItem()+" from bucket");
            updateProductList(product);
        }
    }

    private boolean coinValidation(int userAmount) {
        Coin[] coin = Coin.values();
        for(Coin c : coin){
            if(c.getCoinValue()==userAmount){
                return true;
            }
        }
        return false;
    }

    private void needExtraCoin(Product product, int shortAmount) {
        try {
            int userAmount = Integer.parseInt(reader.readLine());

            if(coinValidation(userAmount) && shortAmount == userAmount){
                System.out.println("Collect your "+ product.getItem()+" from bucket");
                updateProductList(product);
            }
            else if(coinValidation(userAmount) && userAmount < shortAmount){
                System.out.println("still need "+(shortAmount-userAmount)+" Rs. more to complete your order");
                needExtraCoin(product, shortAmount-userAmount);
            }
            else {
                System.out.println(UserMessage.WRONG_COIN.getMessage());
                needExtraCoin(product,shortAmount);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void updateProductList(Product product) {
        product.setQty(product.getQty()-1);
    }

    @Override
    public Product selectProductAndGetPrice() {
        System.out.println("please select the product you want using ID...!!");System.out.println();
        System.out.println();

        try {
            String input = reader.readLine();
            Product product =  productList.getProduct(Integer.parseInt(input));
            System.out.println("Please insert "+ product.getPrice()+" Rs. to get "+product.getItem());
            return product;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void displayProduct() {
        System.out.println("----Beer Vending Machine----");
        System.out.println("ID | Item | Rate | Qty");
        productList.displayAllProducts();

    }
}
