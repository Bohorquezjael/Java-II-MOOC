
import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> owners = new HashMap<>();
    
    public void setSum(String toWhom, double amount){
        owners.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        return owners.getOrDefault(toWhom, 0.0);
    }
}
