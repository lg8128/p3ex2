package com.example.p3ex2;

public class Heavy extends Vehicles {
    int trailers;

    public Heavy(int carNuamber, int carAge, int quantityWheels, Boolean steeringWheelOrHandlebars, double pollutants, int trailers) {
        super(carNuamber, carAge, quantityWheels, steeringWheelOrHandlebars, pollutants);
        this.trailers = trailers;
    }

    public int getTrailerCount() {
        return trailers;
    }
    public void setTrailerCount(int trailerCount) {
        this.trailers = trailerCount;
    }

    @Override
    public int exhaust() {
        return super.exhaust() + 500 * trailers;
    }

    @Override
    public String toString() {
        return "Heavy [trailerCount=" + trailers + ", " + super.toString() + "]";
    }
}
