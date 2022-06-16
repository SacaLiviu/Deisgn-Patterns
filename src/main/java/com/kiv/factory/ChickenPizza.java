package com.kiv.factory;

public class ChickenPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Chicken pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking Chicken pizza");

    }

    @Override
    public void cut() {
        System.out.println("cutting Chicken pizza");

    }
}
