package SRC.AnimalApp;

abstract class Animals {

    // Fields
    private static int maxId = 0;

    protected int id;
    protected int yearDiscovered;
    protected String name;

    // Constructors
    public Animals(int yearDiscovered, String name) {
        maxId++;
        id = maxId;

        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public Animals() {
        maxId++;
        id = maxId;
    }

    // Methods
    String eat() {
        return "Eats";
    }

    abstract String move();

    abstract String breate();

    abstract String reproduce();
}