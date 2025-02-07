package com.atos.deproj.sprint2145.design;

public class BasicCoffee implements Coffee{
    @Override
    public String getDiscription() {
        return "simple coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
