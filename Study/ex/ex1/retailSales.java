package ex.ex1;

public class retail_Sales extends transaction{
    private double taxRate;

    public retail_Sales(){
    }

    public retail_Sales(double bruteValue, double taxRate){
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
