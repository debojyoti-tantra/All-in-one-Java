import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int button = sc.nextInt();

        // with if-else statement
        if (button == 1) {
            System.out.println("You pressed 1.");
        } else if (button == 2) {
            System.out.println("You pressed 2.");
        } else if (button == 3) {
            System.out.println("You pressed 3.");
        } else if (button == 4) {
            System.out.println("You pressed 4.");
        } else {
            System.out.println("Invalid button.");
        }

        // with switch statement
        switch (button) {
            case 1 : System.out.println("You pressed 1.");
                break;
            case 2 : System.out.println("You pressed 2.");
                break;
            case 3 : System.out.println("You pressed 3.");
                break;
            case 4 : System.out.println("You pressed 4.");
                break;
            default : System.out.println("Invalid button.");
        }
    }
}
