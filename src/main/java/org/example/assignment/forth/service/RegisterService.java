package org.example.assignment.forth.service;

import org.example.assignment.forth.model.RegisterRequest;
import org.example.assignment.forth.model.User;

public class RegisterService implements IRegisterService {
    // Entity / Model class injected to service
    private User user;

    public RegisterService(User user) {
        this.user = user;
    }

    @Override
    public String process(RegisterRequest request) {
        // Validate request, then store it on model entity
        // Throw error message if not validated
        boolean validated = this.validate(request);
        if (!validated) {
            return "Terdapat data tidak valid, cek kembali data-data kamu!";
        }

        // Set all request data to user entity
        user.setName(request.getName());
        user.setPassword(request.getPassword());
        user.setEmail(request.getEmail());
        user.setBirthDate(request.getBirthDate());
        user.setBirthPlace(request.getBirthPlace());
        user.setMobileNumber(request.getMobileNumber());

        // Store user to any persistence storage (DB, file, etc)
        // user.Save()

        // Return success message
        return "Register Berhasil";
    }

    /**
     * Validate the request
     * All property should be filled to get success on register process
     * @param request Request from client (catch by request class)
     * @return Validated flag
     */
    private boolean validate(RegisterRequest request){
        // Check if all field are filled
        if (
                request.getName().isEmpty() ||
                        request.getEmail().isEmpty() ||
                        request.getPassword().isEmpty() ||
                        request.getBirthDate().isEmpty() ||
                        request.getBirthPlace().isEmpty() ||
                        request.getMobileNumber().isEmpty()
        ){
            return false;
        }

        return true;
    }
}
