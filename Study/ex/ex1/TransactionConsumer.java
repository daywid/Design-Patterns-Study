package ex.ex1;

public class TransactionConsumer {
    public static void main(String[] args) {
        // Create instances of different transaction types
        WholesaleSales wholesaleSale = new WholesaleSales(1000.0, 50.0);
        RetailSales retailSale = new RetailSales(500.0, 0.1);
        ServicesProvision servicesProvision = new ServicesProvision(800.0, 100.0);

        // Calculate and display the liquid values
        double wholesaleLiquidValue = wholesaleSale.calculateLiquidValue();
        double retailLiquidValue = retailSale.calculateLiquidValue();
        double servicesLiquidValue = servicesProvision.calculateLiquidValue();

        System.out.println("Liquid value of wholesale sale: " + wholesaleLiquidValue);
        System.out.println("Liquid value of retail sale: " + retailLiquidValue);
        System.out.println("Liquid value of services provision: " + servicesLiquidValue);
    }
}
