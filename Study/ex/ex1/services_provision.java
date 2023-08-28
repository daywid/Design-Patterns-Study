package ex.ex1;

public class services_provision extends transaction{
    public double serviceCharge;

    public services_provision(){
    }
    
    public services_provision(double bruteValue, double serviceCharge){
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