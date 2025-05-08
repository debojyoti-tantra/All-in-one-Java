import java.util.*;

public class Q_1 {
    public static int add(int x, int y) {
        int addition = x + y;
        return addition;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = sc.nextInt();
        System.out.print("Enter the second number: ");
        int y = sc.nextInt();
        int result = add(x, y);
        System.out.println("The sum of " + x + " and " + y + " is: " + result);
    }
}
