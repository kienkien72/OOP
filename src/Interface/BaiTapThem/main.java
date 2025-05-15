package Interface.BaiTapThem;

public class main {
    public static void main(String[] args) {
        Student s1 = new Student("Kien");
        s1.classmate();
        System.out.println("Tuoi: " + s1.old());
        s1.address();
        s1.nameClass();
        s1.nameSchool();
    }
}
