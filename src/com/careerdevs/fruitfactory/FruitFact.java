package com.careerdevs.fruitfactory;

public class FruitFact {
    public String name;
    public String color;
    public boolean hasSeeds;


    public FruitFact(String name , String color, boolean hasSeeds){
        this.name = name;
        this.color =color;
        this.hasSeeds = hasSeeds;

    }

    @Override
    public String toString() {
        return "FruitFact{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", hasSeeds=" + hasSeeds +
                '}';
    }
}
