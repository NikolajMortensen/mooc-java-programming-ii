import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeManager {
    private ArrayList<Recipe> recipes = new ArrayList<>();
    public RecipeManager() {

    }


    public void readRecipes(String filename) {
        try (Scanner scanner = new Scanner(Paths.get(filename))) {
                while (scanner.hasNextLine()) {
                    String name = scanner.nextLine().trim();
                    int time = Integer.valueOf(scanner.nextLine());
                    ArrayList<String> ingredients = new ArrayList<>();
    
                    while (scanner.hasNextLine()) {
                        String ingredient = scanner.nextLine();
                        if (ingredient.isEmpty()) {
                            break;
                        } else {
                            ingredients.add(ingredient);
                        }
                    }
                    Recipe recipe = new Recipe(name, time, ingredients);
                    recipes.add(recipe);
                    
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
    }

    public void listRecipes() {
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    public void findName(String word) {
        for (Recipe recipe : recipes) {
            if (recipe.getName().toLowerCase().contains(word)) {
                System.out.println(recipe);
            }
        }
    }

    public void findByTime(int time) {
        for (Recipe recipe : recipes) {
            if (recipe.getTime() <= time) {
                System.out.println(recipe);
            }
        }
    }

    public void findByIngredient(String ingredient) {
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
 
}
