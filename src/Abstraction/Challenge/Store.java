package Abstraction.Challenge;

import java.util.ArrayList;

public class Store {
    private static ArrayList<ProductForSale> storeProduct = new ArrayList<>();

    public static void main(String[] args) {
        storeProduct.add(new Product1("Oil painting", 1350, "made in china"));
        storeProduct.add(new Product1("Clothing", 2000, "new model 2024"));
        for (var product : storeProduct
             ) {
            product.showDetails();
        }
    }
}
