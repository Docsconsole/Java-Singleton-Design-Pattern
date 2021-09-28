package com.docsconsole.tutorials.lazyinitialization;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    	System.out.println("Singleton object creation...");
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}