import java.util.Scanner;

public class Root{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a:");
        double a=sc.nextDouble();
        System.out.println("Enter b:");
        double b=sc.nextDouble();
        System.out.println("Enter c:");
        double c=sc.nextDouble();

        double D=b*b-4*a*c;
        if(D<0) System.out.println("Error");
        else
        {
            double sqrtD = Math.sqrt(D);
            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);

            System.out.println("Root 1: " + x1);
            System.out.println("Root 2: " + x2);
        }
    }
}