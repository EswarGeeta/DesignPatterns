package org.handson.designpatterns.SimpleFactory;

import org.handson.designpatterns.builder.Laptop;
import org.handson.designpatterns.builder.LaptopConfigurations.CPU;
import org.handson.designpatterns.builder.LaptopConfigurations.OperatingSystem;
import org.handson.designpatterns.builder.LaptopConfigurations.RAM;

/*
A simple factory instatiates different objects based on simple input.
This factory might create the instances by itself or can use a builder pattern as well.
To show that as example, I have combined the builder pattern here.
 */

public class LaptopFactory {

    public static final String WINDOWS_STANDARD = "windows_standard";
    public static final String MAC_STANDARD = "mac_standard";
    public static final String LINUX_STANDARD = "linux_standard";

    public static Laptop getInstance(String model) {
        switch (model) {
            case WINDOWS_STANDARD:
                return new Laptop.LaptopBuilder(CPU.Core_i7, RAM.GB_16)
                        .withOperatingSystem(OperatingSystem.Windows10)
                        .build();
            case MAC_STANDARD:
                return new Laptop.LaptopBuilder(CPU.Core_i7, RAM.GB_16)
                        .withOperatingSystem(OperatingSystem.Mac14)
                        .build();
            case LINUX_STANDARD:
                return new Laptop.LaptopBuilder(CPU.Core_i7, RAM.GB_16)
                        .withOperatingSystem(OperatingSystem.Ubuntu18)
                        .build();
            default:
                throw new IllegalStateException("Unexpected laptop model: " + model);
        }
    }
}
