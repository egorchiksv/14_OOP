import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> product) {
        this.products = product;
    }

    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public void addProduct (List<Product> products) {
        this.products.addAll(products);
    }

    public Product getProduct(String name) {

//        products.stream().filter(product -> product.getName().equals(name)).findFirst().orElse(null);

        for (Product product : products) {
            if (product.getName().equals(name)) {
                Product result = product;
                products.remove(product);
                return result;
            }
        }

//        throw new RuntimeException("No such product: " + name);
        System.out.println("No such product: " + name);
        return null;
    }

    public List<Product> getProduct() {
        return products;
    }
}
