
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prints "Write a message"
        System.out.println("Write a message:");

        // Write your program here

        //Asks the user to enter input
        String message = scanner.nextLine();

        //Prints the input
        System.out.println(message);

    }
}
