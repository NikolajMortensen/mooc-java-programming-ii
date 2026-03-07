
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbOfNumbers = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            numbOfNumbers = numbOfNumbers + 1;
            sum = number + sum;


        }
        double average = (double) sum / numbOfNumbers;
        System.out.println("Average of the numbers: " + average);

    }
}
