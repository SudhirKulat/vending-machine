package com.vending.example;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private List<Product> products;

    public ProductList() {
       this.products = new ArrayList<>();
       this.products.add(new Product(123,"Beer",120,5));
       this.products.add(new Product(124,"Cake",20,2));
       this.products.add(new Product(125,"Chips",5,10));
       this.products.add(new Product(126,"Peanuts",15,20));
    }

    public void displayAllProducts(){
        products.forEach(product -> System.out.println(product));
    }

    public Product getProduct(int id){
       return products.stream().filter(product -> product.getId()==id).findFirst().orElse(null);
    }
}
