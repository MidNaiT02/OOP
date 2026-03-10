public class Sphere extends Shape3D {

    private double radius;

    public Sphere(double radius) {

        if(radius <= 0){
            throw new IllegalArgumentException("Radius must be positive");
        }

        this.radius = radius;
    }

    @Override
    public double volume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius,3);
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Sphere [radius=" + radius + "]";
    }
}