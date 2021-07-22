package org.handson.designpatterns.structural.Bridge;

import java.util.NoSuchElementException;

public class SingleLinkedList<T> implements LinkedList<T>{


    class Node<T> {
        T item;
        Node<T> next;

        public Node(T item) {
            this.item = item;
            next = null;
        }
    }

    private Node<T> firstNode;

    @Override
    public void addFirst(T item) {
        Node tmpNode = new Node(item);
        tmpNode.next = firstNode;
        firstNode = tmpNode;
    }

    @Override
    public void addLast(T item) {
        if(firstNode == null) {
            firstNode = new Node(item);
        } else {
            Node tmpNode = firstNode;
            while(tmpNode.next != null) {
                tmpNode = firstNode.next;
            }
            tmpNode.next = new Node(item);
        }
    }

    @Override
    public T removeFirst() {
        if(firstNode == null) {
            throw new NoSuchElementException();
        }
        Node tmpNode = firstNode;
        firstNode = firstNode.next;
        return (T) tmpNode.item;
    }

    @Override
    public T removeLast() {
        if(firstNode == null) {
            throw new NoSuchElementException();
        }
        Node tmpNode = firstNode;
        while(tmpNode.next != null && tmpNode.next.next != null) {
            tmpNode = tmpNode.next;
        }
        if(tmpNode.next == null) {
            T item = (T) tmpNode.item;
            firstNode = null;
            return item;
        } else {
            T item = (T) tmpNode.next.item;
            tmpNode.next = null;
            return item;
        }
    }
}
