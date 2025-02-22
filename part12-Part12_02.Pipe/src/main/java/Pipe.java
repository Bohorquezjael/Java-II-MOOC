
import java.util.ArrayList;

public class Pipe <T>{
    private ArrayList<T> pipe;
    
    public Pipe(){
        this.pipe = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.pipe.add(value);
    }
    
    public T takeFromPipe(){
        return this.pipe.remove(this.pipe.size() - 1);
    }
    
    public boolean isInPipe(){
        return !this.pipe.isEmpty();
    }
}
