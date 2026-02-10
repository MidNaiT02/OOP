import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Course course = new Course("CE101", "Object-oriented Programming and Design", 3, "None");
        GradeBook gradeBook = new GradeBook(course);

        Student[] students = {
            new Student("A", 1), new Student("B", 4), new Student("C", 2),
            new Student("D", 3), new Student("E", 5), new Student("F", 6),
            new Student("G", 7), new Student("H", 8), new Student("I", 9),
            new Student("J", 10)
        };

        for (Student s : students) {
            gradeBook.addStudent(s);
        }

        gradeBook.displayMessage();
        System.out.println("Please, input grades for students:");

        Scanner sc = new Scanner(System.in);
        for (Student s : students) {
            System.out.print("Student " + s.getName() + ": ");
            s.setGrade(sc.nextInt());
        }

        gradeBook.displayGradeReport();
        sc.close();
    }
}