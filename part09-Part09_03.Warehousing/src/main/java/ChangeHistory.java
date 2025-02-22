
import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    
    private ArrayList<Double> history = new ArrayList<Double>();
    
    public void add(double status){
        this.history.add(status);
    }
    
    public void clear(){
        this.history.clear();
    }
    
    
    public double maxValue(){
        return Collections.max(this.history);
    }
    
    public double minValue(){
        return Collections.min(this.history);
    }
    
    public double average(){
        double sum = 0;
        for(double e : this.history){
            sum += e;
        }
        return sum / this.history.size();
    }
    
    public String toString(){
        return this.history.toString();
    }
}
