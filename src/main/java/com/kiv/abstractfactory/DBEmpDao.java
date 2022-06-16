package com.kiv.abstractfactory;

public class DBEmpDao implements Dao{
    @Override
    public void save() {
        System.out.println("saving emp to DP");
    }
}
