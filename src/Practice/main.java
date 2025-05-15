package Practice;

public class main {
    public static void main(String[] args) {

        Truck truck = new Truck("Ford", 6, 12);
        VehicleArr vehicleArr = new VehicleArr("Them moi");
        vehicleArr.addVehicle(truck);
        vehicleArr.printInfomation();
    }
}
