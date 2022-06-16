package com.kiv.abstractfactory;

public class DBDeptDao implements Dao{
    @Override
    public void save() {
        System.out.println("saving dept to DP");
    }
}
