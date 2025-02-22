
import java.util.ArrayList;

public class Box implements Packable {
    
    private final double MAX_CAPACITY;
    private ArrayList<Packable> packables;

    public Box(double maxCapacity){
        this.packables = new ArrayList<>();
        this.MAX_CAPACITY = maxCapacity;
    }
    
    public void add(Packable packable){
        if(this.weight() + packable.weight() <= this.MAX_CAPACITY){
            this.packables.add(packable);
        }
    }
    
    @Override
    public double weight() {
        double weightSum = 0;
        for(Packable p : this.packables){
            weightSum += p.weight();
        }
        return weightSum;
    }
    
    @Override
    public String toString(){
        return "Box: " + this.packables.size() + " items, total weight " + this.weight() + " kg";
    }
}
