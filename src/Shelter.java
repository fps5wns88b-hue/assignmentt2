import java.util.ArrayList;

public class Shelter {
    private ArrayList<Pet> pets;

    public Shelter() {
        pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
        System.out.println(pet.getName() + " added to shelter.");
    }

    public void showAllPets() {
        for (Pet p : pets) {
            System.out.println(p);
        }
    }

    public void showAvailablePets() {
        for (Pet p : pets) {
            if (!p.isAdopted()) System.out.println(p);
        }
    }

    public Pet findPet(String name) {
        for (Pet p : pets) {
            if (p.getName().equalsIgnoreCase(name)) return p;
        }
        return null;
    }
}
