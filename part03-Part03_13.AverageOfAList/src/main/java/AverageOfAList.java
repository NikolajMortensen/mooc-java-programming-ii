
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList <Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }

        // If size of list is larger than 0
        // Creating sum variable
        if (list.size() > 0) {
            int sum = 0;
            for (int num : list) { // For each num in list, add num to sum.
                sum += num;
            }

            double average = (double) sum / list.size(); // Find average from sum and size of array
            System.out.println(average);
        } else {
            System.out.println("No number");
        }
        
    }
}
