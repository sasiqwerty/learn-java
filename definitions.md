# 1. Definitions

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
