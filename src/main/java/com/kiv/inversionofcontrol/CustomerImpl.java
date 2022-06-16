package com.kiv.inversionofcontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerImpl implements Customer{

    //Setter injection
//    public CreditCard getCreditCard() {
//        return creditCard;
//    }
//
//    @Autowired
//    public void setCreditCard(CreditCard creditCard) {
//        this.creditCard = creditCard;
//    }

    //@Autowired
    private CreditCard creditCard;

    @Autowired
    CustomerImpl(CreditCard creditCard){
        this.creditCard=creditCard;
    }




    @Override
    public void pay() {
        creditCard.makePayment();
    }
}
