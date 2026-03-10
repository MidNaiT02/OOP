import java.util.Scanner;

public class ShapeTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cylinder input
        System.out.print("Enter cylinder radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter cylinder height: ");
        double h = sc.nextDouble();

        Shape3D cylinder = new Cylinder(r, h);

        // Sphere input
        System.out.print("Enter sphere radius: ");
        double sr = sc.nextDouble();

        Shape3D sphere = new Sphere(sr);

        // Cube input
        System.out.print("Enter cube side: ");
        double side = sc.nextDouble();

        Shape3D cube = new Cube(side);

        System.out.println("\n--- Shape Results ---");

        System.out.println(cylinder);
        System.out.printf("Volume: %.2f%n", cylinder.volume());
        System.out.printf("Surface Area: %.2f%n%n", cylinder.surfaceArea());

        System.out.println(sphere);
        System.out.printf("Volume: %.2f%n", sphere.volume());
        System.out.printf("Surface Area: %.2f%n%n", sphere.surfaceArea());

        System.out.println(cube);
        System.out.printf("Volume: %.2f%n", cube.volume());
        System.out.printf("Surface Area: %.2f%n", cube.surfaceArea());

        sc.close();
    }
}