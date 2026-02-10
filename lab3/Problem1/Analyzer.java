import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args) {
        Data data = new Data();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter number (Q to quit): ");
        while (true) {
            input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("Q")) {
                break;
            }
            try {
                double value = Double.parseDouble(input);
                data.add(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or Q.");
            }
            System.out.println("Enter number (Q to quit): ");
        }

        System.out.printf("Average = %.1f%n", data.getAverage());
        System.out.printf("Maximum = %.1f%n", data.getLargest());
        scanner.close();
    }
}