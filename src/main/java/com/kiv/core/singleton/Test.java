package com.kiv.core.singleton;

import com.kiv.core.singleton.Assignement.Logger;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {

        //DateUtil dateUtil1= DateUtil.getInstance();
        //ObjectOutputStream oos= new ObjectOutputStream(Files.newOutputStream(new File("src/main/resources").toPath()));
        //oos.writeObject(dateUtil1);
       // DateUtil dateUtil2=null;
        //ObjectInputStream ois= new ObjectInputStream(Files.newInputStream(new File("src/main/resources").toPath()));
       // dateUtil2 = (DateUtil) ois.readObject();
       // oos.close();
       // ois.close();

//        EnumSingletonDemo instance = EnumSingletonDemo.INSTANCE;
//        instance.getName();
//        System.out.println();

        Logger log= Logger.getInstance();
        log.write("yo");
    }
}
