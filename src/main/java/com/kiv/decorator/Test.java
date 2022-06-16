package com.kiv.decorator;

public class Test {
    public static void main(String[] args) {
        Pizza pizza= new CheesePizzaDecorator(new PlainPizza());
        pizza.bake();
        //we can add decorator inside decorator like this

        Pizza pizza2=new ChickenPizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
        pizza2.bake();
    }
}
