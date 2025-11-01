/**
 * The Java Nexus Protocol - example file
 * -------------------------------------
 * This file contains a very small Java program that adds two integers and
 * prints the result. The goal of the extensive comments below is to help a
 * complete beginner read this code and understand not only what each line
 * does, but also why it is written that way and how Java works in general.
 *
 * Top-level beginner notes (quick reference):
 * - Java source files typically end with `.java` and are compiled to `.class`
 *   files by the Java compiler (`javac`). The compiled classes are run by
 *   the Java Virtual Machine (JVM) with the `java` command.
 * - A Java program's execution begins at the `main` method with the exact
 *   signature `public static void main(String[] args)`.
 * - Java is case-sensitive. `Sum`, `sum`, and `SUM` are different identifiers.
 * - Naming convention: class names normally use PascalCase (e.g., `Sum`). This
 *   example keeps the original lowercase `sum` for minimal edits, but consider
 *   renaming to `Sum` in real projects for readability.
 * - Primitive data types include: `byte`, `short`, `int`, `long`, `float`,
 *   `double`, `char`, and `boolean`.
 * - Java has a set of reserved keywords (e.g., `class`, `public`, `static`,
 *   `if`, `else`, `for`, `while`, `return`). These cannot be used as variable
 *   names.
 *
 * If you're new to Java, read the inline comments below slowly. They explain
 * both the immediate line-level effect and the surrounding Java concepts.
 *
 * Problem Statement: Write a program to add two numbers and display the result
 *
 * Author: BROCCOLI 31nov friday2025 time before push:- 11:49pm unpur.home
 * Version: 1.0
 */

/*
 * Explanation of the next line:
 * - `public` is an access modifier. It means this class is visible to code
 *   outside the package. For a simple program, making the class public is
 *   common so the JVM can access it.
 * - `class` is a keyword that introduces a new class (a blueprint for objects
 *   and a container for code in Java).
 * - `sum` is the name of the class. By convention class names start with an
 *   uppercase letter (e.g., Sum), but Java lets you use lowercase names too.
 */
public class sum {

    /*
     * The `main` method is the entry point of any standalone Java application.
     * When you run `java sum` the JVM looks for this exact method signature:
     * `public static void main(String[] args)` and begins execution there.
     *
     * Breakdown of the signature:
     * - `public`: JVM (and any other code) can call this method from outside
     *   the class.
     * - `static`: Means the method belongs to the class itself, not to an
     *   instance/object of the class. The JVM calls this without creating an
     *   object first.
     * - `void`: The method does not return a value.
     * - `main`: The method name the JVM expects as the program entry point.
     * - `String[] args`: An array of command-line arguments passed as strings.
     */
    public static void main(String[] args) {

        // Declaring two numbers that we want to add
        // `int` is a primitive type that stores a 32-bit signed integer value.
        // The pattern is: <type> <variableName> = <initialValue>;
        // Variable names must start with a letter, underscore, or dollar sign,
        // and cannot be Java keywords. They are case-sensitive.
        int number1 = 10; // assign the integer value 10 to the variable number1
        int number2 = 20; // assign the integer value 20 to the variable number2

        // Calculating the sum
        // Here we create a new variable named `sum` and store the result of
        // the arithmetic expression `number1 + number2` inside it.
        // Java evaluates `number1 + number2` (simple addition) and assigns
        // the resulting integer to the variable on the left.
        int sum = number1 + number2;

        // Printing the result
        // `System.out.println` is a method provided by the Java standard
        // library that prints text to the console followed by a newline.
        // The operator `+` between a string and a number performs string
        // concatenation: the number is converted to a string and appended.
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
        System.out.println("Sum of the numbers: " + sum);

        /*
         * Extra notes for a beginner:
         * - Statements in Java end with a semicolon `;`.
         * - White-space (spaces, tabs, newlines) is mostly not significant but
         *   helps readability. Java uses braces `{}` to define blocks of code.
         * - Comments: use `//` for single-line comments and `/* ... * /` for
         *   multi-line comments. Javadoc comments start with `/**` and are used
         *   to generate API documentation.
         * - Java is strongly typed: the variable type is declared and enforced.
         */
    }
}
