package org.handson.designpatterns.structural.Adapter;

import java.util.ArrayList;
import java.util.Arrays;

public class BillingClient {

    public static void main(String[] args) {

        //Adapter using class adapter
        System.out.println("*************************************");
        ConsumerClassAdapter consumerClassAdapter = new ConsumerClassAdapter();
        populateConsumerData(consumerClassAdapter);
        BillingService billingService = new BillingService();
        billingService.printInvoice(consumerClassAdapter);

        System.out.println("*************************************");
        //Adapter using object adapter
        Consumer consumer = new Consumer();
        populateConsumerData(consumer);
        ConsumerObjectAdapter consumerObjectAdapter = new ConsumerObjectAdapter(consumer);
        billingService.printInvoice(consumerObjectAdapter);
    }

    public static void populateConsumerData(Consumer consumer) {
        consumer.setFullName("Eswar Andavarapu");
        consumer.setMobileNumber("XXXX XXX XXX");
        consumer.setProducts(Arrays.asList("product 1", "product 2", "product 3"));
    }
}
