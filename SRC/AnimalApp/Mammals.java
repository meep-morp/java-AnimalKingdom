package SRC.AnimalApp;

public class Mammals extends Animals {

    public Mammals() {
        super();
    }

    public Mammals(String name, int yearDiscovered) {
        super();
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return "Mammal";
    }

    // Methods
    @Override
    public String move() {
        return "walks";
    }

    @Override
    public String breate() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "live births";
    }

    @Override
    public String toString() {
        return " | " + name + " | " + yearDiscovered + " | \n";
    }

}