package com.kiv.flyweight;

public class Rectangle extends Shape {
    public Rectangle() {
        this.label = "rectangle";
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    private String label;

    @Override
    void draw(int length,int breadth,String fillStyle){
        System.out.println("drawing a:"+ label + " with length:" +length+" breadth: "+breadth+"fillStyle:"+fillStyle);
    }
}
