package org.handson.designpatterns.creational.Singleton;

public class LazySingletonUsingInnerClass {

    private LazySingletonUsingInnerClass() {
    }

    /*
    This is lazy initialization as the instance won't be created until client calls getInstance method
     */
    private static class InstanceHolder {
        private static LazySingletonUsingInnerClass INSTANCE = new LazySingletonUsingInnerClass();
    }

    public static LazySingletonUsingInnerClass getInstance() {
        return InstanceHolder.INSTANCE;
    }

}
