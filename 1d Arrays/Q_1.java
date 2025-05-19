// Take an array as input from the user. Search for a given number x and print the index at which it occurs. --> Linear Search
import java.util.*;

class Q_1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};

      System.out.print("Enter the number to search: ");
      int x = sc.nextInt();

      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] == x) {
            System.out.println("x found at index: " + i);
         }
      }

   }
}