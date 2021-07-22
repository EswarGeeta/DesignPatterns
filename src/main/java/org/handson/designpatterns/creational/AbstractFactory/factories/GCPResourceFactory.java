package org.handson.designpatterns.creational.AbstractFactory.factories;

import org.handson.designpatterns.creational.AbstractFactory.resources.*;
import org.handson.designpatterns.creational.AbstractFactory.resources.GCPCloudStorage;
import org.handson.designpatterns.creational.AbstractFactory.resources.GCPComputeEngine;
import org.handson.designpatterns.creational.AbstractFactory.resources.Instance;
import org.handson.designpatterns.creational.AbstractFactory.resources.Storage;

public class GCPResourceFactory extends AbstractResourceFactory {

    @Override
    public Instance createInstance(Instance.Type type, int capacityInGB) {
        return new GCPComputeEngine( Instance.Type.large, 10240);
    }

    @Override
    public Storage createStorage(int capacityInGB) {
        return new GCPCloudStorage(capacityInGB);
    }
}
