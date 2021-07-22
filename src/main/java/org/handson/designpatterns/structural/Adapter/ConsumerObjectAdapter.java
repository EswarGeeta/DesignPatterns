package org.handson.designpatterns.structural.Adapter;

import java.util.stream.Collectors;

public class ConsumerObjectAdapter implements Customer {

    private Consumer consumer;

    public ConsumerObjectAdapter(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public String getName() {
        return consumer.getFullName();
    }

    @Override
    public String getPhone() {
        return consumer.getMobileNumber();
    }

    @Override
    public String getProductList() {
        return consumer.getProducts().stream().collect(Collectors.joining(", "));
    }
}
