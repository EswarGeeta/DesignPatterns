package org.handson.designpatterns.creational.Prototype;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Train train = new Train("VSKP", "BNG", new ArrayList<>());

        PassengerTrain passengerTrain = new PassengerTrain("VSKP", "BNG", new ArrayList<>(), 1000);
        try {
            PassengerTrain passengerTrainClone = (PassengerTrain) passengerTrain.clone();
            System.out.println(passengerTrainClone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
