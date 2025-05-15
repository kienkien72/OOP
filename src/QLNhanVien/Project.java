package QLNhanVien;

import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import SinhVien.NhanSu;

public class Project {
    private String projectName;
    private List<Employee> employees;

    public Project(String projectName) {
        this.projectName = projectName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void printInfo() {
        for (Employee emp : employees) {
            System.out.println("Nhan vien moi: ");
            emp.printInfo();
            emp.getRole();
        }
    }

    public int countManager() {
        int count = 0;
        for (Employee emp : employees) {
            if (emp instanceof Manager) {
                count += 1;
            }
        }
        // System.out.println("So luong manager co : " + count);
        return count;
    }

    public int tinhTongTB() {
        int avg = 0;
        int tuoi = 0;
        int namHienTai = Year.now().getValue();
        for (Employee emp : employees) {
            tuoi += emp.tinhTuoi();
            avg += 1;

        }
        return tuoi / avg;
    }

    public void timMaxManager() {
        int maxTuoi = 0;
        int dem = 0;
        for (Employee emp : employees) {
            if (emp instanceof Manager) {
                dem++;
                int tuoi = emp.tinhTuoi();
                if (tuoi > maxTuoi) {
                    maxTuoi = tuoi;
                }
                Manager a = (Manager) emp;
                System.out.println(
                        "Ten: " + a.getName() + "Phong Ban: " + a.getDepartment() + "Tuoi lon nhat: " + maxTuoi);

            }
        }
        if (dem == 0) {
            System.out.println("Khong có Manager");
        }

    }
}
