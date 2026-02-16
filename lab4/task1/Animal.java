public class Animal {
    protected String name;
    protected int age;

    public Animal() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Animal default constructor called");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal parameterized constructor called: " + name);
    }

    public String makeSound() {
        return "Some generic animal sound";
    }

    public String makeSound(int volume) {
        return "Loud generic sound (volume " + volume + ")";
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", age=" + age + "]";
    }
}
