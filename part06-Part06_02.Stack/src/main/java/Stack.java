import java.util.ArrayList;
import java.util.List;

public class Stack {
    
    public ArrayList<String> list = new ArrayList<>();

    public Stack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (this.list.isEmpty()) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        this.list.add(value);
    }

    public ArrayList<String> values() {
        return this.list;
    }

    public String take() {
        String taken = this.list.remove(list.size()-1);
        return taken;
    }

}
