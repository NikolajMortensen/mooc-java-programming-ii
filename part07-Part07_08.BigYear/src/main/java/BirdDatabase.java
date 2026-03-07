import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birds = new ArrayList<>();
    
    public BirdDatabase() {

    }

    public void add(String name, String latinName) {
        Bird newBird = new Bird(name, latinName);
        this.birds.add(newBird);
    }

    public void addObservation(String name) {
        boolean found = false;

        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                bird.addObservation();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not a bird!");
        }
    }

    public void printAll() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public void printOne(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                System.out.println(bird);
                return;
            }
        }
    }

}
