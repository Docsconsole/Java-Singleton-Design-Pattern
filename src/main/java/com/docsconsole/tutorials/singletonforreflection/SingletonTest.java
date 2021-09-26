package com.docsconsole.tutorials.singletonforreflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.hashCode());

        Singleton singleton2 = null;
        try {
            Constructor[] constructors = Singleton.class.getDeclaredConstructors();

            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                singleton2 = (Singleton) constructor.newInstance();
                break;
            }

        } catch (IllegalAccessException | InvocationTargetException | InstantiationException exception) {
            exception.printStackTrace();
        }


        System.out.println(singleton2.hashCode());

    }

}