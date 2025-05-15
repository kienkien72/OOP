package GK;

public class Cau1Main {
    public static void main(String[] args) {
        Grocery a = new Grocery("Rice", 20000, 50);
        System.out.println("Tinh tien: " + a.calculateTotalPrice());
        a.showDetails();
    }

}
