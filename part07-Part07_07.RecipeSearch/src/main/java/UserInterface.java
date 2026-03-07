import java.nio.file.Paths;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private RecipeManager recipeManager;


    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.recipeManager = new RecipeManager();
    }

    // Starts the program
    public void start() {
        System.out.println("File to read: ");
        String filename = scanner.nextLine();

        recipeManager.readRecipes(filename);

        System.out.println();
        System.out.println("Commands: \nlist - list the recips\nstop - stops the program\nEnter command: ");
            while (true) {
                String command = scanner.nextLine().trim().toLowerCase();

                switch (command) {
                    case "list":
                        recipeManager.listRecipes();
                        break;
                
                    case "stop":
                        return;

                    case "find name":
                        System.out.println("Searched word: ");
                        String word = scanner.nextLine();
                        recipeManager.findName(word);
                        break;

                    case "find cooking time":
                        System.out.println("Max cooking time: ");
                        int cookingTime = Integer.valueOf(scanner.nextLine());
                        recipeManager.findByTime(cookingTime);
                        break;

                    case "find ingredient":
                        System.out.println("Ingredient: ");
                        String ingredient = scanner.nextLine();
                        recipeManager.findByIngredient(ingredient);
                        break;
                    default:
                        System.out.println("Unknown command");
                        
                }

                
        }
    }
}
