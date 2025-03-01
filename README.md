Java-fundamental

What is Java?
Java is a high-level, object-oriented programming language developed by Sun Microsystems (now owned by Oracle). It is known for:
✅ Platform Independence: "Write Once, Run Anywhere" (WORA) with JVM.
✅ Object-Oriented Approach: Uses classes, objects, inheritance, and encapsulation.
✅ Automatic Memory Management: Built-in garbage collection.
✅ Security & Robustness: Eliminates error-prone features like explicit pointers.

History & Evolution
1991: Created by Sun Microsystems (initially called "Oak").
1995: Public launch with Java 1.0.
2009: Acquired by Oracle.
Major Versions:
🔹 Java 5 - Introduced generics, annotations, enhanced for-loop.
🔹 Java 8 - Lambda expressions, Stream API, new Date/Time API.
🔹 Java 9+ - Modular system (Project Jigsaw), new release cadence.
🔹 2024: Latest version – Java 22 (March 19, 2024).
Key Features of Java
✔ Simple & Easy to Learn – No explicit pointers, automatic memory management.
✔ Object-Oriented – Supports modular design with reusable code.
✔ Platform-Independent – Runs on any device with a JVM.
✔ Secure & Robust – Bytecode verification, strong error handling.
✔ Multithreaded – Supports concurrent programming.
✔ High Performance – JIT (Just-In-Time) compiler optimizes execution.
✔ Portable & Distributed – Ideal for web and enterprise applications.

Understanding JDK, JRE, and JVM
1. JDK (Java Development Kit) – For Developers
Includes:
✅ Compiler (javac) – Converts Java code to bytecode.
✅ Debugger (jdb) – Helps find and fix bugs.
✅ JAR Tool – Packages multiple files into a single archive.

2. JVM (Java Virtual Machine) – For Execution
💡 Converts bytecode into machine code.
🔹 Class Loader – Loads and verifies class files.
🔹 JIT Compiler – Boosts performance.
🔹 Garbage Collector – Manages memory automatically.

3. JRE (Java Runtime Environment) – For Running Apps
✅ Contains JVM and core libraries.
✅ Does not include compiler/debugging tools.

How Java Works
1️⃣ Write Code – Create .java files.
2️⃣ Compile – Convert to .class files (bytecode).
3️⃣ Class Loading – JVM loads bytecode into memory.
4️⃣ Execution – JIT compiles bytecode into native code.
5️⃣ Memory Management – Garbage collector frees unused memory.

HelloWorld Program
The HelloWorld program demonstrates the structure of a basic Java application.

Main Method (public static void main(String[] args)):

The entry point of any Java program.
public: An access modifier that allows the method to be accessible from
anywhere.
static: A keyword indicating that the method belongs to the class, not
instances of the class.
void: The return type of the method, indicating that it does not return any value.
main: The name of the method. It is the entry point of any Java program.
String[] args: The parameter for the main method. It is an array of strings
that stores command-line arguments.
JVM calls this method to start execution.
Output Statement (System.out.println()):
System: A predefined class that provides access to the system.
out: A static member of the System class, representing the standard output
stream (usually the console).
println: A method of the PrintStream class that prints a line of text to the
console.
"Hello, World!": The string to be printed.

Data Types in Java
Java supports primitive and non-primitive (reference) data types:

Primitive Types (store single values): byte, short, int, long, float, double, char, boolean.
Non-Primitive Types (store references to objects): Classes, Objects, Arrays, Interfaces, Enums, and Strings.

Access Modifiers in Java
Control the visibility of classes, methods, and variables:
public → Accessible everywhere.
protected → Accessible within the same package and subclasses.
default (no modifier) → Accessible only within the same package.
private → Accessible only within the same class.

Object-Oriented Programming (OOP) Concepts
Java follows OOP principles for efficient programming:

Class → Blueprint for creating objects.
Object → Instance of a class.
Methods → Define behaviors inside a class.
Java Naming Conventions
Class Names → Start with uppercase (Car, Person).
Variable Names → Use lowercase; separate words with _ if needed (car_model).
Method Names → Use camelCase (startEngine(), printDetails()).
Package Names → Use all lowercase (com.example.app).
Example: Car Class Implementation
A simple class Car demonstrating attributes and methods.

Attributes: Model, Year, Color
Methods: startEngine(), stopEngine()


Understanding static in Java
The static keyword in Java is used for memory management and applies to variables, methods, blocks, and nested classes. It signifies that the associated member belongs to the class itself rather than any specific instance.

Key Concepts
1. Static Variables
Shared across all instances of a class (single copy in memory).
Accessed directly via the class name.
2. Static Methods
Can be called without creating an instance of the class.
Cannot access non-static (instance) members directly.
3. Static Blocks
Executed once when the class is loaded.
Used for initializing static variables or configurations.
4. Static Classes
Only nested classes can be static.
They do not require an instance of the outer class.
5. Static Import
Allows direct use of static members without class qualification.
Important Considerations
Static methods cannot be overridden, but they can be hidden.
Cannot use this or super inside static methods, as they belong to the class, not an instance.
Memory Allocation: Static members are stored in the method area and persist as long as the class is loaded.
Common Use Cases
Utility classes (e.g., Math functions).
Shared constants (public static final).
Singleton pattern implementations.
Tracking shared data (e.g., counting object instances).
