package GK;

import java.util.ArrayList;
import java.util.List;

public class Cau2Main {
    public static void main(String[] args) {
        Billable[] sanPham = {
                new Grocery("Rau", 5000, 2),
                new Apparel("Gucci", 200000, "Ao so mi"),
                new Stationery("Laptop", 50000, 2)
        };

        double total = 0;
        for (Billable sp : sanPham) {
            total += sp.calculateTotalPrice();
        }
        System.out.println("Tong gia tien tat ca san pham: " + total);
    }
}
