package com.atos.deproj.sprint2145.design;

public abstract class CoffeeDecorator implements Coffee{

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDiscription() {
        return coffee.getDiscription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
