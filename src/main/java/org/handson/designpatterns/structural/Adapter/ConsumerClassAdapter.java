package org.handson.designpatterns.structural.Adapter;

import java.util.List;
import java.util.stream.Collectors;

public class ConsumerClassAdapter extends Consumer implements Customer{
    @Override
    public String getName() {
        return getFullName();
    }

    @Override
    public String getPhone() {
        return getMobileNumber();
    }

    @Override
    public String getProductList() {
        return getProducts().stream().collect(Collectors.joining(", "));
    }
}
