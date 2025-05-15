package QLNhanVien;

public class Manager extends Employee {
    private String department;
    private int shiftHours;

    @Override
    public String getRole() {
        return "";
    }

    public Manager(String name, int id, int birthDay, String department, int shiftHours) {
        super(name, id, birthDay);
        this.department = department;
        this.shiftHours = shiftHours;
    }

    public void printInfo() {
        System.out.println(
                "Ten: " + getName() + " , " + "Id: " + getId() + " , " + "Nam Sinh: " + getBirthDay() + "," + " , "
                        + "Phong ban: "
                        + department + " , " + "So gio: " + shiftHours);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getShiftHours() {
        return shiftHours;
    }

    public void setShiftHours(int shiftHours) {
        this.shiftHours = shiftHours;
    }

}
