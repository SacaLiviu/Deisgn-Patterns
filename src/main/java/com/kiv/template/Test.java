package com.kiv.template;

public class Test {
    public static void main(String[] args) {
        DataRenderer xmlRenderer= new XMLDataRenderer();
        xmlRenderer.render();
        DataRenderer csvRenderer= new CSVDataRenderer();
        csvRenderer.render();
    }
}
