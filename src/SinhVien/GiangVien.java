package SinhVien;

public class GiangVien extends NhanSu {
    public String chuyenmon;

    public GiangVien(String ten, int namSinh, String chuyenmon) {
        super(ten, namSinh);
        this.chuyenmon = chuyenmon;
    }

    @Override
    public void thongTin() {
        System.out
                .println("Tên GV: " + ten + " - " + "Nam Sinh: " + getNamSinh() + " -  " + "Chuyen mon: " + chuyenmon);
    }

}
