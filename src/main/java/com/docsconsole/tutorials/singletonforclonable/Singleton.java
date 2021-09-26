package com.docsconsole.tutorials.singletonforclonable;

public class Singleton implements Cloneable {

    private static final Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("Singleton object creation...");
    }

    public static Singleton getInstance() {
        return instance;
    }

    public Object clone() throws CloneNotSupportedException {
        //return super.clone();
        throw new CloneNotSupportedException();
    }
}