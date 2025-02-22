public class List <T>{
   private T[] values;
   private int freePosition;
   
   public List(){
       this.values = (T[]) new Object[20];
       this.freePosition = 0;
   }
   
   public void add(T value){
       if(this.freePosition == this.values.length){
        grow();   
       }
       
       this.values[this.freePosition] = value;
       this.freePosition++;
   }
 
    private void grow() {
        T[] valuesGrowed = (T[]) new Object[this.values.length + this.values.length / 2];
        for (int i = 0; i < this.values.length; i++) {
            valuesGrowed[i] = this.values[i];
        }
        this.values = valuesGrowed;
    }
   
   public boolean contains(T value){
       for (T element : values) {
           if(value == element || element.equals(value)) return true;
       }
       return false;
   }
   
   public void remove(T element){
       int index = this.indexOf(element);
       if(index != -1){
           moveToTheLeft(index);
           this.freePosition--;
       }
   }
   
   private void moveToTheLeft(int fromIndex) {
    for (int i = fromIndex; i < this.freePosition - 1; i++) {
        this.values[i] = this.values[i + 1];
    }
}
   
   public int indexOf(T element){
       for (int i = 0; i < this.freePosition; i++) {
           if(this.values[i].equals(element)){
               return i;
           }
       }
           return -1;
   }
   
   public T value(int index) {
    if (index < 0 || index >= this.freePosition) {
        throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.freePosition + "]");
    }
 
    return this.values[index];
    }
   
   public int size() {
    return this.freePosition;
    }
}