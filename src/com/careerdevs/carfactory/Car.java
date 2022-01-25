package com.careerdevs.carfactory;

public class Car {

    public String model;
    public String make;
    public int mileage;
    public int gasPercentage;

    public Car(String model,String make,int mileage, int gasPercentage){
        this.model = model;
        this.make = make;
        this.mileage = mileage;
        this.gasPercentage= gasPercentage;
    }
}
