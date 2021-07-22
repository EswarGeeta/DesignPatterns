package org.handson.designpatterns.creational.Prototype;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PassengerTrain extends Train {

    private int passengerCapacity;

    public PassengerTrain(String source, String destination, List<Train.Compartment> compartmentList, int passengerCapacity) {
        super(source, destination, compartmentList);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        PassengerTrain passengerTrainClone = new PassengerTrain(this.getSource(), this.getDestination(), this.getCompartmentList(), this.passengerCapacity);
        passengerTrainClone.setPassengerCapacity(this.passengerCapacity);
        return passengerTrainClone;
    }
}
