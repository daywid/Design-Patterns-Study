package ex.ex1;

public class wholesale extends transaction{
    private double discount;

    public wholesale(){
    }
    
    public wholesale(double bruteValue, double discount){
        super(bruteValue);
        this.discount = discount;
    }

    @Override
    public double calculateLiquidValue(){
        double liquidValue = bruteValue - discount;
        return liquidValue;
    }
}
