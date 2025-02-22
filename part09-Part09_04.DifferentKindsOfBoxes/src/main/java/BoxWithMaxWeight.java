import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{

    private final int MAX_WEIGHT;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity){
        this.MAX_WEIGHT = capacity;
        this.items = new ArrayList<>();
    }
    
    private int calculateTotalWeight(){
        final int[] sum = {0};
        items.forEach(element -> sum[0] += element.getWeight());
        return sum[0];
    }
    
    @Override
    public void add(Item item) {
         if(!(item.getWeight() + this.calculateTotalWeight() > this.MAX_WEIGHT)){
             this.items.add(item);
         }
   }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
    
    
}
