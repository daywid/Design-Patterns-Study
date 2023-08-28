package ex.ex1;

/**
 * transaction
 */
public abstract class Transaction {

    public double bruteValue;

    public Transaction(){
    }

    public Transaction(double bruteValue){
        this.bruteValue = bruteValue;
    }


    public double calculateLiquidValue(){
        
        
        return 0;
    }
    
}