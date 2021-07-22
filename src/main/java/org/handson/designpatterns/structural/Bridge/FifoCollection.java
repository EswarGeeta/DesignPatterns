package org.handson.designpatterns.structural.Bridge;

public interface FifoCollection<T> {
    public void offer(T item);
    public  T poll();
}
