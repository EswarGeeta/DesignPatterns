package org.handson.designpatterns.creational.Singleton;

public class Client {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        if(eagerSingleton1 == eagerSingleton2) {
            System.out.println("Both refer to same instance");
        }

        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        if(lazySingleton1 == lazySingleton2) {
            System.out.println("Both refer to same instance");
        }

        LazySingletonUsingInnerClass lazySingletonUsingInnerClass1 = LazySingletonUsingInnerClass.getInstance();
        LazySingletonUsingInnerClass lazySingletonUsingInnerClass2 = LazySingletonUsingInnerClass.getInstance();
        if(lazySingletonUsingInnerClass1 == lazySingletonUsingInnerClass2) {
            System.out.println("Both refer to same instance");
        }


    }
}
