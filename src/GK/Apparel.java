package GK;

public class Apparel implements Billable, Showable {
    private String brand;
    private double price;
    private String category;

    public Apparel(String brand, double price, String category) {
        this.brand = brand;
        this.price = price;
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public double calculateTotalPrice() {
        return price;
    }

    @Override
    public void showDetails() {
        System.out.println("Thuong hieu: " + brand);
    }
}
