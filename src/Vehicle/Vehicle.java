package Vehicle;

public abstract class Vehicle {
    private String brand;
    private int speed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Vehicle() {

    }

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public abstract int accelerate();

    public abstract int brake();

    public void displayStatus() {
        System.out.println("Hãng xe:" + brand);
        System.out.println("Tốc độ hiện tại:" + speed);
    }

}
