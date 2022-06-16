package com.kiv.proxy;

import java.util.List;

public class CustomerImpl implements Customer{
    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    private int id;
    private List<Order> orders;

    CustomerImpl(){
        this.id=1;
    }

}
