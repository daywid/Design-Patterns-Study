package ex.ex2;

public class ProductsSales extends Context{
    private double profitMargin;

    public ProductsSales(){
    }
    public ProductsSales(double directCost, double profitMargin){
        super(directCost);
        this.profitMargin = profitMargin;
    }

    public double calculateTotalCost(){
        double totalCost = directCost * profitMargin; 
        return totalCost;
    }
}
