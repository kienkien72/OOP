package Practice;

import java.util.ArrayList;
import java.util.List;

public class VehicleArr {
    private String name;
    public List<Vehicle> listVehicles;

    public VehicleArr(String name) {
        this.name = name;
        listVehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle ve) {
        listVehicles.add(ve);
    }

    public void printInfomation() {
        for (Vehicle vehicle : listVehicles) {
            System.out.println("Them moi Vehicle");
            vehicle.printInfo();
            vehicle.drive();
        }
    }

}
