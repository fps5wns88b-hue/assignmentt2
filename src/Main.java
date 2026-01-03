import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Shelter shelter = new Shelter();
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("\n--- PET ADOPTION SYSTEM ---");
      System.out.println("1. Add pet");
      System.out.println("2. Show all pets");
      System.out.println("3. Show available pets");
      System.out.println("4. Adopt a pet");
      System.out.println("0. Exit");
      System.out.print("Choose: ");
      int choice = sc.nextInt();
      sc.nextLine();

      if (choice == 1) {
        System.out.print("Dog or Cat? ");
        String type = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        if (type.equalsIgnoreCase("dog")) shelter.addPet(new Dog(name, age));
        else if (type.equalsIgnoreCase("cat")) shelter.addPet(new Cat(name, age));
        else System.out.println("Unknown pet type!");

      } else if (choice == 2) {
        shelter.showAllPets();

      } else if (choice == 3) {
        shelter.showAvailablePets();

      } else if (choice == 4) {
        System.out.print("Your name: ");
        String adopterName = sc.nextLine();
        System.out.print("Contact: ");
        String contact = sc.nextLine();
        System.out.print("Pet name to adopt: ");
        String petName = sc.nextLine();

        Pet pet = shelter.findPet(petName);
        if (pet == null) System.out.println("Pet not found.");
        else {
          Adopter adopter = new Adopter(adopterName, contact);
          adopter.adoptPet(pet);
        }

      } else if (choice == 0) {
        System.out.println("Goodbye!");
        break;

      } else {
        System.out.println("Invalid choice.");
      }
    }

    sc.close();
  }
}
