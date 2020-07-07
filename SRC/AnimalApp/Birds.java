package SRC.AnimalApp;

public class Birds extends Animals {

    public Birds() {
        super();
    }

    public Birds(String name, int yearDiscovered) {
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
        return "Bird";
    }


    @Override
    public String move() {
        return "Flys";
    }

    @Override
    public String breate() {
        return "lungs";
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