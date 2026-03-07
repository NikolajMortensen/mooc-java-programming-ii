
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Prompts a string
        System.out.println("What's your name?");

        // Reads the users input as a string
        String message = scanner.nextLine();

        // Output's hi + name
        System.out.println("Hi " + message);


    }
}
