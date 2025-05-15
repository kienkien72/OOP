package Practice;

public abstract class Vehicle {
    private String name;
    private int wheels;
    private double fuelEfficiency;

    public abstract void drive();

    public abstract int getFuelEfficiency();

    public void printInfo() {
        System.out.println(
                "Ten: " + name + " , " + "Banh xe: " + wheels + " , " + "Hieu suat nhien lieu: " + fuelEfficiency);
    }

    public Vehicle(String name, int wheels, double fuelEfficiency) {
        this.name = name;
        this.wheels = wheels;
        this.fuelEfficiency = fuelEfficiency;
    }

    public Vehicle() {

    }

}
