package com.kiv.iterator;

public class ProductIterator implements Iterator{

    Product[] products;
    int pos=0;

    public ProductIterator(Product[] products){
        this.products=products;
    }
    @Override
    public boolean hasNext() {
        return pos < products.length && products[pos] != null;
    }

    @Override
    public Object next() {
        return products[pos++];
    }
}
