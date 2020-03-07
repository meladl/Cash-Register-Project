package cash.register;
public class CashRegisterTester {
    public static void main(String[] args) {
        CashRegister1 moCasheir = new CashRegister1();
        moCasheir.recordPurchase(0.75);
        moCasheir.recordPurchase(1.50);
        moCasheir.enterPayment(2, 0, 5, 0, 0);
        System.out.println("Change =");
        System.out.println(moCasheir.giveChange());
        moCasheir.recordPurchase(255);
        moCasheir.recordPurchase(10);
        moCasheir.enterPayment(300, 0, 0, 0, 0);
        System.out.println("Change =");
        System.out.println(moCasheir.giveChange());
        moCasheir.recordPurchase(250.55);
        moCasheir.enterDollar(300);
        moCasheir.enterQuarter(2);
        moCasheir.enterDime(0);
        moCasheir.enterPenny(5);
        moCasheir.enterNickel(0);
        System.out.println("Change =");
        System.out.println(moCasheir.giveChange());
    }
    
}
