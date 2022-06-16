package com.kiv.abstractfactory;

public class XMLDaoFactory extends DaoAbstractFactory{

    public Dao createDao(String type) {
        Dao dao=null;
        if(type.equals("emp")){
            return new XMLEmpDao();
        }
        else if(type.equals("dept")){
            return new XMLDeptDao();
        }
        return dao;
    }
}
