package org.handson.designpatterns.creational.ObjectPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool <T extends Poolable> {

    private BlockingQueue<T> objectPool ;

    public ObjectPool(Supplier<T> creator, int count) {
        objectPool = new LinkedBlockingQueue<T>();
        for (int i = 0; i < count; i++) {
            try {
                objectPool.put(creator.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public T get() {
        System.out.println("Waiting for resource from Pool");
        try {
            System.out.println("Got  the resource from Pool");
            return objectPool.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void release(T resource) {
        resource.reset();
        System.out.println("Releasing resource to Pool");
        try {
            objectPool.put(resource);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
