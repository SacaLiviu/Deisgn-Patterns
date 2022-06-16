package com.kiv.factory;

public class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza p = PizzaFactory.createPizza(type);
        assert p != null;
        p.prepare();
        p.bake();
        p.cut();
        return p;
    }
}
