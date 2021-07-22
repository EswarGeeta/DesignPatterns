package org.handson.designpatterns.creational.ObjectPool;

public class CostlyResource implements Poolable {


    public String costlyString;

    public void costlyOperation() {
        System.out.println("Consider this as a costly operation which uses the variable costlyString. " +
                "Assume that it needs some external limited resource like Thread or JDBC connection" );
    }
    @Override
    public void reset() {
        System.out.println("This is the reset method to clear the old data when this object was already used. ");

    }
}
