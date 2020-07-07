package SRC.AnimalApp;

public class Fish extends Animals {

    public Fish() {
        super();
    }

    public Fish(String name, int yearDiscovered) {
        super();
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getType() {
        return "Fish";
    }
    
    @Override
    public String move() {
        return "swims";
    }

    @Override
    public String breate() {
        return "gills";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }

    @Override
    public String toString() {
        return " | " + name + " | " + yearDiscovered + " | \n";
    }

}