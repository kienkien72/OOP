import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap 2 so: ");

        int b = nhap.nextInt();
        int c = nhap.nextInt();
        nhap.nextLine(); // Xóa dấu Enter thừa sau nextInt()

        while (true) {
            System.out.println("MENU------------");
            System.out.println("Chon so bat ki: ");
            System.out.println("A. Cong hai so:");
            System.out.println("B. Tru hai so:");
            System.out.println("C. Nhan hai so:");
            System.out.println("D. Dung lai:");

            String chon = nhap.nextLine(); // Nhận lựa chọn từ người dùng

            int cong = b + c;
            int tru = b - c;
            int nhan = b * c;

            switch (chon) {
                case "A":
                    System.out.println("Cong hai so: " + cong);
                    break;
                case "B":
                    System.out.println("Tru hai so: " + tru);
                    break;
                case "C":
                    System.out.println("Nhan hai so: " + nhan);
                    break;
                case "D":
                    System.out.println("Dung lai");
                    nhap.close(); // Đóng Scanner
                    return; // Thoát chương trình
                default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai.");
            }
        }
    }
}
