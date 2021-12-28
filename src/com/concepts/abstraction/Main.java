package com.concepts.abstraction;

public class Main {
    public static void main(String[] args) {
        Dog dob = new Dog("Lab");
        dob.breathe();
        dob.eat();

        Parrot bird = new Parrot("Ring neck");
        bird.breathe();
        bird.eat();
        bird.fly();
    }
}
