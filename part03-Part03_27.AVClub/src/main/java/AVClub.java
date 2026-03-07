
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            String[] pieces = text.split(" ");

            if (text.isEmpty()) {
                break;
            }

            for (String word : pieces) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }

        }

    }
}
