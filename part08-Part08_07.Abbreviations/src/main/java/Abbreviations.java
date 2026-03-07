import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbrevations;

    public Abbreviations() {
        this.abbrevations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        if (this.abbrevations.containsKey(abbreviation)) {
            System.out.println("Abbreavation already exist!");
        } else {
            this.abbrevations.put(abbreviation, explanation);
        }
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.abbrevations.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        if (abbreviation == null) {
            return null;
        } else {
            return this.abbrevations.get(abbreviation);
        }
    }
}
