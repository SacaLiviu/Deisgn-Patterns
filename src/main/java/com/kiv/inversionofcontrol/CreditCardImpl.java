package com.kiv.inversionofcontrol;

import org.springframework.stereotype.Component;

@Component
public class CreditCardImpl implements CreditCard{

    @Override
    public void makePayment() {
        System.out.println("Payment made");
    }
}

