
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                if (!line.isEmpty()) {
                    list.add(line);
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed");
        }

        System.out.println("");

        System.out.println("Search for:");
        while (true) {
            String searchedFor = scanner.nextLine();

            if (searchedFor.isEmpty()) {
                break;
            }

            if (list.contains(searchedFor)) {
                System.out.println("Found");
                break;
            } else {
                System.out.println("Not found");
                break;
            }
            
        }

    }
}
