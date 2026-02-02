import java.util.Scanner;

public class Areacalc{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter value of a");
        double a=sc.nextDouble();

        double S=a*a;
        double P=a*4;
        double d=Math.sqrt(2)*a;

        System.out.println("Area: "+S);
        System.out.println("Perimeter: "+P);
        System.out.println("Diagonal: "+d);
    }
}