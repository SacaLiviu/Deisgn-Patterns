package com.kiv.core.singleton.Assignement;

import com.kiv.core.singleton.DateUtil;

public class Logger implements Cloneable{
    private static volatile Logger instance;

    public static  Logger getInstance() {
        if (instance == null) {
            synchronized (DateUtil.class) {
                if (instance == null) {
                    instance = new Logger();
                }

            }
        }
        return instance;
    }

    public void write(String data){
        System.out.println(data);
    }

    @Override
    protected DateUtil clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
