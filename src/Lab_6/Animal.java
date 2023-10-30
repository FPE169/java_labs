package Lab_6;

public class Animal implements Nameable {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    @Override
    public String getName() {
        return species;
    }
}