package lab3.task6;
import java.util.Objects;

public abstract class Animal implements Comparable<Animal>, Cloneable, Trainable {

    private String name;
    private int age;
    private boolean trained;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getSound();

    public void train() { trained = true; }
    public boolean isTrained() { return trained; }

    public int compareTo(Animal o) {
        return Integer.compare(this.age, o.age);
    }

    public Animal clone() {
        try { return (Animal) super.clone(); }
        catch (CloneNotSupportedException e) { throw new AssertionError(); }
    }
}