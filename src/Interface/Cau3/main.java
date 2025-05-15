package Interface.Cau3;

public class main {
    public static void main(String[] args) {
        Switchable switchable = new GooglePixel();
        Connectable connectable = new GooglePixel();

        System.out.println(switchable.turnOn());
        System.out.println(connectable.connectToInternet("Wifi"));
    }
}
