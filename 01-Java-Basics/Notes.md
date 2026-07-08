# Java Basics Notes

---

# 1. What is Java?

Java is a high-level, object-oriented, platform-independent programming language developed by Sun Microsystems (now Oracle).

Features:

- Simple
- Secure
- Robust
- Object-Oriented
- Platform Independent
- Multithreaded
- Portable
- High Performance

---

# 2. Java Program Structure

Every Java program generally contains:

- Package
- Class
- main() Method
- Statements

Example:

```java
package basics;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");

    }

}
```

---

# 3. Package

A package is used to organize related Java classes.

Example:

package basics;

---

# 4. Class

A class is a blueprint for creating objects.

Example:

public class HelloWorld

---

# 5. main() Method

Program execution always starts from:

public static void main(String[] args)

---

# 6. System.out.println()

Used to print output.

Example:

System.out.println("Hello");

---

# 7. print() vs println()

print()

Prints on same line.

println()

Prints and moves cursor to next line.

---

# 8. Comments

Single Line

//

Multi Line

/* */

Documentation

/** */

---

# 9. Variables

Definition:

A variable is a named memory location used to store data.

Syntax:

datatype variableName = value;

Example:

int age = 20;

Rules:

- Variable names are case-sensitive.
- Cannot start with a number.
- Cannot contain spaces.
- Cannot use Java keywords.
- Use meaningful names.
- Follow camelCase.
- 
### Valid Identifiers
- age
- studentName
- rollNumber
- _marks
- $salary
- number123
- MAX_VALUE
- Employee
- calculateSum
 ### Invalid Identifiers
 - 123age            // Starts with a number
 - student name      // Contains a space
 - my-name           // Hyphen is not allowed
 - class             // Java keyword
 - int               // Java keyword
 - @value           // '@' is not allowed
 - first.name       // '.' is not allowed

---

# 10. Data Types

Primitive

byte
short
int
long
float
double
char
boolean

Non Primitive

String
Array
Class
Interface
Object

---

# 11. Identifiers

Identifiers are names given to:

- Variables
- Methods
- Classes
- Packages

Examples:

studentName

calculateSum

Employee

basics
### Identifier Rules

- ✅ Can contain letters (A-Z, a-z)
- ✅ Can contain digits (0-9) after the first character
- ✅ Can contain _ and $
- ❌ Cannot start with a digit
- ❌ Cannot contain spaces
- ❌ Cannot use Java keywords
- ✅ Java is case-sensitive (age and Age are different identifiers)

---

# 12. Keywords

Reserved words that have predefined meanings.

Examples:

class

public

static

void

if

else

return

new

switch
