package cash.register;

import java.util.Scanner;
public class InputTester {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    CashRegister1 mo2 = new CashRegister1();
    System.out.print("Enter Price: ");
    double price = in.nextDouble();
    mo2.recordPurchase(price);
    System.out.print("Enter Dollars: ");
    int dollars = in.nextInt();
    System.out.print("Enter Quarters: ");
    int quarter = in.nextInt();
    System.out.print("Enter Dimes: ");
    int dime = in.nextInt();
    System.out.print("Enter Nickels: ");
    int nickel = in.nextInt();
    System.out.print("Enter Pennies: ");
    int penny = in.nextInt();
    mo2.enterPayment(dollars,quarter,dime,nickel,penny);
    System.out.print("Your Change is ");
    System.out.println(mo2.giveChange());
    }
    
}
