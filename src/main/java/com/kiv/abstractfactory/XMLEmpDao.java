package com.kiv.abstractfactory;

public class XMLEmpDao implements Dao{
    @Override
    public void save() {
        System.out.println("saving emp to xml");
    }
}
