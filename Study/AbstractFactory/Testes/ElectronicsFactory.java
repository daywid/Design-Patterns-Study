package Testes;

public class ElectronicsFactory {
    private ProductFactory productFactory;

    public ElectronicsFactory(ProductFactory productFactory) {
        this.productFactory = productFactory;
    }

    public Product createProduct() {
        return productFactory.createProduct();
    }
}
