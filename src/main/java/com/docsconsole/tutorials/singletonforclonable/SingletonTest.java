package com.docsconsole.tutorials.singletonforclonable;

public class SingletonTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton1.hashCode());
        System.out.println(singleton1.clone().hashCode());

    }

}