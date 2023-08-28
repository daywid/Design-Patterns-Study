package ex.ex1;

public class RetailSales extends transaction{
    private double taxRate;

    public RetailSales(){
    }

    public RetailSales(double bruteValue, double taxRate){
        super(bruteValue);
        this.taxRate = taxRate;
    }

    @Override
    public double calculateLiquidValue(){
        double liquidValue = bruteValue - (bruteValue * taxRate);
        return liquidValue;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
}
