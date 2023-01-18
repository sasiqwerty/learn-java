# Getting Your Feet Wet

This chapter covers the fundamental building blocks and terms of the Java language. Although it could be considered yet another introductory chapter, it is quite important. The previous chapter left you with a complete development environment configured for writing Java code. It is time to make use of it. The following topics are covered in this chapter:

- Core syntax parts
- Using JShell
- Java fundamental building blocks: packages, modules, and classes
- Creating a Java project with IntelliJ IDEA
- Compiling and executing of Java code
- Packing a Java application into an executable jar
- Using Maven

## Core Syntax Parts

```java
package com.apress.ch.one.hw;
import java.util.List;
public class Example01 {
 public static void main(String[] args) {
 List<String> items = List.of("1", "a", "2", "a", "3", "a");items.forEach(item -> {
 if (item.equals("a")) {
 System.out.println("A");
 } else {
 System.out.println("Not A");
 }
 });
 }
}
```

One of the most important building blocks of Java code is the class. Classes
are pieces of code that model real-world objects and events. Classes contain two
types of members: those modelling states, which are the class variables, also
named fields or properties, and those modelling behaviors, named methods.

TODO FINISH this notes
