package ex.ex1;

public class ServicesProvision extends transaction{
    public double serviceCharge;

    public ServicesProvision(){
    }
    
    public ServicesProvision(double bruteValue, double serviceCharge){
        super(bruteValue);
        this.serviceCharge = serviceCharge;
    }

    public double calculateLiquidValue(){
        double liquidValue = bruteValue - serviceCharge;
        return liquidValue;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }
}