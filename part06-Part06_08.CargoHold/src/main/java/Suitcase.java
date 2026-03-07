import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maximumWeight;
    private int currentWeight;

    public Suitcase(int maxWeight) {
        this.maximumWeight = maxWeight;
        this.currentWeight = 0;
    }

    public void addItem(Item item) {
        if (this.currentWeight + item.getWeight() <= this.maximumWeight) {            
            items.add(item);
            this.currentWeight += item.getWeight();
        }
    }

    public int totalWeight() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getWeight();
        }
        return sum;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item heaviestItem = this.items.get(0);

        for (Item item : items) {
            if (heaviestItem.getWeight() < item.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;

    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public String toString() {
        if (items.isEmpty()) {
            return "no items (" + currentWeight + " kg)"; 
        }

        String suffix = (items.size() == 1) ? " item" : " items";

        return items.size() + suffix + " (" + this.totalWeight() + " kg)";

    }
}
