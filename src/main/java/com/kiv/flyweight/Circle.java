package com.kiv.flyweight;

public class Circle extends Shape {
    public Circle() {
       this.label="circle";
    }

    public String getLabel() {
        return label;
    }


    private String label;
    @Override
    void draw(int radius,String fillColor,String lineColor){
        System.out.println("drawing a:"+ label + " with radius:" +radius+" Fill color: "+fillColor+"line color:"+lineColor);
    }
}
