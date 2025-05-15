package GK;

import java.util.ArrayList;
import java.util.List;

public class Cau3Main {
    public void printDS() {
        List<Trackable> listSP = new ArrayList<>();
        for (Trackable list : listSP) {
            if (list.getUnitsSold() > 100) {
                System.out.println("Cac sp vuot hon 100 la: " + list.getUnitsSold());
            }
        }
    }

    public static void main(String[] args) {
        List<Trackable> listSP = new ArrayList<>();
        listSP.add(new Grocery("Cam", 10000, 10));
        listSP.add(new Stationery("But bi", 20000, 120));
        listSP.add(new Stationery("Notebook", 15000, 110));

        for (Trackable list : listSP) {
            if (list.getUnitsSold() > 100) {
                System.out.println("Cac sp vuot hon 100 la: ");
            }
        }
    }
}
