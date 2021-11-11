package com.concepts.ClassesAndConstructors;

public class BankAccount {
    private int accountNumber;
    private float accountBalance;
    private String customerName;
    private String customerEmail;
    private long customerPhoneNumber;

    public BankAccount(int accountNumber, float accountBalance, String customerName, String customerEmail, long customerPhoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(float accountBalance){
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setCustomerEmail (String customerEmail){
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhoneNumber (long customerPhoneNumber){
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public float getAccountBalance (){
        return this.accountBalance;
    }

    public String getCustomerName () {
        return this.customerName;
    }

    public String getCustomerEmail(){
        return this.customerEmail;
    }

    public long getCustomerPhoneNumber(){
        return this.customerPhoneNumber;
    }

    public void depositFunds (int funds) {
        System.out.println("Adding " + funds);
        this.accountBalance += funds;
    }

    public void withdrawFunds (int funds) {
        if(funds < accountBalance){
            System.out.println("Withdrawing " + funds);
            this.accountBalance -= funds;
        }
    }
}
