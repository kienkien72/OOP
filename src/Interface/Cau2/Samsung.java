package Interface.Cau2;

public class Samsung implements Connectable {

    @Override
    public String connectToInternet(String network) {
        return " Samsung connect to " + network;
    }

}
