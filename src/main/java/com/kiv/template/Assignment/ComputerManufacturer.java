package com.kiv.template.Assignment;

public abstract class ComputerManufacturer {
    public void buildComputer() {
        String hard=addHardDisk();
        String ram=addRAM();
        String keyboard=addKeyboard();
        System.out.println(hard + ram + keyboard);
    }

    public abstract String addKeyboard();

    public  abstract String addRAM();

    public abstract String addHardDisk();
}
