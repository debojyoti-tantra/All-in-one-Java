import java.util.*;

class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object

        // Read user input and store it in a variable called name
        // String name = sc.next(); // after the first space no words are read
        String name = sc.nextLine(); // reads the whole line
        // Print the value of name
        System.out.println(name);

        int age = sc.nextInt(); // Read an integer from the user
        // Print the value of age
        System.out.println(age);

        Float height = sc.nextFloat(); // Read a float from the user
        // Print the value of height
        System.out.println(height);

        // some other methods
        // sc.next(); // reads the next token
        // sc.nextLine(); // reads the next line
        // sc.nextInt(); // reads the next integer
        // sc.nextFloat(); // reads the next float
        // sc.nextDouble(); // reads the next double
        // sc.nextBoolean(); // reads the next boolean
        // sc.nextByte(); // reads the next byte
        // sc.nextShort(); // reads the next short
        // sc.nextLong(); // reads the next long
        // sc.nextBigInteger(); // reads the next BigInteger
        // sc.nextBigDecimal(); // reads the next BigDecimal
        // sc.next(); // reads the next token
    }
}
