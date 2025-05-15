package GK;

public class Stationery implements Billable, Trackable {
    private String itemName;
    private double unitPrice;
    private int itemsSold;

    public Stationery(String itemName, double unitPrice, int itemsSold) {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.itemsSold = itemsSold;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getItemsSold() {
        return itemsSold;
    }

    public void setItemsSold(int itemsSold) {
        this.itemsSold = itemsSold;
    }

    @Override
    public double calculateTotalPrice() {
        return unitPrice * itemsSold;
    }

    @Override
    public int getUnitsSold() {
        return itemsSold;
    }
}
