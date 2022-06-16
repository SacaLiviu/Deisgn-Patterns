package com.kiv.factory;

public class CheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing cheese pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking cheesepizza");

    }

    @Override
    public void cut() {
        System.out.println("cutting cheese pizza");

    }
}
