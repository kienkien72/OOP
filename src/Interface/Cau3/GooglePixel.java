package Interface.Cau3;

public class GooglePixel implements Connectable, Switchable {
    @Override
    public String connectToInternet(String network) {
        return "Google Pixel connect to " + network;
    }

    @Override
    public String turnOn() {
        return "Google Pixel turned on";
    }

    @Override
    public String turnOff() {
        return "Google Pixel turned off";
    }

}
