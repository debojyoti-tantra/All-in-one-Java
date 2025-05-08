import java.util.*;

class Main {
    public static void printMyName(String name) {
        System.out.println("My name is " + name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        printMyName(name);
    }
}