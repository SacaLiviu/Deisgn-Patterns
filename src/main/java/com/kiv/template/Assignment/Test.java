package com.kiv.template.Assignment;

public class Test {
    public static void main(String[] args) {
        ComputerManufacturer a= new LaptopManufacturer();
        a.buildComputer();
        ComputerManufacturer a2= new DesktopManufacturer();
        a2.buildComputer();

    }
}
