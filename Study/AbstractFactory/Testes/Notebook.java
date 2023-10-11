package Testes;

// Classe concreta de produtos eletrônicos
public class Notebook implements ProductFactory {
    public String name;
    public double price;
    public String sku;


    public void displayInfo() {
        System.out.println("Notebook: " + name + ", Price: " + price + ", SKU: " + sku);
    }


    @Override
    public void createProduct() {
        return new Notebook();
    } 
}
