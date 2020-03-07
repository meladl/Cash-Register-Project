public class Purchase {
    private String item;
    private double price;
    private int count;
    
    public Purchase(String aItem, double aPrice, int aCount ){
        item = aItem;
        price = aPrice;
        count = aCount;
    }
    public String getItemName(){
        return item;
    }
    public double getUnitPrice(){
        return price;
    }
    public double getTotal(){
        return price * count;
    }
 
    
    
}
