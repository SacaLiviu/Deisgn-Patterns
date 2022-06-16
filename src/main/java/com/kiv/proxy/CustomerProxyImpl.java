package com.kiv.proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer{

    CustomerImpl customer = new CustomerImpl();

    @Override
    public int getId() {
        return customer.getId();
    }

    @Override
    public List<Order> getOrders() {
        ArrayList<Order> orders= new ArrayList<Order>();
        Order order = new Order();
        order.setId(1);
        order.setProductName("This is order 1");
        order.setQuantity(100);
        orders.add(order);
        Order order2 = new Order();
        order2.setId(2);
        order2.setProductName("This is order 2");
        order2.setQuantity(50);
        orders.add(order2);
        return orders;
    }
}
