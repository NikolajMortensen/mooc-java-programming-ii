import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    private int maxWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int currentTotal = 0;
        for (Suitcase s : suitcases) {
            currentTotal += s.totalWeight();
        }
        return currentTotal;
    }

    public void printItems() {
        for (Suitcase s : suitcases) {
            s.printItems();
        }
    }

    public String toString() {
        return suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
