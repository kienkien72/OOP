package Practice;

public class Truck extends Vehicle {

    public Truck(String name, int wheels, double getFuelEfficiency) {
        super(name, wheels, getFuelEfficiency);
    }

    @Override
    public void drive() {
        System.out.println("Grum grummm grumm");
    }

    @Override
    public int getFuelEfficiency() {
        return 0;
    }

}
