import java.nio.file.Paths;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private BirdDatabase birdDatabase;


    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birdDatabase = new BirdDatabase();
    }

    // Starts the program
    public void start() {
            while (true) {
                System.out.println("?");
                String command = scanner.nextLine().trim().toLowerCase();

                switch (command) {
                    case "add":
                        System.out.println("Name: ");
                        String name = scanner.nextLine();
                        System.out.println("Name in latin: ");
                        String latinName = scanner.nextLine();
                        birdDatabase.add(name, latinName);
                        break;
                    case "quit":
                        return;

                    case "observation":
                        System.out.println("Bird? ");
                        String birdName = scanner.nextLine();
                        birdDatabase.addObservation(birdName);
                        break;

                    case "all":
                        birdDatabase.printAll();
                        break;

                    case "one":
                        System.out.println("Bird? ");
                        String oneBird = scanner.nextLine();
                        birdDatabase.printOne(oneBird);
                        break;
                    
                
                    default:
                        System.out.println("Unknown command");
                        
                }

                
        }
    }
}
