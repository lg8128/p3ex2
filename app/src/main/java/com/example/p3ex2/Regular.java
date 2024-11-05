package com.example.p3ex2;

public class Regular extends Vehicles{
    int traveling;
    public Regular(int carNuamber, int carAge, int quantityWheels, Boolean steeringWheelOrHandlebars, double pollutants, int traveling) {
        super(carNuamber, carAge, quantityWheels, steeringWheelOrHandlebars, pollutants);
        this.traveling = traveling;
    }
    public int getPassengerCount() { return traveling; }
    public void setPassengerCount(int passengerCount) { this.traveling = passengerCount; }

    @Override
    public int exhaust() {
        return traveling() * 60;
    }

    private int traveling() {
        return 1;
    }

    public void noise() {
        System.out.println("The car's noise level is ...");
    }

    public void hitchhikers() {
        System.out.println("Hitchhikers are allowed");
    }

    @Override
    public String toString() {
        return "Regular [passengerCount=" + traveling + ", " + super.toString() + "]";
    }

}