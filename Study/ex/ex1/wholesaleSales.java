package ex.ex1;

public class wholesaleSales extends Transaction{
    private double discount;

    public wholesaleSales(){
    }
    
    public wholesaleSales(double bruteValue, double discount){
        super(bruteValue);
        this.discount = discount;
    }

    @Override
    public double calculateLiquidValue(){
        double liquidValue = bruteValue - discount;
        return liquidValue;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
