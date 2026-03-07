import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());

        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> units = this.storage.get(storageUnit);

        if (units == null) {
            units = new ArrayList<>();
        }

        return units;
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> items = this.storage.get(storageUnit);

        if (items == null) {
            return;
        }

        items.remove(item); 

        if (items.isEmpty()) {
            this.storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> activeUnits = new ArrayList<>();

        for (String unit : this.storage.keySet()) {
            if (!this.storage.get(unit).isEmpty()) {
                activeUnits.add(unit);
            }
        }

        return activeUnits;
    }
}
