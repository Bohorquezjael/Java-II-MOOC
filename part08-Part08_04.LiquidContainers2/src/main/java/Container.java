public class Container {
  private int amount;
  private int maxAmount;
 
  public Container() {
    this.amount = 0;
    this.maxAmount = 100;
  }
 
  public int contains() {
    return this.amount;
  }
 
  public void add(int toAdd) {
    if (toAdd <= 0) {
      return;
    }
    if ((this.amount + toAdd) >= this.maxAmount) {
      this.amount = this.maxAmount;
      return;
    }
    this.amount += toAdd;
  }
 
  public void remove(int toRemove) {
    if (toRemove <= 0) {
      return;
    }
    if (toRemove > this.amount) {
      this.amount = 0;
      return;
    }
    this.amount -= toRemove;
  }
 
  @Override
  public String toString() {
    return (this.amount + "/" + this.maxAmount);
  }
}