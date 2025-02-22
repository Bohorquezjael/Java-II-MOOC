public class Hideout <T>{
    private T hidden;
    
    public void putIntoHideout(T toHide){
        this.hidden = toHide;
    }
    
    public T takeFromHideout(){
        return this.hidden;
    }
    
    public boolean isInHideout(){
        return this.hidden != null;
    }
}

