package SinhVien;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DayNS {
    private String name;
    public List<NhanSu> listNhanSu;

    public DayNS(String name) {
        this.name = name;
        this.listNhanSu = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NhanSu> getlistNhanSu() {
        return listNhanSu;
    }

    public void setlistNhanSu(List<NhanSu> listNhanSu) {
        this.listNhanSu = listNhanSu;
    }

    public void themNhanSu(NhanSu ns) {
        listNhanSu.add(ns);
    }

    public void thongTin() {
        for (NhanSu themNhanSu : listNhanSu) {
            System.out.println("Ten nhan su: " + name + " ");
            themNhanSu.thongTin();
        }

    }

    public void demBacSi() {
        int dem = 0;
        for (NhanSu themNhanSu : listNhanSu) {
            themNhanSu.thongTin();
            // instanceof để kt một đối tượng có thuộc về một lớp
            if (themNhanSu instanceof Bacsi) {
                dem += 1;
            }

        }
        System.out.println("So bac si co trong danh sach: " + dem);
    }

    public void sapXep() {
        // :: tham chiếu
        listNhanSu.sort(Comparator.comparingInt(NhanSu::getNamSinh));
    }

    public double trungBinhNamSinh() {
        int avg = 0;
        int dem = 0;
        for (NhanSu themNhanSu : listNhanSu) {
            themNhanSu.thongTin();
            if (themNhanSu instanceof GiangVien) {
                dem++;
                avg = avg + themNhanSu.getNamSinh();

            }
        }
        return avg / dem;

    }
}
