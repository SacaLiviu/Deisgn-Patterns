package com.kiv.adapter.Assignment;

public class PaymentProcessorImpl implements PaymentProcessor{
    @Override
    public void pay(int dollars) {
        System.out.println(dollars);
    }
}
