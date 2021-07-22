package org.handson.designpatterns.creational.AbstractFactory.factories;

import org.handson.designpatterns.creational.AbstractFactory.resources.AWSEc2;
import org.handson.designpatterns.creational.AbstractFactory.resources.AWSS3;
import org.handson.designpatterns.creational.AbstractFactory.resources.Instance;
import org.handson.designpatterns.creational.AbstractFactory.resources.Storage;

public class AWSResourceFactory extends AbstractResourceFactory {

    @Override
    public Instance createInstance(Instance.Type type, int capacityInGB) {
        return new AWSEc2( Instance.Type.large, 10240);
    }

    @Override
    public Storage createStorage(int capacityInGB) {
        return new AWSS3(capacityInGB);
    }
}
