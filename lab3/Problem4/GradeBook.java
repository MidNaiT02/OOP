import java.util.ArrayList;

public class GradeBook {
    private Course course;
    private ArrayList<Student> students;

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>(); // ✅ FIX
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course);
    }

    public void displayGradeReport() {
        System.out.println("Class average is " + String.format("%.2f", calculateAverage()));
        System.out.println("Lowest grade is " + findLowestGrade());
        System.out.println("Highest grade is " + findHighestGrade());
        printGradeDistribution();
    }

    private double calculateAverage() {
        if (students.isEmpty()) return 0.0;
        double sum = 0;
        for (Student s : students) sum += s.getGrade();
        return sum / students.size();
    }

    private String findLowestGrade() {
        Student lowest = students.get(0);
        for (Student s : students) {
            if (s.getGrade() < lowest.getGrade()) lowest = s;
        }
        return lowest.getGrade() + " (" + lowest + ")";
    }

    private String findHighestGrade() {
        Student highest = students.get(0);
        for (Student s : students) {
            if (s.getGrade() > highest.getGrade()) highest = s;
        }
        return highest.getGrade() + " (" + highest + ")";
    }

    private void printGradeDistribution() {
        int[] buckets = new int[11];
        for (Student s : students) {
            int g = s.getGrade();
            int index = (g == 100) ? 10 : g / 10;
            buckets[index]++;
        }

        System.out.println("Grades distribution:");
        for (int i = 0; i <= 10; i++) {
            String range = (i == 10) ? "100"
                    : String.format("%02d-%02d", i * 10, i * 10 + 9);
            System.out.print(range + ": ");
            for (int j = 0; j < buckets[i]; j++) System.out.print("*");
            System.out.println();
        }
    }
}
