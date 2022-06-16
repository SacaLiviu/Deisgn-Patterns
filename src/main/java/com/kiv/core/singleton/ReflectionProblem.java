package com.kiv.core.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionProblem {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        DateUtil instance1=DateUtil.getInstance();
        DateUtil instance2=null;

        Constructor[] constructors = DateUtil.class.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            constructor.setAccessible(true);
            instance2= (DateUtil) constructor.newInstance();
            break;
        }
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
