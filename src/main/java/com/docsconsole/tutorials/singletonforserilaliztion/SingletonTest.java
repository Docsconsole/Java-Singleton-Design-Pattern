package com.docsconsole.tutorials.singletonforserilaliztion;

import java.io.*;

public class SingletonTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //serialization
        Singleton singleton1 = Singleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
        out.writeObject(singleton1);
        out.close();

        //deserialization
        ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
        Singleton singleton2 = (Singleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode=" + singleton1.hashCode());
        System.out.println("instanceTwo hashCode=" + singleton2.hashCode());

    }
}
