import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private int year;

    public Student(String name, int id,int year) {
        this.name = name;
        this.id = id;
        this.year = 1;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void incrementYear() {
        year++;
    }

    public void displayDetails() {
		System.out.println("Name - " + name);
		System.out.println("ID - " + id);
		System.out.println("Year of Study - " + year);
	}

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter your name: ");
        String first_name=sc.nextLine();
        System.out.println("Enter your id: ");
        int stud_id=sc.nextInt();
        System.out.println("Enter your year: ");
        int stud_year=sc.nextInt();
        System.out.println("\n");

        Student stud = new Student(first_name,stud_id,stud_year);
		
		stud.displayDetails();
		stud.incrementYear();
        System.out.println("\n");
		stud.displayDetails();		
	}
}