package com.kiv.iterator;

public class Test {
    public static void main(String[] args) {
        ProductCollection products= new ProductCollection();
        products.addProduct(new Product("iphone"));
        products.addProduct(new Product("Samsung"));
        products.addProduct(new Product("MAC"));
        Iterator iterator = products.createIterator();
        while(iterator.hasNext()){
            Product object =(Product) iterator.next();
            System.out.println(object.getName());
        }
    }
}
