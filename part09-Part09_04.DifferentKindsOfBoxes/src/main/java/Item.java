
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (object instanceof Item) {
            Item castedObject = (Item) object;

            return this.getName().equals(castedObject.getName());
        }

        return false;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

}
