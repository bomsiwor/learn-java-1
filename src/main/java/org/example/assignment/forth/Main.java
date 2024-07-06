package org.example.assignment.forth;

import org.example.assignment.forth.model.RegisterRequest;
import org.example.assignment.forth.model.User;
import org.example.assignment.forth.service.RegisterService;

public class Main {
    public static void main(String[] args) {
        // Generate dummy register request data
        RegisterRequest request = new RegisterRequest(
                "Ujang",
                "62812345678",
                "",
                "2001-01-01",
                "ujang@gmail.com",
                "Password#1234"
        );

        // Create user entity data to be injected to service
        User user = new User();

        // Inject user model to service
        RegisterService service = new RegisterService(user);

        // Process the user register request
        String response = service.process(request);

        // Print
        System.out.println(response);
    }
}
