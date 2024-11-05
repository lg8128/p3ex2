package com.example.p3ex2;

public class Bicycle extends Light{
    Boolean bucket;
    public Bicycle(int carNuamber, int carAge, int quantityWheels, Boolean steeringWheelOrHandlebars, double pollutants, Boolean engine, Boolean bucket) {
        super(carNuamber, carAge, quantityWheels, steeringWheelOrHandlebars, pollutants, engine);
        this.bucket = bucket;
    }

    public boolean isHasBasket() {
        return bucket;
    }
    public void setHasBasket(boolean bucket) {
        this.bucket = this.bucket;
    }

    @Override
    public String toString() {
        return "Bicycle [hasBucket=" + bucket + ", " + super.toString() + "]";
    }
}