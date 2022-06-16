package com.kiv.template.Assignment;

public class DesktopManufacturer extends  ComputerManufacturer{
    @Override
    public String addKeyboard() {
        return "Added keyboard to PC";
    }

    @Override
    public String addRAM() {
        return "Added ram to PC";

    }

    @Override
    public String addHardDisk() {
        return "Added hard to PC";

    }
}
