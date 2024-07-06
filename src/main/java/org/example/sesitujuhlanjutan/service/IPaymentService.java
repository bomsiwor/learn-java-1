package org.example.sesitujuhlanjutan.service;

import org.example.sesitujuhlanjutan.model.PaymentMethod;

public interface IPaymentService {
    /**
     * Logic for processing the payment process
     * @param paymentMethod Payment method used by User
     * @return Message - could be success / or error
     */
    String processPayment(PaymentMethod paymentMethod);
}
