package Interface.Câu1;

public class Iphone implements Switchable {

    @Override
    public String turnOn() {
        return "Iphone turn on";
    }

    @Override
    public String turnOff() {
        return "Iphone turn off";
    }

}
