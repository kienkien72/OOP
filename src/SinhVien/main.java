package SinhVien;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        // System.out.println("--------------------------------");
        // System.out.println("Sinh Vien");
        // SinhVien sv = new SinhVien("Kiên", 2003, "9");
        // sv.thongTin();
        // System.out.println("--------------------------------");
        // System.out.println("Giang Vien");

        // // gv.thongTin();

        // System.out.println("--------------------------------");
        // System.out.println("Bac Si");
        // Bacsi bs = new Bacsi("Kiên Kiên", 2004, "Khoa Nội");
        // bs.thongTin();

        System.out.println("Cac nhan su moi: ");

        // SinhVien sv = new SinhVien("Kiên", 2003, "9");
        GiangVien gv1 = new GiangVien("ndk", 2010, "Toán");
        GiangVien gv2 = new GiangVien("Nguyen Duy Kien", 1999, "Sinh");
        Bacsi bs = new Bacsi("Kiên Kiên", 2004, "Khoa Nội");
        Bacsi bs1 = new Bacsi("KIT", 2004, "Khoa Nhi");
        Bacsi bs2 = new Bacsi("Tang Yen vy", 2005, "Khoa Ngoai");
        DayNS add = new DayNS(null);
        add.themNhanSu(new SinhVien("Kiên", 2003, "9"));
        add.themNhanSu(gv1);
        add.themNhanSu(gv2);
        add.themNhanSu(bs);
        add.themNhanSu(bs1);
        add.themNhanSu(bs2);
        add.thongTin();
        System.out.println("-----------------------------");
        double tb = add.trungBinhNamSinh();
        System.out.println("Trung binh tuoi cua gv: " + tb);
        System.out.println("=================================================");
        add.demBacSi();
        System.out.println("============================");
        add.sapXep();
        System.out.println("DS sau khi sap xep nam sinh");
        add.thongTin();

    }
}
