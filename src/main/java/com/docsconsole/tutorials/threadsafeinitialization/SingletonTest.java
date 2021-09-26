package com.docsconsole.tutorials.threadsafeinitialization;

public class SingletonTest {

    public static void main(String[] args) {

        SingletonThread th1 = new SingletonThread("Thread-one");
        SingletonThread th2 = new SingletonThread("Thread-two");

        th1.start();
        th2.start();

    }

}