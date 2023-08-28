package ex.ex2;

public class ProductsProductions extends Context{
    private double indirectCost;

    public ProductsProductions(){
    }

    public ProductsProductions(double directCost, double indirectCost){
        super(directCost);
        this.indirectCost = indirectCost;
    }

    @Override
    public double calculateTotalCost(){
        double totalCost = directCost + indirectCost;
        return totalCost;
    }

    public double getIndirectCost() {
        return indirectCost;
    }

    public void setIndirectCost(double indirectCost) {
        this.indirectCost = indirectCost;
    }
}
