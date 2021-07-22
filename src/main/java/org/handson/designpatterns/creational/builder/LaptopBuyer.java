package org.handson.designpatterns.creational.builder;

import org.handson.designpatterns.creational.builder.LaptopConfigurations.CPU;
import org.handson.designpatterns.creational.builder.LaptopConfigurations.RAM;

public class LaptopBuyer {
    public static void main(String[] args) {
        Laptop laptop = new Laptop.LaptopBuilder(CPU.Core_i7, RAM.GB_16)
                .build();
        System.out.print(laptop);
    }
}
