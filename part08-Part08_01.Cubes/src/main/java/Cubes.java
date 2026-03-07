
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Starting loop
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }

            // Taking the string from scanner and reference to int.
            int number = Integer.valueOf(input);
            // Using the int to calculate cube
            int cube = Integer.valueOf(number * number * number);
            System.out.println(cube);




            
        }

    }
}
