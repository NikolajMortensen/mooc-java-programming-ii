
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number? ");
        int number = Integer.valueOf(scanner.nextLine());

        System.out.println("Second number?");
        int number2 = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;

        while (number <= number2) {
            sum += number;
            number++;

        }
        System.out.println(sum);
    }
}
