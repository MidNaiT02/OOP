public class Cylinder extends Shape3D {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {

        if(radius <= 0 || height <= 0){
            throw new IllegalArgumentException("Values must be positive");
        }

        this.radius = radius;
        this.height = height;
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public String toString() {
        return "Cylinder [radius=" + radius + ", height=" + height + "]";
    }
}