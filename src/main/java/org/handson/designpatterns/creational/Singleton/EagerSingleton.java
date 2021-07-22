package org.handson.designpatterns.creational.Singleton;

public class EagerSingleton {

    private EagerSingleton() {
    }

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
