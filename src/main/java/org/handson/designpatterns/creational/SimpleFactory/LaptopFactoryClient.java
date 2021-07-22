package org.handson.designpatterns.creational.SimpleFactory;

import org.handson.designpatterns.creational.builder.Laptop;

public class LaptopFactoryClient {
    public static void main(String[] args) {
        Laptop windowsLaptop = LaptopFactory.getInstance(LaptopFactory.WINDOWS_STANDARD);
        System.out.println(windowsLaptop);
    }
}
