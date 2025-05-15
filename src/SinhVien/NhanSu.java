package SinhVien;

public abstract class NhanSu {
    public String ten;
    private int namSinh;

    public NhanSu() {

    }

    public NhanSu(String ten, int namSinh) {
        this.ten = ten;
        this.namSinh = namSinh;
    }

    public void thongTin() {
        System.out.println("Tên: " + ten + " " + "Năm sinh: " + namSinh);
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        if (namSinh > 0) {
            this.namSinh = namSinh;
        } else {

            // Thường dùng khi gặp lỗi phổ biến như:
            // Toán học: ArithmeticException (chia cho 0)
            // Mảng: ArrayIndexOutOfBoundsException
            // Chuỗi: NullPointerException
            // Tham số: IllegalArgumentException
            // ----------------------------------------------
            // throw new ArithmeticException("Không thể chia cho 0!");
            throw new IllegalArgumentException("Tuổi không thể nhỏ hơn 0!");
        }

    }

}
