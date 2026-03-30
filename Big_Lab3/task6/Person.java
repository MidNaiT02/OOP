package lab3.task6;

public abstract class Person implements Ownable, Comparable<Person>, Cloneable {

    protected String name;
    protected int age;
    protected Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet) { this.pet = pet; }
    public void removePet() { pet = null; }
    public boolean hasPet() { return pet != null; }

    public abstract String getOccupation();

    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}