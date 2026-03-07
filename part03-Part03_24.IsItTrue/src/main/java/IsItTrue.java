
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String trueWord = "true";

        System.out.println("Give a string: ");
        String word = scanner.nextLine();

        if (word.equals(trueWord)) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
