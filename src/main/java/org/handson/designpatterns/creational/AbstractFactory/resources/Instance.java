package org.handson.designpatterns.creational.AbstractFactory.resources;

public class Instance {
    public enum Type { micro, large, xlarge };
    Type type;
    int capaticyInGB;
    Storage storage;

    public Instance(Type type, int capaticyInGB) {
        this.type = type;
        this.capaticyInGB = capaticyInGB;
    }

    public void attachStorage(Storage storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Instance{" +
                "\nInstanceClass=" + this.getClass().getSimpleName() +
                "\n capaticyInGB=" + capaticyInGB +
                ",\n StorageClass=" + storage.getClass().getSimpleName() +
                ",\n storage=" + storage +
                '}';
    }
}
