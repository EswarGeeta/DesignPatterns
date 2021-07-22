package org.handson.designpatterns.creational.ObjectPool;

public class Client {

    public static void main(String[] args) {
        ObjectPool<CostlyResource> costlyResourceObjectPool = new ObjectPool<>(() -> new CostlyResource(), 3);
        CostlyResource res1 = costlyResourceObjectPool.get();
        CostlyResource res2 = costlyResourceObjectPool.get();
        CostlyResource res3 = costlyResourceObjectPool.get();
        res1.costlyOperation();
        costlyResourceObjectPool.release(res1);
        costlyResourceObjectPool.get();
        costlyResourceObjectPool.get();
        costlyResourceObjectPool.get();

    }
}
