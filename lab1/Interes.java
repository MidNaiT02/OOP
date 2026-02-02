import java.util.Scanner;

public class Interes{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a start value");
        double balance=sc.nextDouble();
        System.out.println("Enter an interest");
        double interest_percentage=sc.nextDouble();
        double interest=interest_percentage/100;

        double interest_value=balance*interest;
        double new_value=interest_value+balance;
        System.out.println("New value="+new_value);
    }
}