package com.kiv.proxy;

import java.util.List;

public interface Customer {
    int getId();
    List<Order> getOrders();
}
