package lab3.task4;
import java.util.*;
import lab3.task6.Person;

public class Employee extends Person implements Comparable<Employee> {

    private double salary;
    private Date hireDate;

    public Employee(String name, int age, double salary, Date hireDate) {
        super(name, age);
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public double getSalary() { return salary; }
    public Date getHireDate() { return hireDate; }

    public String getOccupation() { return "Employee"; }

    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }
}