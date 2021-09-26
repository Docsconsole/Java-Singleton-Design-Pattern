package com.docsconsole.tutorials.eagerinitialization;

public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("Singleton object creation...");
    }

    public static Singleton getInstance() {
        return instance;
    }

}