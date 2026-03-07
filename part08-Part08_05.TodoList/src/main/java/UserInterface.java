import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;


    public UserInterface(TodoList todoList, Scanner scanner ) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("stop")) {
                break;
            }

            if (command.equalsIgnoreCase("add")) {
                System.out.println("To add: ");
                String task = scanner.nextLine();
                todoList.add(task);
            }

            if (command.equalsIgnoreCase("list")) {
                todoList.print();
            }

            if (command.equalsIgnoreCase("remove")) {
                System.out.println("Which one is removed: ");
                int removedNumer = Integer.valueOf(scanner.nextLine());
                todoList.remove(removedNumer);
            }
        }
    }
}
