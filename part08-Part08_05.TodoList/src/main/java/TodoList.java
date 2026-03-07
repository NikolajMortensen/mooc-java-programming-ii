import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String task) {
        this.todoList.add(task);
    }

    public void remove(int number) {
        if (number > 0 && number <= todoList.size()) {
            todoList.remove(number - 1);
        }
    }

    public void print() {
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i + 1 + ": " + todoList.get(i));
        }
    }

}
