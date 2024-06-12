public class Product {
    protected String name;
    protected double volume;
    protected int temperature;
    protected double price;

    public Product(String name, double volume,  int temperature, double price) {
        this.name = name;
        this.temperature = temperature;
        this.volume = volume;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", temperature=" + temperature +
                ", volume=" + volume +
                ", price=" + price +
                '}';
    }
}
