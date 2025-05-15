package Abstract;

import java.util.ArrayList;
import java.util.List;

public abstract class main {
    public static void main(String[] args) {
        List<String> listName = new ArrayList<>();
        listName.add("Nguyen Duy A");
        listName.add("Kevin Kien");
        listName.add("HAHAHH");
        System.out.println("List of Names:");
        for (String name : listName) {
            System.out.println(name);
        }

        System.out.println("List after move:");
        listName.remove(2);
        for (String name : listName) {
            System.out.println(name);
        }
        listName.clear();
        System.out.println("List after clear");
        SinhVien sv = new SinhVien();
        sv.display();
    }
}
