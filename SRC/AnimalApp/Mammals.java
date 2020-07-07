package SRC.AnimalApp;

public class Mammals extends Animals{

    public Mammals() {
        super();
    }

    public Mammals(String name, int yearDiscovered) {
        super();
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    @Override
    String move() {
        return "walks";
    }

    @Override
    String breate() {
        return "Uses lungs";
    }

    @Override
    String reproduce() {
        return "live births";
    }
    
}