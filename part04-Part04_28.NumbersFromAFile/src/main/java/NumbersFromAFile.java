
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int count = 0; //initialises the count of elements


        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        
        //opens the specified file using a new scanner
        try (Scanner fileReader = new Scanner(Paths.get(file))) {

            //reads the whole file until it reaches the end
            while (fileReader.hasNextLine()) {
                int number = Integer.valueOf(fileReader.nextLine());
                numbers.add(number);
            }
        } catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }

        for (int number : numbers) {
            if (number >= lowerBound && number <= upperBound) {
                count++;
            }
        }
        
        System.out.println("Numbers: " + count); // prints the total count

    }

}
