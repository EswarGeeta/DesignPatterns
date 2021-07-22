package org.handson.designpatterns.structural.Adapter;

public class BillingService {

    public void printInvoice(Customer customer) {
        System.out.println("Dear " + customer.getName() + ", Below are your order details:");
        System.out.println("You will receive an OTP on your registered mobile number " + customer.getPhone() + " during product delivery");
        System.out.println("Products to be delivered : " + customer.getProductList());
    }
}
