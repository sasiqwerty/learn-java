# learning JAVA

<!-- TOC -->

- [learning JAVA](#learning-java)
  - [The fundamentals of OOPS?](#the-fundamentals-of-oops)
  - [What is the Basic Structure of Writing a Program in JAVA?](#what-is-the-basic-structure-of-writing-a-program-in-java)
  - [What is a Package in java?](#what-is-a-package-in-java)
  - [The Import Statement](#the-import-statement)
  - [Class Declaration](#class-declaration)
  - [Main Method](#main-method)
  - [Method Body](#method-body)
  - [initialization](#initialization)
  - [public static void main in a java program](#public-static-void-main-in-a-java-program)
  - [Methods in Java](#methods-in-java)

<!-- /TOC -->

Java is a programming language and computing platform that was first released by Sun Microsystems in 1995. It is designed to be platform-independent, meaning that code written in Java can run on a variety of different computers and operating systems without modification. Java is used to develop a wide range of software, including mobile apps, desktop applications, and server-side systems. It is also commonly used for developing games and other interactive multimedia. Java is known for its "write once, run anywhere" philosophy.

## The fundamentals of OOPS?

OOPS stands for "Object-Oriented Programming System." It is a programming paradigm that is based on the concept of "objects," which can contain data and behavior. Objects interact with one another to accomplish a task.

The four main principles of OOPS are:

- **Encapsulation**: Hiding the implementation details of an object from the outside world.
- **Inheritance**: The ability for one class to inherit the properties and methods of another class.
- **Polymorphism**: The ability for objects of different types to be treated as objects of a common superclass type.
- **Abstraction**: A way of hiding the unnecessary details and showing only the essential features of an object.

Java is an example of an Object-oriented programming language and it supports OOPS concepts.

## What is the Basic Structure of Writing a Program in JAVA?

The basic structure of a Java program includes the following components:

- **Package Declaration**: The package statement is used to specify the package name for the class. It is an optional statement and it should be the first statement in the file.
- **Import Statements**: The import statement is used to import classes and interfaces from other packages. The import statement is also optional, and it should come after the package statement.
- **Class Declaration**: The class statement is used to declare a class. The class statement contains the class name, class variables, and class methods.
- **Main Method**: The main method is where the program starts executing. It is a required element in any Java program. It is a static method and it should have the following signature: public static void main(String[] args).
- **Method Body**: The body of the main method contains the statements that are executed when the program starts.

Here is an example of a simple Java program that prints "Hello, World!" to the console:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## What is a Package in java?

A package is a collection of related Java files stored in a directory or folder. Ideally, each package represents a logical grouping of functionality.

In Java, a package is a way to organize related classes and interfaces. A package is a collection of classes and interfaces that are grouped together based on their functionality. Packages provide a way to encapsulate classes and interfaces, which means that they can be hidden from the outside world and only exposed through a public interface. Packages also provide a way to prevent naming conflicts between classes and interfaces with the same name.

Java has two types of packages: built-in packages and user-defined packages. Built-in packages are packages that are included with the Java development kit (JDK) and are used for common tasks such as input/output (I/O), collections, and networking. User-defined packages are packages that are created by the programmer to organize their own classes and interfaces.

To create a package, you use the package keyword followed by the package name. It should be the first statement in the file and before import statement. For example:

```java
package com.example;
```

[packages from cornell university](https://courses.cs.cornell.edu/cs212/2008sp/Compiler/Java/packages.html#:~:text=A%20package%20is%20a%20collection,in%20a%20directory%20or%20folder)

To use a class or interface that is defined in a package, you use the import statement. For example, to use the class Scanner in the package java.util, you would use the following import statement:

```
import java.util.Scanner;
```

Creating and using packages can help organize your code and make it more maintainable, readable, and reusable.

## The Import Statement

The import statement in Java is used to make classes and interfaces from other packages available for use in a Java program. It allows you to access classes and interfaces from other packages without having to fully qualify their names.

For example, the `Scanner` class is part of the `java.util` package. To use the `Scanner` class in a program, you would need to use its fully qualified name, which is `java.util.Scanner`. However, if you use an import statement to import the `java.util` package, you can use the class name `Scanner` directly in your code.

Here is an example of using import statement in a program:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);
    }
}
```

In the example above, the import java.util.Scanner statement is used to import the Scanner class from the java.util package, so that it can be used directly in the program. Without this import statement, you would have to use the fully qualified name java.util.Scanner every time you use the class in your program.

You can also use the wildcard \* to import all the classes from a package. This is typically not recommended as it can lead to naming conflicts if multiple classes have the same name.

Import statements should be placed after package statement, if any and before the class declaration.

In Java, a class is a template or blueprint for creating objects (also called instances) that have their own state and behavior. A class declaration defines the structure of an object, including its variables (also called fields or properties) and methods (also called functions or actions).

## Class Declaration

A class declaration in a Java program typically consists of the following components:

- **The class keyword**: This keyword is used to indicate that a new class is being defined.
- **The class name**: This is the name of the class, which follows the class keyword.
- **The class body**: This is the set of curly braces {} that enclose the class definition. Inside the class body, you can define variables and methods that are specific to this class.

Here is an example of a simple class declaration:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

In this example, the class name is "Main" and the class body contains the main method. The main method is where the program starts executing and it should have the following signature: public static void main(String[] args).

A class can have any number of variables and methods. Variables are used to store the state of the object, while methods are used to define the behavior of the object. An object of a class can be created using the "new" keyword followed by the class name.

Java classes are the basis for Object-Oriented Programming and it is used to group related variables and methods together.

## Main Method

The main method in a Java program is the starting point of the program's execution. It is a required element in any Java program and it is where the program begins to execute. The main method is defined with the following signature:

```java
public static void main(String[] args)
```

The main method has the following components:

- **The public keyword**: This keyword makes the main method accessible to other classes and methods.
- **The static keyword**: This keyword means that the main method can be called without creating an instance of the class in which it is defined.
- **The void keyword**: This keyword indicates that the main method does not return any value.
- **The main method name**: This is the name of the method, which is always "main".
- **The parameter list**: The main method takes a single argument, which is an array of strings. This argument can be used to pass command-line arguments to the program.
- **The method body**: This is the set of curly braces {} that enclose the statements that are executed when the program starts.

Here is an example of a simple Java program that uses the main method to print "Hello, World!" to the console:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

In this example, the main method is defined in the class "Main" and it contains a single statement that prints the message "Hello, World!" to the console.

When the program is executed, the Java Virtual Machine (JVM) looks for the main method with the signature public static void main(String[] args) and starts executing the statements inside it.

## Method Body

The method body in a Java program contains the statements that are executed when the method is called. The method body is enclosed in curly braces {} and contains the logic for the method.

The statements inside a method body can include:

- **Variable declarations**: This is where local variables are defined and initialized. These variables are only accessible within the scope of the method.
- **Expressions and statements**: This includes mathematical operations, assignments, and function calls.
- **Conditional statements**: These are used to control the flow of the program based on certain conditions. Examples include if-else and switch statements.
- **Looping statements**: These are used to repeat a block of code multiple times. Examples include for, while, and do-while loops.
- **Return statement**: This statement is used to return a value or control to the calling method. The return type of the method should match the type of the value returned.
  Here is an example of a simple Java program that uses the main method with a body that performs a simple calculation and prints the result to the console:

```java
public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int result = x + y;
        System.out.println("The result is: " + result);
    }
}
```

In this example, the main method has a body that declares two integer variables x and y and assigns them values. It then performs a simple calculation by adding the two variables together, assigns the result to a variable, and finally prints the result to the console.

The method body can contain any number of statements that are executed sequentially and it can also call other methods or constructors as well. The method body can also be empty, in which case the method will not perform any action when it is called.

## initialization

In Java, initialization refers to the process of giving an initial value to a variable or an object. This can be done in several ways, depending on the type of variable or object being initialized.

Variable Initialization:

A variable can be initialized when it is declared by providing an initial value. For example:

```java
int x = 5;
```

A variable can also be initialized later in the code by assigning a value to it. For example:

```java
int x;
x = 5;
```

For primitive data types like int, float, double, char, boolean etc, they have default values when they are not initialized. For example, int has a default value of 0, boolean has a default value of false.
Object Initialization:

An object can be initialized when it is declared by using the "new" keyword to create a new instance of the class. For example:

```java
String name = new String("John Doe");
```

An object can also be initialized later in the code by creating a new instance of the class and assigning it to a variable.

```java
String name;
name = new String("John Doe");
```

Initialization is important because it ensures that variables and objects have a valid value before they are used. Without initialization, variables and objects would have an undefined or null value, which can cause errors or unexpected behavior in the program.

Java also has a concept called constructor which is used to initialize the state of an object when it is created. Constructors are special methods that are called automatically when an object is created and it can also be used to initialize the state of the object.

## public static void main in a java program

In Java, the public static void main(String[] args) is the entry point of a Java program, it is the method that is executed when the program is run.

Here is the breakdown of the components of the public static void main(String[] args) method:

- The public keyword: This keyword makes the main method accessible to other classes and methods.
- The static keyword: This keyword means that the main method can be called without creating an instance of the class in which it is defined. It is a class method, which can be called without creating an instance of the class.
- The void keyword: This keyword indicates that the main method does not return any value. The main method is a void method, which means it does not return any value.
- The main method name: This is the name of the method, which is always "main".
- The parameter list: The main method takes a single argument, which is an array of strings. This argument can be used to pass command-line arguments to the program.
- The method body: This is the set of curly braces {} that enclose the statements that are executed when the program starts.

The main method is the starting point of the program execution, where the JVM (Java Virtual Machine) starts executing the code. It's the first method that gets executed when the program starts. The JVM looks for this method and starts execution from this point. Any code written before or outside of this method will not be executed.

In summary, the public static void main(String[] args) method is a special method that is used as the entry point of a Java program, it is where the execution of the program begins, it is the first method that the JVM calls and it does not return any value.

## Methods in Java

In Java, a method is a block of code that performs a specific task and can be reused throughout a program. Methods are defined within a class and can be called by other parts of the program to perform their tasks. Methods can also return a value or a reference to an object, and they can also take parameters as inputs.

Here is an example of a simple method in Java that calculates the area of a rectangle:

```java
public class Rectangle {
    int width;
    int height;

    public int calculateArea() {
        return width * height;
    }
}
```

In this example, the calculateArea() method is defined within the Rectangle class and it does not take any parameters. The method uses the width and height fields of the class to calculate the area of the rectangle and it returns the result as an integer.

Java methods have the following components:

The method name: This is the name of the method, which should be a verb and describes the task that the method performs.

The parameter list: This is a list of variables that are passed to the method as input. The parameter list is enclosed in parentheses and is separated by commas.

The return type: This is the data type of the value that the method returns. The return type is specified before the method name.

The method body: This is the set of curly braces {} that enclose the statements that are executed when the method is called.

Java methods can also be overloaded, which means that multiple methods can have the same name but with different parameter lists. This allows for methods to have the same name but to perform different tasks depending on the input.

Java also has the concept of access modifiers like public, private, protected, default. They can be used to control the accessibility of a method from other parts of the program. Public methods are accessible from anywhere, private methods are only accessible within the same class and protected methods are accessible within the same package and inherited classes.
