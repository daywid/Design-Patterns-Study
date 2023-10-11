package Testes;

public class Smartphone extends Product{
    public String name;
    public double price;
    public String sku;


    public void displayInfo() {
        System.out.println("Smartphone: " + name + ", Price: " + price + ", SKU: " + sku);
    } 
}
