

import java.time.LocalDate;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {

        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1),
                true, EPackage.GLASS.getMaterial(), 0.5F);

        VendingMachine vm = new VendingMachine();
        System.out.println(vm.getProducts());

        vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        System.out.println(vm.getProducts());

        vm.getProduct("Родники");

        System.out.println(vm.getProducts());
    }
}