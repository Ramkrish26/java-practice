package com.concepts.interfaces;

public class Main {

    public static void main(String[] args) {
        ITelephone myPhone = new DeskPhone(123456);
        myPhone.powerOn();
        myPhone.callPhone(123456);
        myPhone.answer();

        myPhone = new MobilePhone(123487);
        myPhone.powerOn();
        myPhone.callPhone(123487);
        myPhone.answer();
    }
}
