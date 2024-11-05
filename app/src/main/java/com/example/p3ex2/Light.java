package com.example.p3ex2;

public class Light extends Vehicles{
    Boolean engine;
    public Light(int carNuamber, int carAge, int quantityWheels, Boolean steeringWheelOrHandlebars, double pollutants, Boolean engine) {
        super(carNuamber, carAge, quantityWheels, steeringWheelOrHandlebars, pollutants);
        this.engine = engine;
    }
    public boolean isHasEngine() {
        return engine;
    }
    public void setHasEngine(boolean hasEngine) {
        this.engine = hasEngine;
    }
    @Override
    public String toString() {
        return "Light [hasEngine=" + engine + ", " + super.toString() + "]";
    }
}