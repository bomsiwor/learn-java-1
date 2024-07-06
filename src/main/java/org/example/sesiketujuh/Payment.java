package org.example.sesiketujuh;

import java.util.Date;

public class Payment {
    // Bank Name
    public String bankName;

    // Account number - can be nullsy (zero)
    private int creditCardNumber;
    private int virtualAccountNumber;

    // Account balance
    private double amount;

    // Due date
    private Date dueDate;

    // Time out
    private boolean timeout;

    public static void main(String []args) {
        // Define new object
        Payment akun1 = new Payment("BCA");
        Payment akun2 = new Payment("Mandiri");

        // Manipulate first object
        // Left the secound object
        akun1.setAccountNumber(1234,5678);

        // Check for account number
        if (!akun1.isValidatedNumber()) {
            System.out.println(akun1.getBankName() + " has invalid/empty account number");
        } else {
            System.out.println(akun1.getBankName() + " is valid account");
        }

        // Check for secound account number
        // This should be false / error
        if (!akun2.isValidatedNumber()) {
            System.out.println("Akun " + akun2.getBankName() + " has invalid/empty account number");
        } else {
            System.out.println(akun2.getBankName() + " is valid account");
        }
    }

    // Constructor
    public Payment(String bankName) {
        this.bankName = bankName;
    }

    public void setAccountNumber(int creditCardNumber, int virtualAccountNumber) {
        this.creditCardNumber = creditCardNumber;
        this.virtualAccountNumber = virtualAccountNumber;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setTimeout(boolean timeout) {
        this.timeout = timeout;
    }

    public String getBankName() {
        return this.bankName;
    }

    // Other getter method

    /**
     * Check if the account has valid account number
     * @return Flag indicates validity of account number
     */
    public boolean isValidatedNumber() {
        return this.creditCardNumber != 0 || this.virtualAccountNumber != 0;
    }
}
