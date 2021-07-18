package org.handson.designpatterns.builder;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.handson.designpatterns.builder.LaptopConfigurations.CPU;
import org.handson.designpatterns.builder.LaptopConfigurations.OperatingSystem;
import org.handson.designpatterns.builder.LaptopConfigurations.RAM;

enum Storage { GB_256, GB_512, TB_1 }
enum StorageType { SSD, HDD }
enum Resolution { PX_1920_1080, PX_1366_768 }

@Getter
@Setter(AccessLevel.PRIVATE)
public class Laptop {
    private CPU cpu;
    private RAM ram;
    private Storage storage;
    private StorageType storageType;
    private Resolution resolution;
    private OperatingSystem operatingSystem;

    /*
    Private constructor so that clients can not create Laptop object with New. They need to use Builder only.
     */
    private Laptop() {
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "cpu=" + cpu +
                ", ram=" + ram +
                ", storage=" + storage +
                ", storageType=" + storageType +
                ", resolution=" + resolution +
                ", operatingSystem=" + operatingSystem +
                '}';
    }

    public static class LaptopBuilder {
        private CPU cpu;
        private RAM ram;
        private Storage storage;
        private StorageType storageType;
        private Resolution resolution;
        private OperatingSystem operatingSystem;

        /*
        CPU and RAM are the basic necessary fields for laptop. So, they are kept in constructor.
        All remaining optional fields can be set using "with" methods.
         */
        public LaptopBuilder(CPU cpu, RAM ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public LaptopBuilder withStorage(Storage storage) {
            this.storage = storage;
            return this;
        }

        public LaptopBuilder withStorageType(StorageType storageType) {
            this.storageType = storageType;
            return this;
        }

        public LaptopBuilder withResolution(Resolution resolution) {
            this.resolution = resolution;
            return this;
        }

        public LaptopBuilder withOperatingSystem(OperatingSystem operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Laptop build() {
            Laptop laptop = new Laptop();
            laptop.setCpu(this.cpu);
            laptop.setRam(this.ram);
            laptop.setStorage(this.storage);
            laptop.setStorageType(this.storageType);
            laptop.setResolution(this.resolution);
            laptop.setOperatingSystem(this.operatingSystem);

            validate(laptop);
            addDefaults(laptop);


            return laptop;
        }

        private void validate(Laptop laptop) {
            if(laptop.getStorageType() == StorageType.HDD && laptop.getStorage() == Storage.GB_256) {
                throw new IllegalArgumentException("HDD storage type with 256GB storage is not available");
            }
        }

        private void addDefaults(Laptop laptop) {
            if(laptop.getResolution() == null)
                laptop.setResolution(Resolution.PX_1920_1080);
            if(laptop.getStorage() == null)
                laptop.setStorage(Storage.GB_512);
            if(laptop.getStorageType() == null)
                laptop.setStorageType(StorageType.HDD);
            if(laptop.getOperatingSystem() == null)
                laptop.setOperatingSystem(OperatingSystem.Windows10);
        }
    }

}
