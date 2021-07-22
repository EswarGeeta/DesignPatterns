package org.handson.designpatterns.creational.AbstractFactory;

import org.handson.designpatterns.creational.AbstractFactory.factories.AWSResourceFactory;
import org.handson.designpatterns.creational.AbstractFactory.factories.AbstractResourceFactory;
import org.handson.designpatterns.creational.AbstractFactory.factories.GCPResourceFactory;
import org.handson.designpatterns.creational.AbstractFactory.resources.Instance;
import org.handson.designpatterns.creational.AbstractFactory.resources.Storage;

public class AbstractFactoryClient {
    enum CloudProvider { AWS, GCP }

    public static void main(String[] args) {
        AbstractResourceFactory resourceFactory = null;

        /*
        Here either All AWS resources will be created or GCP resources will be created based on single variable.
        This variable decides which concreate factory to be used for resource creation.
        We may update the code to read this variable from environment variable so that user/client need not bother about the Cloud provider.
         */
        CloudProvider cloudProvider = CloudProvider.AWS;
        if(cloudProvider == CloudProvider.AWS) {
            resourceFactory = new AWSResourceFactory();
        } else if(cloudProvider == CloudProvider.GCP) {
            resourceFactory = new GCPResourceFactory();
        }

        Instance instance = resourceFactory.createInstance(Instance.Type.large, 5);
        Storage storage = resourceFactory.createStorage(20);
        instance.attachStorage(storage);

        System.out.println(instance);
    }
}
