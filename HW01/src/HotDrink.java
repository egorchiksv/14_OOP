public class HotDrink extends Product{
    private boolean milk;

    public HotDrink(String name, double volume, int temperature, double price) {
        super(name, volume, temperature, price);
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
        this.price = price;
        this.milk = false;
    }

    public HotDrink(String name, double volume, int temperature, double price, boolean milk) {
        super(name, volume, temperature, price);
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
        this.price = price;
        this.milk = milk;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                ", name='" + name + '\'' +
                ", temperature=" + temperature +
                ", volume=" + volume +
                ", price=" + price +
                "milk=" + milk +
                '}';
    }
}
