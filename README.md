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

## Loops
### For Loop
```java
for(initialisation; condition; updation) {
    // do something
}
```
- Example:
```java
public class ForLoop {
    public static void main(String[] args) {
        for (int counter = 0; counter < 100; counter ++) {
            System.out.println("hello World " + counter);
        }
    }
}
```

### While Loop
condition is true or false no matter atleast one time code runs
```java
while(condition) {
    // do something
}
```
- Example:
```java
public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i<10) {
            System.out.println(i);
            // i++;
            i = i + 1;
        }
    }
}
```

### Do-While Loop
```java
do{
    // do something
} while(condition)
```
- Example:
```java
public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i<11);

        // condition is true or false no matter atleast one time code runs
        int j = 10;
        do {
            System.out.println("Debojyoti");
            j++;
        } while (j>15);
    }
}

```

## Functions
### Structure:
```java
returnType functionName(type arg1, type arg2) {
    // oprations
}
```
### returnType can be `int`, `srring`, `array` or `void`.....
### `void` is a special return type it's means function returns nothing.-

### Example:
### `public` & `Static` both are keywords
```java
class FirstClass {
    public static void main(String args[]) {
        System.out.println("Hellow World");
    }
}
```
### Function vs Methods:
if we call a function by class object then this function is called method.

## Time Complexity and Space Complexity:
Relationship between Input size and Running Time (Operation).

## Arrays:

### Define a Array
```java
type[] arrayName = new type[size];

arr[0] = 1;
arr[1] = 2;
arr[2] = 3;

System.out.println(arr); // output: [I@15db9742
System.out.println(arr[0]); // output: 1
System.out.println(arr[1]); // output: 2
System.out.println(arr[2]); // output: 3

for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

### Define a Array in another way
```
int[] arr2 = {1,2,3,4,5,6,7,8,9};
for (int i = 0; i < arr2.length; i++) {
    System.out.println(arr2[i]);
}
```