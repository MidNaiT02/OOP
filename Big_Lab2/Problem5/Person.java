import java.util.Objects;

public abstract class Person {

    protected String name;
    protected int age;
    protected Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet) {
        this.pet = pet;
    }

    public void removePet() {
        pet = null;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void leavePetWith(Person other) {

        if (pet == null) {
            System.out.println(name + " has no pet to leave.");
            return;
        }

        other.assignPet(pet);
        pet = null;
    }

    public void retrievePetFrom(Person other) {

        if (other.pet == null) {
            System.out.println(other.name + " has no pet.");
            return;
        }

        pet = other.pet;
        other.pet = null;
    }

    public abstract String getOccupation();

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person p = (Person) o;

        return age == p.age && name.equals(p.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {

        if (pet != null)
            return name + " (" + getOccupation() + ") owns " + pet;
        else
            return name + " (" + getOccupation() + ") has no pet";
    }
}