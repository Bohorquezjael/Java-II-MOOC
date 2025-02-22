public class Item {

    private int unitPrice;
    private int quantity;
    private String product;
    
    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.quantity = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price(){
        return this.quantity * this.unitPrice;
    }
    
    public void increaseQuantity(){
        this.quantity++;
    }
    
    public String toString(){
        return this.product + ": " + this.quantity;
    }
}
