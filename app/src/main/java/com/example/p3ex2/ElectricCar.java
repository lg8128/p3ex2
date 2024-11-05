package com.example.p3ex2;

public class ElectricCar extends Regular {
    int batteryCapacity;

    public ElectricCar(int carNumber, int carAge, int quantityWheels, Boolean steeringWheelOrHandlebars, double pollutants, int traveling, int batteryCapacity) {
        super(carNumber, carAge, quantityWheels, steeringWheelOrHandlebars, pollutants, traveling);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() { return batteryCapacity; }
    public void setBatteryCapacity(int batteryCapacity) { this.batteryCapacity = batteryCapacity; }

    @Override
    public String toString() {
        return "ElectricCar [batteryCapacity=" + batteryCapacity + ", " + super.toString() + "]";
    }
}

