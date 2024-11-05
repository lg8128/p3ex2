package com.example.p3ex2;

public class RefrigeratedTruck extends Truck{
    int coolingCapacity;

    public RefrigeratedTruck(int carNuamber, int carAge, int quantityWheels, Boolean steeringWheelOrHandlebars, double pollutants, int trailers, double loading, int coolingCapacity) {
        super(carNuamber, carAge, quantityWheels, steeringWheelOrHandlebars,pollutants, trailers, loading);
        this.coolingCapacity = coolingCapacity;

    }


    public int getCoolingCapacity () {
        return coolingCapacity;
    }
    public void setCoolingCapacity ( int coolingCapacity){
        this.coolingCapacity = coolingCapacity;
    }

    @Override
    public String toString () {
        return "RefrigeratedTruck [coolingCapacity=" + coolingCapacity + ", " + super.toString() + "]";
    }
}

