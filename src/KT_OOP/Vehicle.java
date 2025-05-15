package KT_OOP;

public abstract class Vehicle {
    private String name;
    private int wheels;
    private double fuelEfficiency;

    public Vehicle() {

    }

    public Vehicle(String name, int wheels, double fuelEfficiency) {
        this.name = name;
        this.wheels = wheels;
        this.fuelEfficiency = fuelEfficiency;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public abstract void drive();

    public abstract double getFuelEfficiency();

    public void printInfo() {
        System.out
                .println("Ten: " + name + " " + "Banh xe: " + wheels + " " + "Hieu suat nhien lieu: " + fuelEfficiency);
    }

}
