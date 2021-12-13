package com.challenges.polymorphismCar;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford "+ this.getName() +" is starting";
    }

    @Override
    public String accelerate() {
        return "Ford "+ this.getName() +" is accelerating";
    }

    @Override
    public String brake() {
        return "Ford "+ this.getName() +" is braking";
    }
}
