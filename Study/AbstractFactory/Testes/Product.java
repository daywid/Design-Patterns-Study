package Testes;

// Classe abstrata de produtos
public abstract class Product {
    public String name;
    public double price;
    public String sku;

    public abstract void displayInfo();
}