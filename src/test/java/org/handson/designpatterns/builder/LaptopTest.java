package org.handson.designpatterns.builder;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.handson.designpatterns.builder.LaptopConfigurations.CPU;
import org.handson.designpatterns.builder.LaptopConfigurations.OperatingSystem;
import org.handson.designpatterns.builder.LaptopConfigurations.RAM;
import org.junit.jupiter.api.Test;


public class LaptopTest {

    @Test
    public void testLaptopDefaultOperatingSystem() {
        Laptop laptop = new Laptop.LaptopBuilder(CPU.Core_i5, RAM.GB_8)
                .build();
        assertEquals(OperatingSystem.Windows10, laptop.getOperatingSystem());
    }

    @Test
    public void whenInvalidParameterExceptionThrown_thenAssertionSucceeds() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Laptop laptop = new Laptop.LaptopBuilder(CPU.Core_i7, RAM.GB_16)
                    .withStorageType(StorageType.HDD)
                    .withStorage(Storage.GB_256)
                    .withOperatingSystem(OperatingSystem.Windows10)
                    .build();
        });
    }

}
