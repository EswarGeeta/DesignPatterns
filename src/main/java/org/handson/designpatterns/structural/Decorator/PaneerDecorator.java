package org.handson.designpatterns.structural.Decorator;

public class PaneerDecorator implements Dosa {
    private Dosa dosa;

    public PaneerDecorator(Dosa dosa) {
        this.dosa = dosa;
    }

    @Override
    public void prepareDosa() {
        dosa.prepareDosa();
        System.out.println("Add grated paneer on Dosa ");
    }

    @Override
    public int getCost() {
        return dosa.getCost() + 10;
    }
}
