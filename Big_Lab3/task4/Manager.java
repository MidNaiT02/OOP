package lab3.task4;
import java.util.*;

public class Manager extends Employee {

    private Vector<Employee> team = new Vector<>();
    private double bonus;

    public Manager(String name, int age, double salary, Date hireDate, double bonus) {
        super(name, age, salary, hireDate);
        this.bonus = bonus;
    }

    public int compareTo(Employee other) {
        int res = super.compareTo(other);
        if (res == 0 && other instanceof Manager)
            return Double.compare(this.bonus, ((Manager) other).bonus);
        return res;
    }
}