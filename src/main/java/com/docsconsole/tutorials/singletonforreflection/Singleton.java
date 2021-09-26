package com.docsconsole.tutorials.singletonforreflection;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        if (instance != null) {
            throw new InstantiationError("Error creating object");
        }
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}