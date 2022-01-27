package com.careerdevs;

public class Car {
    public String make;
    public String model;
    public int  mileage;
    public double gasTankPercent;


    public Car(String make, String model,int mileage,double gasTankPercent){
        this.make = make;
        this.model = model;
        this.mileage =mileage;
        this.gasTankPercent = gasTankPercent;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", gasTankPercent=" + gasTankPercent +
                '}';
    }
}
