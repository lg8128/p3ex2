package com.example.p3ex2;

public class Tractor extends Heavy{
    String trailresTypes;
    public Tractor(int carNuamber, int carAge, int quantityWheels, Boolean steeringWheelOrHandlebars, double pollutants, int trailers, String trailresTypes) {
        super(carNuamber, carAge, quantityWheels, steeringWheelOrHandlebars, pollutants, trailers);
        this.trailresTypes = trailresTypes;
    }

    public String getTrailerTypes() { return trailresTypes; }
    public void setTrailerTypes(String trailerTypes) { this.trailresTypes = trailerTypes; }

    @Override
    public String toString() {
        return "Tractor [trailerTypes=" + trailresTypes + ", " + super.toString() + "]";
    }
}