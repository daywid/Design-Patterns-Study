package ex.ex2;

public class ServicesProvision extends Context{
    private double serviceCharge;

    public ServicesProvision(){
    }

    public ServicesProvision(double directCost, double serviceCharge){
        super(directCost);
        this.directCost = directCost;
    }

    @Override
    public double calculateTotalCost(){
        double totalCost = directCost + serviceCharge;
        return totalCost;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }
    
}
