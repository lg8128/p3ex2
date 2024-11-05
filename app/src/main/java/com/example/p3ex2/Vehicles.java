package com.example.p3ex2;

public class Vehicles {
    private int CarNuamber;
    private int CarAge;
    private int QuantityWheels;
    private Boolean steeringWheelOrHandlebars;
    private double pollutants;

    public Vehicles(int carNuamber, int carAge, int quantityWheels, Boolean steeringWheelOrHandlebars, double pollutants) {
        CarNuamber = carNuamber;
        CarAge = carAge;
        QuantityWheels = quantityWheels;
        this.steeringWheelOrHandlebars = steeringWheelOrHandlebars;
        this.pollutants = pollutants;
    }

    public int getCarNuamber() {
        return CarNuamber;
    }

    public void setCarNuamber(int carNuamber) {
        CarNuamber = carNuamber;
    }

    public int getCarAge() {
        return CarAge;
    }

    public void setCarAge(int carAge) {
        CarAge = carAge;
    }

    public int getQuantityWheels() {
        return QuantityWheels;
    }

    public void setQuantityWheels(int quantityWheels) {
        QuantityWheels = quantityWheels;
    }


    public Boolean getSteeringWheelOrHandlebars() {
        return steeringWheelOrHandlebars;
    }

    public void setSteeringWheelOrHandlebars(Boolean steeringWheelOrHandlebars) {
        this.steeringWheelOrHandlebars = steeringWheelOrHandlebars;
    }

    public double getPollutants() {
        return pollutants;
    }

    public void setPollutants(double pollutants) {
        this.pollutants = pollutants;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "CarNuamber=" + CarNuamber + ", CarAge=" + CarAge + ", QuantityWheels=" + QuantityWheels +
                ", steeringWheelOrHandlebars=" + steeringWheelOrHandlebars + ", pollutants=" + pollutants + '}';
    }
    public int exhaust() {
        return (int) (pollutants * 60);
    }
}