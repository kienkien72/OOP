package SinhVien;

public class Bacsi extends NhanSu {
    public String chuyenKhoa;

    public Bacsi(String ten, int namSinh, String chuyenKhoa) {
        super(ten, namSinh);
        this.chuyenKhoa = chuyenKhoa;
    }

    @Override
    public void thongTin() {
        System.out
                .println("Ten Bac Si: " + ten + " - " + "Nam sinh: " + getNamSinh() + " - " + "Chuyen Khoa: "
                        + chuyenKhoa);
    }
}
