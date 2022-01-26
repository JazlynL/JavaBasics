package com.careerdevs.countryfactory;

public class Country {

    public String country;
    public Long  population;
    public String capital;



    public Country(String country , Long population,String capital){
        this.country = country;
        this.population  = population;
        this.capital = capital;


    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", population=" + population +
                ", capital='" + capital + '\'' +
                '}';
    }
}



