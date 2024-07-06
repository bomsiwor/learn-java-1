package org.example.sesitujuhlanjutan.service.implementation;

import org.example.sesitujuhlanjutan.model.PaymentMethod;
import org.example.sesitujuhlanjutan.service.IPaymentService;

public class PaymentService implements IPaymentService {

    @Override
    public String processPayment(PaymentMethod paymentMethod) {
        // There sit logic to process the payment
        return "Sukses";
    }
}
