package QLNhanVien;

import java.time.Year;

public abstract class Employee {
    private String name;
    private int id;
    private int birthDay;

    public Employee(String name, int id, int birthDay) {
        this.name = name;
        this.id = id;
        this.birthDay = birthDay;
    }

    public Employee() {

    }

    public void printInfo() {
        System.out.println("Ten: " + name + " , " + "Id: " + id);
    }

    public int tinhTuoi() {
        return Year.now().getValue() - birthDay;
    }

    public abstract String getRole();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

}
