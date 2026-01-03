public class Adopter {
    private String name;
    private String contact;

    public Adopter(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public void adoptPet(Pet pet) {
        if (!pet.isAdopted()) {
            pet.adopt();
            System.out.println(name + " adopted " + pet.getName() + "!");
        } else {
            System.out.println(pet.getName() + " is already adopted.");
        }
    }
}
