package org.handson.designpatterns.structural.Decorator;

public class PlainDosa implements Dosa {
    @Override
    public void prepareDosa() {
        System.out.println("Spread plain dosa batter on the Tawa");
    }

    @Override
    public int getCost() {
        return 40;
    }
}
