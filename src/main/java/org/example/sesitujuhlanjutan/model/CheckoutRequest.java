package org.example.sesitujuhlanjutan.model;

public class CheckoutRequest {
    private Address address;

    private PaymentMethod paymentMethod;

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public Address getAddress() {
        return address;
    }
}
