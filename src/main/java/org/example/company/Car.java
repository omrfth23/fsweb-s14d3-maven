package org.example.company;

import java.util.Objects;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{name='" + name + "', cylinders=" + cylinders + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Car)) return false;
        Car other = (Car) obj;
        return cylinders == other.cylinders && Objects.equals(name, other.name);
    }

    public String startEngine() {
        String msg = "the car's engine is starting";
        System.out.println(getClass().getSimpleName() + ": " + msg);
        return msg;
    }

    public String accelerate() {
        String msg = "the car is accelerating";
        System.out.println(getClass().getSimpleName() + ": " + msg);
        return "Car: " + msg;
    }

    public String brake() {
        String msg = "the car is braking";
        System.out.println(getClass().getSimpleName() + ": " + msg);
        return msg;
    }
}

