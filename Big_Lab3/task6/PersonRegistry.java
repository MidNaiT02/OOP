import java.util.ArrayList;

public class PersonRegistry {

    private ArrayList<Person> people = new ArrayList<>();

    public void addPerson(Person p) {
        people.add(p);
    }

    public void removePerson(Person p) {
        people.remove(p);
    }

    public void printPeople() {

        for (Person p : people) {
            System.out.println(p);
        }
    }

    public void printPeopleWithPets() {

        for (Person p : people) {
            if (p.hasPet())
                System.out.println(p);
        }
    }

    public void printPeopleWithoutPets() {

        for (Person p : people) {
            if (!p.hasPet())
                System.out.println(p);
        }
    }
}