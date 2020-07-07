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

    @Override
    String move() {
        return "Flys";
    }

    @Override
    String breate() {
        return "lungs";
    }

    @Override
    String reproduce() {
        return "eggs";
    }

}