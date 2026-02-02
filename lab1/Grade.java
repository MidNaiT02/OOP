import java.util.Scanner;

public class Grade{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your grade: ");
        double gd=sc.nextDouble();

        if(gd>=94.5) System.out.println("A");
        else if(gd>89.5) System.out.println("A-");
        else if(gd>84.5) System.out.println("B+");
        else if(gd>79.5) System.out.println("B");
        else if(gd>74.5) System.out.println("B-");
        else if(gd>69.5) System.out.println("C");
        else if(gd>64.5) System.out.println("C");
        else if(gd>59.5) System.out.println("C-");
        else if(gd>54.5) System.out.println("D+");
        else if(gd>49.5) System.out.println("D");
        else if(gd>29.5) System.out.println("F");
        else System.out.println("FX");
    }
}