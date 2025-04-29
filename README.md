# Java

## syntax

```java
class FirstClass {
    public static void main(String args[]) {
        System.out.println("Hellow World");
    }
}
```

## output statement
```java
System.out.println("Hello, World!");
System.out.print("Hello, World!");
```

### se *println* for other code goes in next line but if we only use *print* then all codes output are in same line

## Data Types:
### Java is a typed language
1. Primitive Datatype
2. Non-primitive Datatype

| **Data Type**         | **Description**                                                                 |
|------------------------|---------------------------------------------------------------------------------|
| **Primitive Datatype** | **Non-primitive Datatype** |
| `bite`, `short`, `char`, `double`, `long`, `int`, `float`, `boolean` | `String`, `Array`, `Class`, `Object`, `Interface` |

## Take any input form system
```java
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

```

## Conditionals
### if-else statement

```java
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

```

### Switch Statement
```java
import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int button = sc.nextInt();

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

```