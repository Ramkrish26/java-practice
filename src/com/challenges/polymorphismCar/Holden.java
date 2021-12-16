package com.challenges.polymorphismCar;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden "+ this.getName() +" is starting";
    }

    @Override
    public String accelerate() {
        return "Holden "+ this.getName() +" is accelerating";
    }

    @Override
    public String brake() {
        return "Holden "+ this.getName() +" is braking";
    }
}
