package Vehicle;

public class main {
    public static void main(String[] args) {

        Car car = new Car("Toyota", 60);
        System.out.println("Xe hơi : " + car.getBrand() + " / " + car.getSpeed());
        System.out.println("Increase:  " + car.accelerate());
        System.out.println("Decrease : " + car.brake());

        Bicycle bicycle = new Bicycle("Martin", 10);
        System.out.println("Xe đạp: " + bicycle.getBrand() + "/" + bicycle.getSpeed());
        System.out.println("Increase: " + bicycle.accelerate());
        System.out.println("Decrease: " + bicycle.brake());

    }

}
