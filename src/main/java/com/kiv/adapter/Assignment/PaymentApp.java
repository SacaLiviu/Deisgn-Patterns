package com.kiv.adapter.Assignment;

public class PaymentApp {
    void pay(int lei){
        PaymentAdapter adapter = new PaymentAdapter();
        int dollars=adapter.pay(3);
        System.out.println(dollars);
    };
}
