
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int maxLiter = 100;

        while (true) {
            System.out.println("First: " + first + "/" + maxLiter);
            System.out.println("Second: " + second + "/" + maxLiter);

            String input = scan.nextLine();
    
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (parts[0].equals("quit")) {
            }

            if (command.equals("add")) {
                if (amount > 0) {
                    first += amount;

                    if (first >= 100) {
                        first = 100;
                    }
        
                }
            }

            if (command.equals("move")) {
                if (amount <= first) {
                    first = first - amount;
                    second += amount;

                    if (second >= 100) {
                        second = 100;
                    }
                } else {
                    second += first;
                    first = 0;
                }
            }

            if (command.equals("remove")) {
                if (second <= amount) {
                    second = 0;
                } else {
                    second -= amount;
                }
            }

        }
    }

}
