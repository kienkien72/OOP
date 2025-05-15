package KT_OOP;

import java.util.ArrayList;
import java.util.List;

public class AddVehicle {
    private String name;
    public List<Vehicle> listVehicle;

    public AddVehicle(String name) {
        this.name = name;
        this.listVehicle = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vehicle> getListVehicle() {
        return listVehicle;
    }

    public void setListVehicle(List<Vehicle> listVehicle) {
        this.listVehicle = listVehicle;
    }

    public void themPhuongTien(Vehicle vc) {
        listVehicle.add(vc);
    }

    public void thongTin() {
        for (Vehicle vehicle : listVehicle) {
            System.out.println("------------------------------------");
            vehicle.printInfo();
            vehicle.drive();

        }

    }

}
