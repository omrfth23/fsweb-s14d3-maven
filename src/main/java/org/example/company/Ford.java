package org.example.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        String msg = "the car's engine is starting";
        System.out.println(getClass().getSimpleName() + ": " + msg);
        return msg;
    }

    @Override
    public String accelerate() {
        String msg = "the car is accelerating";
        System.out.println(getClass().getSimpleName() + ": " + msg);
        return "Car: " + msg;
    }

    @Override
    public String brake() {
        String msg = "the car is braking";
        System.out.println(getClass().getSimpleName() + ": " + msg);
        return msg;
    }
}