package KT_OOP;

public class Bike extends Vehicle {
    public Bike(String name, int wheels, double fuelEfficiency) {
        super(name, wheels, fuelEfficiency);
    }

    @Override
    public void drive() {
        System.out.println("ten ton ten tonnn");
    }

    @Override
    public double getFuelEfficiency() {
        return 0;
    }
}
