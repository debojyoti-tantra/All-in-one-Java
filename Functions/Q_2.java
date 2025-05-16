// multiplication of two numbers
import java.util.*;

class Q_2 {
  public static int multiply(int a, int b) {
    int m = a*b;
    return m;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int a = sc.nextInt();
    System.out.print("Enter the second number: ");
    int b = sc.nextInt();
    int result = multiply(a, b);
    System.out.println("The multiplication of " + a + " and " + b + " is: " + result);
  } 
}