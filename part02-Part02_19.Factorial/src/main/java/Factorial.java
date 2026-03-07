
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        
        int sum = 1;
        int n = 0;

        while (n < number) {
            n++;
            sum = n * sum;


        }
        System.out.println(sum);
    }
}
