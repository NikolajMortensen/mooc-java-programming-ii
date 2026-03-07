import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        } 

        double currentMax = history.get(0);

        for (double value : history) {
            
            if (value > currentMax) {
                currentMax = value;
            }
        }
        return currentMax;
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0.0;
        }

        double currentMin = history.get(0);

        for (double value : history) {
            if (value < currentMin) {
                currentMin = value;
            }
        }
        return currentMin;
    }

    public double average() {
        if (history.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;

        for (double value : history) {
            sum += value;
        }

        return sum / history.size();
    }
    
}
