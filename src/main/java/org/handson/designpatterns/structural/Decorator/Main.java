package org.handson.designpatterns.structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Dosa paneerMashroomDosa = new MashroomDecorator(new PaneerDecorator(new PlainDosa()));
        paneerMashroomDosa.prepareDosa();
        System.out.println("Cost of Dosa is " + paneerMashroomDosa.getCost());
    }
}
