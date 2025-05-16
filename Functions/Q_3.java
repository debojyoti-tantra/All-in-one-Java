// calculate the factorial of a number
import java.util.*;

 class Q_3 {
  public static void factorial(int n){
    int fact = 1;
    if (n<0) {
      System.out.println("Invalid number");
    } else {
      for(int i = n; i > 1; i--){
        fact = fact * i;
      }
      System.out.println("The factorial of " + n + " is: " + fact);
    }
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    factorial(n);
  } 
}