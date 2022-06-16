package com.kiv.abstractfactory;

public class DBDaoFactory extends DaoAbstractFactory{

    public Dao createDao(String type) {
        Dao dao=null;
        if(type.equals("emp")){
            return new DBEmpDao();
        }
        else if(type.equals("dept")){
            return new DBDeptDao();
        }
        return dao;
    }
}
