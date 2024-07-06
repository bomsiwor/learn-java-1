package org.example.assignment.forth.model;

public class RegisterRequest {
    private String name;

    private String mobileNumber;

    private String birthPlace;

    private String birthDate;

    private String email;

    private String password;

    public RegisterRequest(String name, String phoneNumber, String birthPlace, String birthDay, String email, String password){
        this.name = name;
        this.mobileNumber = phoneNumber;
        this.birthPlace = birthPlace;
        this.birthDate = birthDay;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
