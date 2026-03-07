
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 4) {
                break;
            } else {
                System.out.println("Give a number");
            }
        }
    }
}
