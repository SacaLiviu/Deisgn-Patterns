package com.kiv.factory.Assignment;

import com.kiv.factory.Pizza;
import com.kiv.factory.PizzaFactory;

public class PersonWish {
    public Person createWish(String type){
        Person p = PersonFactory.wish(type);
        assert p != null;
        p.wish(type);
        return p;
    }
}
