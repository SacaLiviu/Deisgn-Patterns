package com.kiv.factory.Assignment;



public class PersonFactory {

    public static Person wish(String type) {
        Person p = null;
        if (type.equals("male")) {
            p = new Male();
        } else if (type.equals("female")) {
            p = new Female();
        }
        return p;
    }

}
