package com.kiv.facade;

public class OrderProcessor {

    public boolean checkStock(String name) {
        System.out.println("Checking stock...");
        return true;
    }

    public String placeOrder(String name, int quantity) {
        System.out.println("Order placed...");
        return "Order1";
    }

    public void shipOrder(String orderId) {
        System.out.println("Order shipped...");
    }
}
