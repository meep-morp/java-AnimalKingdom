package SRC.AnimalApp;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Filter
    public static ArrayList<Animals> filteredList = new ArrayList<Animals>();

	public static void printAnimals(List<Animals> animals, CheckAnimal tester) {
        filteredList.clear();

        for (Animals animal : animals)
		{
			if (tester.test(animal))
			{
				System.out.println(animal.getName() + " " + animal.getYearDiscovered()+ " " + animal.move()+ " " + animal.breate()+ " " + animal.reproduce());
				filteredList.add(animal);
			}
		}
	}

    private static void animals() {

        // Mammals
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("armadillo", 1758);
        Mammals raccoon = new Mammals("raccoon", 1758);
        Mammals bigfoot = new Mammals("bigfoot", 2021);

        // Fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("perch", 1758);

        // Birds
        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("peacock", 1821);
        Birds toucan = new Birds("toucan", 1758);
        Birds parrot = new Birds("parrot", 1824);
        Birds swan = new Birds("swan", 1758);

        // Arrays
        List<Animals> animals = new ArrayList<>();
        animals.add(panda);
        animals.add(zebra);
        animals.add(koala);
        animals.add(sloth);
        animals.add(armadillo);
        animals.add(raccoon);
        animals.add(bigfoot);

        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(parrot);
        animals.add(swan);

        animals.add(salmon);
        animals.add(catfish);
        animals.add(perch);

        // Lambda Expressions
        System.out.println("\nDescending\n");
        animals.sort((a1, a2) -> a1.getYearDiscovered() - a2.getYearDiscovered());
        animals.forEach(animal -> System.out.print(animal.getYearDiscovered() + "\n"));

        System.out.println("\n Alphabetically\n");
        animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animals.forEach(animal -> System.out.print(animal.getName() + "\n"));

        
        System.out.println("\nBy Movement\n");
        animals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        animals.forEach(animal -> System.out.print(animal.getName() + " " + animal.move() + "\n"));
                
        System.out.println("\nBreathes with Lungs\n");
        printAnimals(animals, animal -> animal.breate() == "lungs");

        System.out.println("\nBreathes with Lungs and named in 1758\n");
        printAnimals(animals, animal -> animal.breate() == "lungs" && animal.getYearDiscovered() == 1758);

        System.out.println("\nLays eggs and breathes with lungs\n");
        printAnimals(animals, animal -> animal.breate() == "lungs" && animal.reproduce() == "eggs");

        System.out.println("\nNamed in 1758 alphabetically\n");
        animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(animals, animal -> animal.getYearDiscovered() == 1758);

        // Stretch Goals
        System.out.println("\nMammals Alphabetically\n");
        animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(animals, animal -> animal.getClass() == bigfoot.getClass());

    }

    public static void main(String[] args) {
        animals();
    }
}