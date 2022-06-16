package com.kiv.decorator;

public class ChickenPizzaDecorator extends PizzaDecorator {

    public ChickenPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public void bake(){
        super.bake();
        addChicken();
    }

    private void addChicken() {
        System.out.println("Chicken");
    }
}

