import java.util.Stack;
import java.util.Scanner;

public class DragonLaunch {

    private Stack<Person> kidnapped = new Stack<>();

    public void kidnap(Person p) {
        kidnapped.push(p);
    }

    public boolean willDragonEatOrNot() {

        Stack<Person> stack = new Stack<>();

        while (!kidnapped.isEmpty()) {
            Person current = kidnapped.pop();

            if (!stack.isEmpty()
                    && stack.peek().isBoy()
                    && current.isGirl()) {

                // boy + girl escape
                stack.pop();
            } else {
                stack.push(current);
            }
        }

        // if nobody left → dragon does NOT eat
        return !stack.isEmpty();
    }

    // ✅ MAIN WITH INPUT
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DragonLaunch dragon = new DragonLaunch();

        System.out.print("Enter people sequence (B/G): ");
        String people = input.nextLine();

        for (char c : people.toCharArray()) {
            if (c == 'B') {
                dragon.kidnap(new Person(Gender.BOY));
            } else if (c == 'G') {
                dragon.kidnap(new Person(Gender.GIRL));
            }
        }

        if (dragon.willDragonEatOrNot()) {
            System.out.println("The dragon eats!");
        } else {
            System.out.println("No one is eaten!");
        }

        input.close();
    }
}
