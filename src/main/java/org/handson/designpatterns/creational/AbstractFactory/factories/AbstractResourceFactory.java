package org.handson.designpatterns.creational.AbstractFactory.factories;

import org.handson.designpatterns.creational.AbstractFactory.resources.Instance;
import org.handson.designpatterns.creational.AbstractFactory.resources.Storage;

public abstract class AbstractResourceFactory {
    public abstract Instance createInstance(Instance.Type type, int capacityInGB);
    public abstract Storage createStorage(int capacityInGB);
}
