import java.util.*;

class Arr2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.print("Enter the element " + (i + 1) + ": ");
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
  }
}