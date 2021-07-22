package org.handson.designpatterns.structural.Bridge;

public interface LinkedList<T> {
    public void addFirst(T item);
    public void addLast(T item);

    public T removeFirst();
    public T removeLast();
}
