package KT_OOP;

public class Car extends Vehicle {

    public Car(String name, int wheels, double fuelEfficiency) {
        super(name, wheels, fuelEfficiency);
    }

    @Override
    public void drive() {
        System.out.println("veo veo veoooo");
    }

    @Override
    public double getFuelEfficiency() {
        return 0;
    }

}
