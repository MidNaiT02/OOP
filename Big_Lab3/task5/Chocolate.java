package lab3.task5;
public class Chocolate implements Comparable<Chocolate> {
    private String name;
    private double weight;

    public Chocolate(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public int compareTo(Chocolate o) {
        return Double.compare(this.weight, o.weight);
    }
}