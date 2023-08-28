package ex.ex2;

public class ContextConsumer {
    public static void main(String[] args) {
        // Create instances of different context types
        ProductsProductions productsProduction = new ProductsProductions(1000.0, 200.0);
        ProductsSales productsSales = new ProductsSales(500.0, 0.2);
        ServicesProvision servicesProvision = new ServicesProvision(800.0, 100.0);

        // Calculate and display the total costs
        double productionTotalCost = productsProduction.calculateTotalCost();
        double salesTotalCost = productsSales.calculateTotalCost();
        double servicesTotalCost = servicesProvision.calculateTotalCost();

        System.out.println("Total cost of products production: " + productionTotalCost);
        System.out.println("Total cost of products sales: " + salesTotalCost);
        System.out.println("Total cost of services provision: " + servicesTotalCost);
    }
}


