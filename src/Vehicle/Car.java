package Vehicle;

public class Car extends Vehicle {
    private int increase;
    private int decrease;

    public Car(String brand, int speed) {
        super(brand, speed);

    }

    @Override
    public int accelerate() {
        increase = getSpeed() + 20;
        return increase;
    }

    @Override
    public int brake() {
        if (getSpeed() > 0) {
            decrease = getSpeed() - 10;
        } else {
            throw new UnsupportedOperationException("Unimplemented method 'brake'");
        }
        return decrease;

    }

}
