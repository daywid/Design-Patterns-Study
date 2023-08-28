package ex.ex2;

public abstract class Context {    
    protected double directCost;

    public Context(){
    }

    public Context (double directCost){
        this.directCost = directCost;
    }

    public double calculateTotalCost(){
        return 0;
    }

}
