import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    public int totalWeight() {
        return items.stream()
                        .mapToInt(item -> item.getWeight())
                        .sum();
    }

    public void printItems() {
        items.stream().forEach(System.out::println);
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        return items.stream()
                        .max((item1, item2) -> item1.getWeight() - item2.getWeight())
                        .get();
    }

    public String toString() {
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight() + " kg)";
        }
        if (this.items.size() > 1) {
            return this.items.size() + " items (" + this.totalWeight() + " kg)";
        }
        return "no items (0 kg)";
    }
}