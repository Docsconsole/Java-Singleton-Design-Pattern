package com.docsconsole.tutorials.staticblockinitialization;

public class Singleton {

    private static final Singleton instance;

    static {
        instance = new Singleton();
    }

    private Singleton() {
        System.out.println("Singleton object creation...");
    }

    public static Singleton getInstance() {
        return instance;
    }
}