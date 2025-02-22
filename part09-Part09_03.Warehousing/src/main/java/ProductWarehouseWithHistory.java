public class ProductWarehouseWithHistory extends  ProductWarehouse{
    
    private ChangeHistory logs = new ChangeHistory();
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
       super(productName, capacity);
       super.addToWarehouse(initialBalance);
       this.logs.add(initialBalance);
    }
    
    public String history(){
        return this.logs.toString();
    }
    
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.logs.add(super.getBalance());
    }
    
    public double takeFromWarehouse(double amount){
        double b = super.takeFromWarehouse(amount);
        this.logs.add(super.getBalance());
        return b;
    }
    
    public void printAnalysis(){
        System.out.printf("Product: %s\n"
                        + "History: %s\n"
                        + "Largest amount of product: %f\n "
                        + "Smallest amount of product: %f\n "
                        + "Average: %f",
                            super.getName(),
                            this.history(),
                            this.logs.maxValue(),
                            this.logs.minValue(),
                            this.logs.average());
    }
}
