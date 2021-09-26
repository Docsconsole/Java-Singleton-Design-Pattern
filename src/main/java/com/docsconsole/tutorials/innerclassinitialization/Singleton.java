package com.docsconsole.tutorials.innerclassinitialization;

public class Singleton {

    private Singleton() {
        System.out.println("Singleton object creation...");
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }
}