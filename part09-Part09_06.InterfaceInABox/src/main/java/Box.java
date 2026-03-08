import java.util.ArrayList;

public class Box implements Packable {
    private ArrayList<Packable> items;
    private double maxCapacity;

    public Box(double maxCapacity) {
        this.items = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }

    public void add(Packable item) {
        if (this.weight() + item.weight() <= this.maxCapacity) {
            items.add(item);
        }
    }

    public double weight() {
        double weight = 0;

        for (Packable item : items) {
            weight += item.weight();
        }
        return weight;
    }

    public String toString() {
        return "Box: " + items.size() + " items, total weight " + this.weight() + " kg";
    }

}
