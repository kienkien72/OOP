import java.util.Scanner;

public class test {

    public static int Tong(int a, int b) {
        return a + b;
    }

    public static int Tong(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("So 1: ");
        int a = nhap.nextInt();
        System.out.println("So 2: ");
        int b = nhap.nextInt();
        System.out.println("So 3: ");
        int c = nhap.nextInt();

        System.out.println("Tong hai so: " + Tong(a, b));
        System.out.println("Tong ba so: " + Tong(a, b, 7));

    }
}
