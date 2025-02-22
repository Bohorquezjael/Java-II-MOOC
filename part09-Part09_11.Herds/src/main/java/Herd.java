
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    
    private List<Movable> organisms;
    
    public Herd(){
        this.organisms = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.organisms.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable m : this.organisms){
            m.move(dx, dy);
        }
    }
    
    public String toString(){
        StringBuilder result = new StringBuilder();
        for(Movable m : this.organisms){
            result.append(m.toString() + "\n");
        }
        return result.toString();
    }
}
