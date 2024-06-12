import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product drink1 = new HotDrink("Кофе", 0.2, 75, 120, true);

        Product drink2 = new HotDrink("Чай", 0.2, 65, 70);

        Product drink3 = new HotDrink("Гоячий шоколад", 0.2, 60, 150);



        VendingMachine vm = new VendingMachine();

        System.out.println(vm.getProducts());

        vm.addProduct(List.of(drink1, drink1, drink2, drink2, drink3, drink3));

        System.out.println(vm.getProducts());

        vm.getProduct("Кофе");

        System.out.println(vm.getProducts());


    }
}