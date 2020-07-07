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

    @Override
    String move() {
        return "swims";
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