package com.challenges.polymorphismCar;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi "+ this.getName() +" is starting";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi "+ this.getName() +" is accelerating";
    }

    @Override
    public String brake() {
        return "Mitsubishi "+ this.getName() +" is braking";
    }
}
