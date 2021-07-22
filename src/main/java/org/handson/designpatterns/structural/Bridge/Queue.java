package org.handson.designpatterns.structural.Bridge;

public class Queue<T> implements FifoCollection<T>{

    private LinkedList<T> linkedList;
    public Queue(LinkedList<T> linkedList){
        this.linkedList = linkedList;
    }

    @Override
    public void offer(T item) {
        this.linkedList.addFirst(item);
    }

    @Override
    public T poll() {
        return this.linkedList.removeLast();
    }
}
