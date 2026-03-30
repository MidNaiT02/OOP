public class PetTest {

    public static void main(String[] args) {

        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Computer Science", "AI");

        Animal cat = new Cat("Murka", 5);
        Animal dog = new Dog("Rex", 3);

        john.assignPet(cat);

        PersonRegistry registry = new PersonRegistry();

        registry.addPerson(john);
        registry.addPerson(alice);

        System.out.println("Initial state:");
        registry.printPeople();

        System.out.println("\nJohn leaves pet with Alice:");
        john.leavePetWith(alice);

        registry.printPeople();

        System.out.println("\nJohn retrieves pet:");
        john.retrievePetFrom(alice);

        registry.printPeople();

        System.out.println("\nTrying to give dog to PhD student:");
        alice.assignPet(dog);
    }
}