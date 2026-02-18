import java.util.ArrayList;
import java.util.Scanner;

public class MainProblem2 {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Add a person");
            System.out.println("2. Show all persons");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");

            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 0) {
                System.out.println("Goodbye!");
                break;
            }

            if (choice == 1) {
                System.out.println("1 - Person");
                System.out.println("2 - Student");
                System.out.println("3 - Staff");
                System.out.print("Type: ");

                int type = Integer.parseInt(scanner.nextLine());

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Address: ");
                String address = scanner.nextLine();

                if (type == 1) {
                    people.add(new Person(name, address));
                } 
                else if (type == 2) {
                    System.out.print("Program: ");
                    String program = scanner.nextLine();

                    System.out.print("Year: ");
                    int year = Integer.parseInt(scanner.nextLine());

                    System.out.print("Fee: ");
                    double fee = Double.parseDouble(scanner.nextLine());

                    people.add(new Student(name, address, program, year, fee));
                } 
                else if (type == 3) {
                    System.out.print("School: ");
                    String school = scanner.nextLine();

                    System.out.print("Pay: ");
                    double pay = Double.parseDouble(scanner.nextLine());

                    people.add(new Staff(name, address, school, pay));
                }
            }

            if (choice == 2) {
                for (Person p : people) {
                    System.out.println(p);
                }
            }
        }

        scanner.close();
    }
}
