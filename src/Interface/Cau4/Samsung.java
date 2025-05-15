package Interface.Cau4;

public class Samsung implements Rechargeable {
    @Override
    public String recharge(int minutes) {
        return "Samsung recharged for " + minutes + " minutes";
    }
}
