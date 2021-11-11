package com.concepts.ClassesAndConstructors;

public class Main {

    public static void main (String[] args){
        /*BankAccount account = new BankAccount(12345,10000,"Ramakrishnan","test@test.com",9176015808L);

        System.out.println("Customer Name         :"+account.getCustomerName());
        System.out.println("Customer Email        :"+account.getCustomerEmail());
        System.out.println("Customer Phone Number :"+account.getCustomerPhoneNumber());
        System.out.println("Account Number        :"+account.getAccountNumber());
        System.out.println("Account Balance       :"+account.getAccountBalance());

        account.withdrawFunds(2000);

        System.out.println("Customer Name         :"+account.getCustomerName());
        System.out.println("Customer Email        :"+account.getCustomerEmail());
        System.out.println("Customer Phone Number :"+account.getCustomerPhoneNumber());
        System.out.println("Account Number        :"+account.getAccountNumber());
        System.out.println("Account Balance       :"+account.getAccountBalance());*/

        VipCustomer customer = new VipCustomer();
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());
    }
}
