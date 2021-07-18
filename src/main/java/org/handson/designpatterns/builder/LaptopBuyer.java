package org.handson.designpatterns.builder;

import org.handson.designpatterns.builder.LaptopConfigurations.CPU;
import org.handson.designpatterns.builder.LaptopConfigurations.RAM;

public class LaptopBuyer {
    public static void main(String[] args) {
        Laptop laptop = new Laptop.LaptopBuilder(CPU.Core_i7, RAM.GB_16)
                .build();
        System.out.print(laptop);
    }
}
