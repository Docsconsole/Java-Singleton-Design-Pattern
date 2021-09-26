package com.docsconsole.tutorials.threadsafeinitialization;

public class SingletonThread extends Thread {

    private Singleton singleton;

    SingletonThread(String threadName) {
        Thread.currentThread().setName(threadName);
    }

    @Override
    public void run() {
        System.out.println("Current Thread: " + Thread.currentThread().getName());
        this.singleton = Singleton.getInstance();
        System.out.println("Object is: " + this.singleton.hashCode());
    }

}