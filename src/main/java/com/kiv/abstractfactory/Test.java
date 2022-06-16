package com.kiv.abstractfactory;

public class Test {
    public static void main(String[] args) {
        DaoAbstractFactory daf = DaoProducer.produce("db");
        Dao dao=daf.createDao("dept");
        dao.save();

    }
}
