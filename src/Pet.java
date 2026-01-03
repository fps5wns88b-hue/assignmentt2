public abstract class Pet {
    private String name;
    private int age;
    private boolean adopted;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
        this.adopted = false;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isAdopted() { return adopted; }
    public void adopt() { adopted = true; }

    public abstract String getType();

    public String toString() {
        return getType() + " - " + name + ", " + age + " years, Adopted: " + adopted;
    }
}

