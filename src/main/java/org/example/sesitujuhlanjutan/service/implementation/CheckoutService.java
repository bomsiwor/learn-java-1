package org.example.sesitujuhlanjutan.service.implementation;

import org.example.sesitujuhlanjutan.model.Address;
import org.example.sesitujuhlanjutan.model.CheckoutRequest;
import org.example.sesitujuhlanjutan.service.ICheckoutService;
import org.example.sesitujuhlanjutan.service.IPaymentService;

public class CheckoutService implements ICheckoutService {

    private IPaymentService paymentService;

    public CheckoutService(IPaymentService paymentService) {
        // Inject payment service to checkout service
        // Use interface as parameter and data type
        // So every child / concrete class could fits this constructor
        this.paymentService = paymentService;
    }

    @Override
    public void process(CheckoutRequest request) {
        // Catch data from request and validate

        // 1 - Validate address
        boolean isValidAddress = validateAddress(request.getAddress());

        // 2 - Process payment
        String responseMessage = paymentService.processPayment(request.getPaymentMethod());
        boolean isPaymentSuccess = isSuccessResponse(responseMessage);

    }

    private boolean validateAddress(Address address) {
        return !address.getDestination().isEmpty();
    }
    private boolean validateAddress(String address) {return !address.isEmpty();}

    private boolean isSuccessResponse(String responseMessage) {return responseMessage.equals("Sukses");}
}
