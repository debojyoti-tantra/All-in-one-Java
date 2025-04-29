import java.util.*;

class Conditionals {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
            
        }

        if (age % 2 == 0) {
            System.out.println("You age is even.");
        } else {
            System.out.println("You age is odd.");
        }

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Both numbers are equal.");
        } else if (a > b) {
            System.out.println("First number is greater.");
        } else {
            System.out.println("Second number is greater.");
            
        }
    }
}
