public class MainTask1 {
    public static void main(String[] args) {

        System.out.println("=== Creating objects ===\n");

        Dog dog1 = new Dog("Husky");
        System.out.println(dog1);
        System.out.println(dog1.makeSound());
        System.out.println(dog1.makeSound(10));

        System.out.println("\n-------------------\n");

        Dog dog2 = new Dog("Max", 4, "German Shepherd");
        System.out.println(dog2);
        System.out.println(dog2.makeSound());
        System.out.println(dog2.makeSound(7));

        System.out.println("\n-------------------\n");

        Animal generic = new Animal("Generic", 6);
        System.out.println(generic);
        System.out.println(generic.makeSound(5));
    }
}
