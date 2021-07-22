package org.handson.designpatterns.structural.Adapter;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Consumer {
    private String fullName;
    private String mobileNumber;
    private List<String> products;
}
