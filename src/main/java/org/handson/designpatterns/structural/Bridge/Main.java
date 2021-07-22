package org.handson.designpatterns.structural.Bridge;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new SingleLinkedList<>();
        FifoCollection<String> queue = new Queue<String>(linkedList);

        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
