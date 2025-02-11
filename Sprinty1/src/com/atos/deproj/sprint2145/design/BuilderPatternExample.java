package com.atos.deproj.sprint2145.design;

// Product class with multiple attributes
	class Car {
	    // Required parameters
	    private final String engine;
	    private final int wheels;

	    // Optional parameters
	    private final boolean airConditioning;
	    private final boolean sunroof;
	    private final boolean navigationSystem;

	    // Private constructor to enforce object creation via Builder
	    private Car(CarBuilder builder) {
	        this.engine = builder.engine;
	        this.wheels = builder.wheels;
	        this.airConditioning = builder.airConditioning;
	        this.sunroof = builder.sunroof;
	        this.navigationSystem = builder.navigationSystem;
	    }

	    @Override
	    public String toString() {
	        return "Car [Engine=" + engine + ", Wheels=" + wheels + 
	               ", Air Conditioning=" + airConditioning + 
	               ", Sunroof=" + sunroof + ", Navigation System=" + navigationSystem + "]";
	    }

	    // Static nested Builder class
	    public static class CarBuilder {
	        // Required parameters
	        private final String engine;
	        private final int wheels;

	        // Optional parameters with default values
	        private boolean airConditioning = false;
	        private boolean sunroof = false;
	        private boolean navigationSystem = false;

	        // Constructor with required parameters
	        public CarBuilder(String engine, int wheels) {
	            this.engine = engine;
	            this.wheels = wheels;
	        }

	        // Methods to set optional parameters
	        public CarBuilder setAirConditioning(boolean airConditioning) {
	            this.airConditioning = airConditioning;
	            return this;
	        }

	        public CarBuilder setSunroof(boolean sunroof) {
	            this.sunroof = sunroof;
	            return this;
	        }

	        public CarBuilder setNavigationSystem(boolean navigationSystem) {
	            this.navigationSystem = navigationSystem;
	            return this;
	        }

	        // Build method to return a fully constructed Car object
	        public Car build() {
	            return new Car(this);
	        }
	    }
	}

	// Client Code
	public class BuilderPatternExample {
	    public static void main(String[] args) {
	        // Using the builder to create different car configurations
	        Car car1 = new Car.CarBuilder("V8", 4)
	                        .setAirConditioning(true)
	                        .setSunroof(true)
	                        .build();

	        Car car2 = new Car.CarBuilder("Electric", 4)
	                        .setNavigationSystem(true)
	                        .build();

	        System.out.println(car1);
	        System.out.println(car2);
	    }
	}

