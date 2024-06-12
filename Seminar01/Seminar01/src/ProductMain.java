import impl.BottleOfWater;


import java.time.LocalDate;

public class ProductMain {
    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1), true, EPackage.GLASS.getMaterial(), 0.5);
    }
}
