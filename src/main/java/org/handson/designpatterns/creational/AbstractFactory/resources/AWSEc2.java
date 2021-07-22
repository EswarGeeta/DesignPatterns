package org.handson.designpatterns.creational.AbstractFactory.resources;

public class AWSEc2 extends Instance {

    public AWSEc2(Type type, int capaticyInGB) {
        super(type, capaticyInGB);
    }

}
