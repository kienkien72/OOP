package SinhVien;

public class SinhVien extends NhanSu {
    public String diem;

    public SinhVien() {

    }

    public SinhVien(String ten, int namSinh, String diem) {
        super(ten, namSinh);
        this.diem = diem;
    }

    @Override
    public void thongTin() {
        System.out.println("Ten sinh vien: " + ten + " - " + "Nam sinh: " + getNamSinh() + " - " + "Diem: " + diem);

    }

}
