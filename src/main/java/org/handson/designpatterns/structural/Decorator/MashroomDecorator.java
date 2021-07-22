package org.handson.designpatterns.structural.Decorator;

public class MashroomDecorator implements Dosa {
    private Dosa dosa;

    public MashroomDecorator(Dosa dosa) {
        this.dosa = dosa;
    }

    @Override
    public void prepareDosa() {
        dosa.prepareDosa();
        System.out.println("Add mashroom pieces on Dosa ");
    }

    @Override
    public int getCost() {
        return dosa.getCost() + 15;
    }
}
