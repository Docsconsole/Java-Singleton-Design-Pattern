package com.docsconsole.tutorials.singletonforserilaliztion;

import java.io.Serializable;

public class Singleton implements Serializable {

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

    /* protected Object readResolve() {
        return getInstance();
    }*/

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

}