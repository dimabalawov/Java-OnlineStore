public class Product {
    private String name;
    private String brand;
    private double price;

    public Product() {
        this("Unknown", "No brand", 0.0);
    }

    public Product(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getName() { return name; }
    public String getBrand() { return brand; }
    public double getPrice() { return price; }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Product " + name + " видалено з пам’яті.");
    }

    @Override
    public String toString() {
        return name + " (" + brand + ") - " + price + " грн";
    }
}
