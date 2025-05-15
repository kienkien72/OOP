package SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienManager {
    // List là một interface nên không thể new (tạo đối tượng mới đượca)
    private List<SinhVien> sv;

    public SinhVienManager() {
        this.sv = new ArrayList<>();
    }

    public void themSinhVien(SinhVien sinhVien) {
        sv.add(sinhVien);
    }

}
