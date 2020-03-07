package cash.register;
public class CashRegister1 {
    public CashRegister1(){
        purchase = 0;
        payment = 0;
    }
    public void recordPurchase(double amount){
        purchase = amount + purchase;
    }
    public void enterPayment(int dollar, int quarter, int dime, int nickel, int penny){
        payment = dollar + (quarter * quarterValue) + (dime * dimeValue) + (nickel * nickelValue) + (penny * pennyValue);  
    }
    public double giveChange(){
        double change = ((payment - purchase) * (1-taxAmount));
        purchase = 0;
        payment = 0;
        return change;
    }
    public void enterDollar(double amount){
        payment = amount;
    }
    public void enterQuarter(double amount){
        payment = payment + (amount * quarterValue);
    }
    public void enterDime(double amount){
        payment = payment + amount * dimeValue;
    }
    public void enterNickel(double amount){
        payment = payment + amount * nickelValue;
    }
    public void enterPenny(double amount){
        payment = payment + amount * pennyValue;
    }
    public static final double quarterValue = 0.25;
    public static final double dimeValue = 0.1;
    public static final double nickelValue = 0.05;
    public static final double pennyValue = 0.01;
    public static final double taxAmount = (0/100);
    private double purchase;
    private double payment;   
    
}
