package com.docsconsole.tutorials.threadsafeinitialization;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton object creation...");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            //synchronized (Singleton.class) {
            if (instance == null)
                instance = new Singleton();
        }
        //}
        return instance;
    }
}