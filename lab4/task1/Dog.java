public class Dog extends Animal {

    private String breed;

    public Dog(String breed) {
        super();
        this.breed = breed;
        System.out.println("Dog no-arg super constructor used");
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        System.out.println("Dog parameterized super constructor used");
    }

    @Override
    public String makeSound() {
        return "Woof! Woof!";
    }

    @Override
    public String makeSound(int volume) {
        String parentVersion = super.makeSound(volume);
        return parentVersion + " ... but actually: " + makeSound() + "!!!";
    }

    @Override
    public String toString() {
        return "Dog [breed=" + breed + "] → " + super.toString();
    }
}
