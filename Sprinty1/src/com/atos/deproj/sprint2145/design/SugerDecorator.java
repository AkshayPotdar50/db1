package com.atos.deproj.sprint2145.design;

public class SugerDecorator extends CoffeeDecorator{

    public SugerDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDiscription() {
        return super.getDiscription() +"Suger";
    }

    @Override
    public double getCost() {
        return super.getCost() +0.5;
    }
}
