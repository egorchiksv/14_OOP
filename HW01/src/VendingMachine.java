import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(){
        this.products = new ArrayList<>();
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public void addProduct (List<Product> products) {
        this.products.addAll(products);
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if(product.getName().equals(name)) {
                products.remove(product);
                return product;
            }
        }
        System.out.println("Напиток с именем " + name + "не нейден");
        return null;
    }

    public List<Product> getProducts() {
        return products;
    }
}
