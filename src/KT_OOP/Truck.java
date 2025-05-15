package KT_OOP;

public class Truck extends Vehicle {

    public Truck(String name, int wheels, double fuelEfficiency) {
        super(name, wheels, fuelEfficiency);
    }

    @Override
    public void drive() {
        System.out.println("drummm drummmm");
    }

    @Override
    public double getFuelEfficiency() {

        return 0;
    }
}
