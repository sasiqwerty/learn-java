# learning JAVA

## what is java?
Java is a programming language and computing platform that was first released by Sun Microsystems in 1995. It is designed to be platform-independent, meaning that code written in Java can run on a variety of different computers and operating systems without modification. Java is used to develop a wide range of software, including mobile apps, desktop applications, and server-side systems. It is also commonly used for developing games and other interactive multimedia. Java is known for its "write once, run anywhere" philosophy.

## should i learn the fundamentals of OOPS?

OOPS stands for "Object-Oriented Programming System." It is a programming paradigm that is based on the concept of "objects," which can contain data and behavior. Objects interact with one another to accomplish a task.

The four main principles of OOPS are:

- **Encapsulation**: Hiding the implementation details of an object from the outside world.
- **Inheritance**: The ability for one class to inherit the properties and methods of another class.
- **Polymorphism**: The ability for objects of different types to be treated as objects of a common superclass type.
- **Abstraction**: A way of hiding the unnecessary details and showing only the essential features of an object.

Java is an example of an Object-oriented programming language and it supports OOPS concepts.

## what is the basic structure of writing a program in JAVA?

The basic structure of a Java program includes the following components:

Package Declaration: The package statement is used to specify the package name for the class. It is an optional statement and it should be the first statement in the file.

Import Statements: The import statement is used to import classes and interfaces from other packages. The import statement is also optional, and it should come after the package statement.

Class Declaration: The class statement is used to declare a class. The class statement contains the class name, class variables, and class methods.

Main Method: The main method is where the program starts executing. It is a required element in any Java program. It is a static method and it should have the following signature: public static void main(String[] args).

Method Body: The body of the main method contains the statements that are executed when the program starts.

Here is an example of a simple Java program that prints "Hello, World!" to the console:
``` java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
## what is a package in java?

In Java, a package is a way to organize related classes and interfaces. A package is a collection of classes and interfaces that are grouped together based on their functionality. Packages provide a way to encapsulate classes and interfaces, which means that they can be hidden from the outside world and only exposed through a public interface. Packages also provide a way to prevent naming conflicts between classes and interfaces with the same name.

Java has two types of packages: built-in packages and user-defined packages. Built-in packages are packages that are included with the Java development kit (JDK) and are used for common tasks such as input/output (I/O), collections, and networking. User-defined packages are packages that are created by the programmer to organize their own classes and interfaces.

To create a package, you use the package keyword followed by the package name. It should be the first statement in the file and before import statement. For example:
```java
package com.example;
```
To use a class or interface that is defined in a package, you use the import statement. For example, to use the class Scanner in the package java.util, you would use the following import statement:
```
import java.util.Scanner;
```

Creating and using packages can help organize your code and make it more maintainable, readable, and reusable.