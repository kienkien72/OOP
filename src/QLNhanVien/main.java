package QLNhanVien;

public class main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Kien", 22, 2004, "Ki Thuat", 30);
        Manager manager2 = new Manager("Chung", 33, 2002, "Bo Phan", 30);
        Staff staff1 = new Staff("Kien kien", 2, 2000, "Ki thuat", 20);
        // Staff staff2 = new Staff("Kien kien", 2, 1990, "Ki thuat", 20);
        // Staff staff3 = new Staff("Kien kien", 2, 2006, "Ki thuat", 20);
        Project project = new Project(" ");
        project.addEmployee(manager1);
        project.addEmployee(manager2);
        project.addEmployee(staff1);
        project.printInfo();
        System.out.println("So luong Manager: " + project.countManager());
        System.out.println("Tuoi trung binh cua nhan vien: " + project.tinhTongTB());

        System.out.println("DS sau khi sap xep: ");
        project.printInfo();
        project.timMaxManager();
    }
}
