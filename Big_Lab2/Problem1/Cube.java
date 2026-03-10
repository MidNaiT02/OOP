public class Cube extends Shape3D {

    private double side;

    public Cube(double side) {

        if(side <= 0){
            throw new IllegalArgumentException("Side must be positive");
        }

        this.side = side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }

    @Override
    public String toString() {
        return "Cube [side=" + side + "]";
    }
}