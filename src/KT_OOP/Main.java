package KT_OOP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 4, 18);
        Bike bike1 = new Bike("Martine", 2, 5);
        Truck truck1 = new Truck("Forest", 6, 18);
        AddVehicle addVehicle = new AddVehicle("Ds");
        addVehicle.themPhuongTien(car1);
        addVehicle.themPhuongTien(bike1);
        addVehicle.themPhuongTien(truck1);
        addVehicle.thongTin();
    }

}
