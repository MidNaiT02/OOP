public class Student {
    private String name;
    private int id;
    private int grade;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.grade = 0;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public char getLetterGrade() {
        if (grade >= 90) return 'A';
        if (grade >= 80) return 'B';
        if (grade >= 70) return 'C';
        if (grade >= 60) return 'D';
        return 'F';
    }

    public String toString() {
        return "Student " + name + " (id: " + id + ")";
    }
}