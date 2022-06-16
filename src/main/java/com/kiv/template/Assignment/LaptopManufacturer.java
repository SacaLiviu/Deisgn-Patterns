package com.kiv.template.Assignment;

public class LaptopManufacturer extends  ComputerManufacturer{
    @Override
    public String addKeyboard() {
        return "Added keyboard to Laptop";
    }

    @Override
    public String addRAM() {
        return "Added ram to laptop";
    }

    @Override
    public String addHardDisk() {
        return "Added hard to laptop";

    }
}
