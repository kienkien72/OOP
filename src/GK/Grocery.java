package GK;

public class Grocery implements Billable, Showable, Trackable {
    private String productName;
    private double pricePerUnit;
    private int unitsSold;

    public Grocery(String productName, double pricePerUnit, int unitsSold) {
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.unitsSold = unitsSold;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public void setUnitsSold(int unitsSold) {
        this.unitsSold = unitsSold;
    }

    @Override
    public double calculateTotalPrice() {
        return pricePerUnit * unitsSold;
    }

    @Override
    public void showDetails() {
        System.out.println("Ten san pham " + productName + " : " + pricePerUnit);
    }

    @Override
    public int getUnitsSold() {
        return unitsSold;
    }
}
