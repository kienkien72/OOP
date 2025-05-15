package Vehicle;

public class Bicycle extends Vehicle {

    private int increase;
    private int decrease;

    public Bicycle(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public int accelerate() {
        increase = getSpeed() + 5;
        return increase;
    }

    @Override
    public int brake() {
        if (getSpeed() > 0) {
            decrease = getSpeed() - 3;
        } else {
            throw new UnsupportedOperationException("Unimplemented method 'brake'");
        }
        return decrease;

    }

}
