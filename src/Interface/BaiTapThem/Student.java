package Interface.BaiTapThem;

public class Student implements People {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void classmate() {
        System.out.println("Kien");
    }

    @Override
    public void nameClass() {
        System.out.println("1A");
    }

    @Override
    public void nameSchool() {
        System.out.println("ĐH Sai Gon");
    }

    @Override
    public void address() {
        System.out.println("TP HCM");
    }

    @Override
    public int old() {
        return 20;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
