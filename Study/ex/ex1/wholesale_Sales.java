package ex.ex1;

public class wholesale_Sales extends transaction{
    private double discount;

    public wholesale_Sales(){
    }
    
    public wholesale_Sales(double bruteValue, double discount){
        super(bruteValue);
        this.discount = discount;
    }

    @Override
    public double calculateLiquidValue(){
        double liquidValue = bruteValue - discount;
        return liquidValue;
    }
}
