# Definitions

## Pointers

In computer programming, a pointer is a variable that stores a memory address. Pointers allow a program to dynamically manipulate memory, and are used in many types of data structures such as linked lists and trees. A pointer can be dereferenced to access the memory location it points to, and can also be used to change the value stored at that location. Pointers are used in a wide variety of programming languages, including C, C++, and C#.

## Garbage Collection

In computer programming, garbage collection is a memory management technique that automatically frees memory that is no longer being used by a program. The goal of garbage collection is to reclaim memory that is no longer needed, so that it can be used for other purposes. Garbage collection is often implemented as a background process that runs periodically, and is typically triggered when the system's memory usage reaches a certain threshold.

There are different types of garbage collection algorithms, such as reference counting, mark-and-sweep, and generational garbage collection. Some languages like Java, C#, Python, Ruby etc use garbage collection to automatically manage memory. While other languages like C, C++ do not have built-in garbage collection, but they have libraries which can be used to implement garbage collection manually.

## Unions

In computer programming, a union is a data type that allows a programmer to store different types of data in the same memory location. A union variable can hold different values of different types, but at any given time, the value stored in a union must be of the type specified in the union definition.

A union is defined like a struct, but with the keyword "union" instead of "struct". The syntax for defining a union is similar to that of a struct, but all the members share the same memory location, which means that the size of a union is equal to the size of its largest member.

Unions are typically used to save memory space or to manipulate data in a more efficient way. They can also be used to interpret the same memory as different types. For example, a union can be used to convert an integer value to a floating-point value or vice versa, by storing the integer value in one member and the floating-point value in another member of the union.

Unions are supported by many programming languages, including C, C++, C#, and Java.

## Templates

In computer programming, templates are a feature of C++ that allow the programmer to write generic code that can work with multiple types of data. Templates are used to create generic functions or classes that can work with any data type, without the need for explicit type casting. This allows for code reusability and flexibility.

A template function or class is defined with the keyword "template" followed by a template parameter, which is a placeholder for the actual type that will be used when the template is instantiated. The template parameter is often denoted with a single letter such as T, U, or V, and is used throughout the template definition to represent the actual type.

For example, a template function to swap two variables could be defined like this:

```c
template <typename T>
void swap(T &a, T &b) {
  T temp = a;
  a = b;
  b = temp;
}
```

This function can be used to swap any type of variable such as int, float, string, custom structs etc.

```c
int x = 10, y = 20;
swap(x, y); // x will be 20, y will be 10
string a = "hello", b = "world";
swap(a, b); // a will be "world", b will be "hello"

```

Templates also can be used to define classes, where the type is used as a parameter for the class, for example:

```c
template <typename T>
class MyArray {
  T *data;
  int size;
  // ...
};

```

This class can be used to store any type of data in an array, for example:

```
MyArray<int> intArray;
MyArray<string> stringArray;
```

Templates are widely used in C++ for generic programming, which allows creating more flexible and reusable code.

## Structures

In computer programming, a structure (also known as a struct) is a composite data type that can be used to group together several variables of different types into a single unit. A struct is defined using the "struct" keyword, followed by the name of the struct and a block of code that defines its members. The members of a struct can be any type of variable, such as integers, floats, strings, or other structs.

For example, the following code defines a struct called "Person" that has three members: a string called "name", an integer called "age", and a float called "height":

```
struct Person {
  string name;
  int age;
  float height;
};
```

A variable of type "Person" can be defined and used like this:

```
Person john;
john.name = "John Smith";
john.age = 30;
john.height = 1.75;
```

Structures can also have constructors, destructors, and member functions, like a class. Structs can be passed as a function parameter or returned from a function, and can also be used as members of other structs or classes.

Structs are supported by many programming languages, including C, C++, C#, and Java. In C++, structs are similar to classes, but by default, members of a struct are public, while members of a class are private.

## Generic Programming

Generic programming is a programming paradigm that allows programmers to write code that can work with multiple types of data, without the need for explicit type casting. Generic programming is often achieved using templates in C++ or generics in other programming languages like Java, C#, and others.

The idea behind generic programming is to write code that is type-agnostic, meaning that it can work with any data type that meets a certain set of requirements. This allows for code reusability, as a single piece of code can be used in multiple situations, with different types of data.

A common example of generic programming is a function or class that can be used to sort an array of any type of data. Instead of writing a separate sorting function for integers, another for strings, and another for custom structs, a single generic sorting function can be written that can sort an array of any type as long as it has a proper comparison operator.

Generic programming also allows for creating more flexible and extensible code. It enables the programmer to write code that can work with different types of data without having to change the code itself, which makes it less prone to bugs, and it makes the code more readable and maintainable.

In C++, template functions and classes are used to implement generic programming, while in Java, C#, and other languages, generics are used.

## Type Casting in Coding

In computer programming, type casting is the process of converting a value from one data type to another. This can be done explicitly or implicitly. Explicit type casting is done by the programmer and is used to force the compiler to treat a value as a specific data type. Implicit type casting is done automatically by the compiler and is used to convert a value from one data type to another when the value is used in an expression or assignment.

There are several ways to perform type casting in different languages.

In C and C++, explicit type casting can be done using a type cast operator, such as (int) or (float), before the value to be cast. For example:

```
float x = 3.14;
int y = (int)x; // y will be 3
```

In C++, one can also use the static_cast, dynamic_cast, const_cast and reinterpret_cast for explicit type casting.

In Java, explicit type casting can be done using the "cast operator" (or type-casting operator), such as (int) or (float), before the value to be cast. For example:

```
float x = 3.14;
int y = (int)x; // y will be 3
```

It's important to note that when casting to a smaller data type, there is a risk of losing precision or getting unexpected results. Also, when casting from a derived class to a base class, the dynamic_cast should be used in C++ to ensure that the cast is safe.

It's also worth noting that type casting can be avoided by using polymorphism, templates, and generics, which are often more efficient and less error-prone than explicit type casting.

## Procedure

- a **procedure** is a subroutine that is executed purely for its side effects (like printing something to the screen) and returns no values.
- A **function** is a subroutine that always returns the same value given the same inputs and has no side effects.
- A **method** is a procedure or function that is associated with a class or object.

The confusing part is when people use these terms, they're not always referring to the pure definitions. For the sake of convenience and consistency, programming languages don't always make a distinction between functions, procedures, and methods. They have one or two ways to declare a subroutine, and whether it's technically a function, procedure, or method depends on how the programmer is using it.

In Java, for example, a procedure is created by having a void return type on a method. A function is a method with a return type and no side effects, like:

```java
int add(int x, int y) {
    return x + y;
}
```

People whose only programming experience is in a language like Java often don't even realize there's a difference, because in Java it usually doesn't matter in a practical sense. In a java-only context, programmers often refer to any subroutine as a function, even by those who know the difference, and they mostly go uncorrected except by the very pedantic.
