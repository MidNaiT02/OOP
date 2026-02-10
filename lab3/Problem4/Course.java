public class Course {
    private String code;
    private String name;
    private int credits;
    private String prerequisites;

    public Course(String code, String name, int credits, String prerequisites) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    public String toString() {
        return code + " " + name;
    }
}