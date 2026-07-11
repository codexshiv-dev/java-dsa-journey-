# Number System

> **Category:** Programming Fundamentals
>
> **Chapter:** 1
>
> **Difficulty:** ⭐ Beginner
>
> **Prerequisites:** None
>
> **Programming Language:** Java
>
> **Interview Importance:** ⭐⭐⭐⭐⭐
>
> **Estimated Reading Time:** ~3 Hours
>
> **Status:** In Progress

---

# Table of Contents

1. Introduction
2. Learning Objectives
3. Why Every Programmer Should Learn Number Systems
4. What is a Number System?
5. Terminologies
6. Base (Radix)
7. Digits
8. Positional Value
9. Mathematical Representation
10. Real-Life Analogy
11. Decimal Number System (Introduction)

---

# 1. Introduction

Imagine a world where numbers did not exist.

Could we write programs?

Could computers store data?

Could we calculate salaries, distances, marks, bank balances, or memory addresses?

The answer is **No**.

Every program you write—from a simple calculator to Google Search or an AI model—is built on numbers.

A **Number System** is the language used to represent numbers.

Humans and computers both work with numbers, but they **use different number systems**.

Humans naturally use the **Decimal Number System (Base 10)**.

Computers internally understand only **Binary (Base 2)**.

Understanding number systems is the first step toward understanding how computers actually work.

---

# 2. Learning Objectives

After completing this chapter, you should be able to:

✅ Explain what a number system is.

✅ Differentiate between Decimal, Binary, Octal, and Hexadecimal.

✅ Understand positional values.

✅ Perform number system conversions.

✅ Understand integer division and modulus.

✅ Solve remainder-based programming problems.

✅ Understand where number systems are used inside programming.

---

# 3. Why Every Programmer Should Learn Number Systems

Many beginners ask:

> "Java already stores numbers. Why should I learn this?"

Because many important programming topics depend on it.

Number systems are used in:

- Binary Search
- Bit Manipulation
- Hashing
- Memory Management
- Computer Architecture
- Operating Systems
- Networking
- Cryptography
- Graphics Programming
- Machine Learning
- Artificial Intelligence
- Competitive Programming

Without understanding number systems, many advanced topics become difficult.

---

# Programming Connections

| Topic | Why Number Systems Matter |
|--------|---------------------------|
| Arrays | Index calculations |
| Binary Search | Mid calculation |
| Bit Manipulation | Binary representation |
| Memory | Address calculation |
| Hashing | Modulus operations |
| Networking | IP addresses |
| Operating System | Memory addresses |
| Database | Storage |
| Graphics | RGB Hex Colors |
| Cryptography | Binary operations |

---

# 4. What is a Number System?

## Definition

A **Number System** is a method of representing numbers using a fixed set of symbols (called digits) according to specific rules.

Simply speaking,

> A Number System is a language for writing numbers.

---

## Example

Humans write

```
582
```

Computers internally store

```
1001000110
```

Both represent numbers.

Only the representation is different.

---

## Real-Life Analogy

Imagine four different countries.

India

English

```
Twenty Five
```

France

```
Vingt-cinq
```

Japan

```
二十五
```

China

```
二十五
```

The language changes.

The meaning remains the same.

Similarly,

```
25₁₀
```

```
11001₂
```

```
31₈
```

```
19₁₆
```

All represent the same value.

Only the language (number system) changes.

---

# 5. Important Terminologies

Before learning number systems, understand these terms.

---

## Digit

A **digit** is the smallest symbol used to write numbers.

Examples

Decimal digits

```
0 1 2 3 4 5 6 7 8 9
```

Binary digits

```
0 1
```

Octal digits

```
0 1 2 3 4 5 6 7
```

Hexadecimal digits

```
0 1 2 3 4 5 6 7 8 9 A B C D E F
```

---

### Programming Connection

Every variable storing an integer is ultimately represented using binary digits (bits).

---

## Number

A number is a combination of one or more digits.

Examples

```
7

15

109

4827
```

---

## Base (Radix)

The **Base** tells us

> How many unique digits are available.

Examples

Decimal

Base = 10

Digits

```
0-9
```

Binary

Base = 2

Digits

```
0 1
```

Octal

Base = 8

Digits

```
0-7
```

Hexadecimal

Base = 16

Digits

```
0-9 A B C D E F
```

---

### Easy Trick

Base = Total number of symbols available.

---

### Interview Question

Why is Binary called Base 2?

Answer

Because only **2 unique digits (0 and 1)** are available.

---

# 6. Positional Value

One of the most important concepts.

Consider

```
352
```

Why does

```
352
```

not mean

```
235
```

Because every digit has a **position**.

Position determines value.

```
352

↓

3 × 100

5 × 10

2 × 1
```

So,

```
352

=

300

+

50

+

2
```

---

## Formula

```
Digit × Base^Position
```

---

### Example

```
583
```

```
=

5 × 10²

+

8 × 10¹

+

3 × 10⁰
```

```
=

500

+

80

+

3
```

```
=

583
```

---

### Programming Connection

Exactly the same positional concept is used while converting:

- Binary → Decimal
- Octal → Decimal
- Hexadecimal → Decimal

You will use this formula repeatedly.

---

# 7. Mathematical Representation

General Formula

```
Number

=

Digit × Base^Position
```

For Decimal

```
483

=

4 × 10²

+

8 × 10¹

+

3 × 10⁰
```

For Binary

```
1011

=

1 × 2³

+

0 × 2²

+

1 × 2¹

+

1 × 2⁰
```

This single formula works for every number system.

---

# 8. Memory Connection

Humans read

```
583
```

Java stores

```
00000000 00000000 00000010 01000111
```

(Binary representation)

The JVM converts everything into binary before storing it in memory.

You don't see it,

but every integer, character, floating-point number, and even object reference eventually becomes binary.

---

# 9. Common Mistakes

❌ Thinking Binary is only for Bit Manipulation.

Binary is used everywhere.

---

❌ Thinking Decimal is the default inside computers.

It is only the default for humans.

Computers use Binary.

---

❌ Memorizing conversions without understanding positional value.

Always understand **Digit × Base^Position** first.

---

# Summary

In this part you learned:

- What is a Number System
- Why Programmers Need It
- Digits
- Base (Radix)
- Positional Value
- Mathematical Formula
- Programming Connections
- Common Mistakes

---

# What's Next? (Part 2)

In Part 2 we will study:

- Decimal Number System (Complete)
- Binary Number System (Complete)
- Octal Number System
- Hexadecimal Number System
- Why Computers Use Binary
- Memory Representation
- Java Examples
- Practice Questions
---

# 10. Decimal Number System (Base 10)

## Definition

The Decimal Number System uses **10 unique digits (0–9)** to represent numbers.

## Base

```
10
```

## Digits

```
0 1 2 3 4 5 6 7 8 9
```

## Formula

```
Digit × 10^Position
```

## Example

```
572

= 5 × 10²
+ 7 × 10¹
+ 2 × 10⁰

= 500 + 70 + 2
= 572
```

## Properties

- Most commonly used by humans.
- Every position is a power of 10.
- Digits range from 0–9.

## Programming Connection

- User input is usually in decimal.
- Output displayed by Java is decimal.
- Before storing, JVM converts decimal values into binary.

## Java Example

```java
int num = 572;
System.out.println(num);
```

---

# 11. Binary Number System (Base 2)

## Definition

Binary uses only **two digits**.

```
0
1
```

Every electronic device stores data in binary.

## Base

```
2
```

## Digits

```
0
1
```

## Formula

```
Digit × 2^Position
```

## Example

```
1011₂

= 1 × 2³
+ 0 × 2²
+ 1 × 2¹
+ 1 × 2⁰

= 8 + 0 + 2 + 1

= 11₁₀
```

## Why Computers Use Binary

Electronic circuits have only two stable states.

```
ON
OFF
```

Represented as

```
1
0
```

This makes binary reliable and easy for hardware.

## Programming Connection

Binary is used in:

- Bit Manipulation
- Memory Storage
- CPU Instructions
- Boolean Logic
- Networking
- Encryption
- Compression

## Java Example

```java
int binary = 0b1011;

System.out.println(binary);
```

Output

```
11
```

## Important Points

- Every bit stores one binary digit.
- 8 bits = 1 Byte
- 1024 Bytes = 1 KB

---

# 12. Octal Number System (Base 8)

## Definition

Octal uses **8 digits**.

## Base

```
8
```

## Digits

```
0
1
2
3
4
5
6
7
```

## Formula

```
Digit × 8^Position
```

## Example

```
157₈

= 1×8²
+5×8¹
+7×8⁰

=64+40+7

=111₁₀
```

## Programming Connection

Earlier computer systems used octal because

```
3 Binary Bits = 1 Octal Digit
```

Still appears in:

- Linux permissions
- Embedded Systems

---

# 13. Hexadecimal Number System (Base 16)

## Definition

Hexadecimal uses **16 symbols**.

## Base

```
16
```

## Digits

```
0 1 2 3 4 5 6 7 8 9
A B C D E F
```

## Value Table

| Symbol | Value |
|---------|------:|
| A | 10 |
| B | 11 |
| C | 12 |
| D | 13 |
| E | 14 |
| F | 15 |

## Formula

```
Digit × 16^Position
```

## Example

```
2F₁₆

=2×16¹
+15×16⁰

=32+15

=47₁₀
```

## Programming Connection

Used in

- Memory Addresses
- Color Codes (#FFFFFF)
- Unicode
- Machine Code
- Debugging

## Java Example

```java
int hex = 0x2F;

System.out.println(hex);
```

Output

```
47
```

---

# 14. Comparison Table

| Number System | Base | Digits | Used In |
|--------------|------|---------|----------|
| Binary | 2 | 0–1 | Computers |
| Octal | 8 | 0–7 | Linux Permissions |
| Decimal | 10 | 0–9 | Human Calculations |
| Hexadecimal | 16 | 0–9, A–F | Memory, Colors |

---

# Quick Revision

✅ Decimal → Base 10

✅ Binary → Base 2

✅ Octal → Base 8

✅ Hexadecimal → Base 16

✅ Binary is the language of computers.

✅ Hexadecimal is a compact representation of binary.

---

# What's Next (Part 3)

- Decimal → Binary Conversion
- Binary → Decimal Conversion
- Decimal ↔ Octal
- Decimal ↔ Hexadecimal
- Binary ↔ Octal
- Binary ↔ Hexadecimal
- Shortcut Conversion Tricks
- Java Built-in Conversion Methods
---

# 15. Number System Conversion

## Why Learn Conversion?

Different systems represent the same value differently.

Example

| Decimal | Binary | Octal | Hexadecimal |
|---------:|-------:|------:|------------:|
| 10 | 1010 | 12 | A |
| 15 | 1111 | 17 | F |
| 25 | 11001 | 31 | 19 |

---

# 16. Decimal → Binary

## Algorithm

1. Divide the number by 2.
2. Store the remainder.
3. Continue until quotient becomes 0.
4. Read remainders from bottom to top.

## Example

Convert **13** to Binary.

| Division | Quotient | Remainder |
|----------|---------:|----------:|
| 13 ÷ 2 | 6 | 1 |
| 6 ÷ 2 | 3 | 0 |
| 3 ÷ 2 | 1 | 1 |
| 1 ÷ 2 | 0 | 1 |

Binary

```
1101₂
```

---

## Java Example

```java
int n = 13;

System.out.println(Integer.toBinaryString(n));
```

Output

```
1101
```

---

## Time Complexity

```
O(log₂ n)
```

Reason

Each division reduces the number by half.

---

# 17. Binary → Decimal

## Algorithm

Multiply every bit by

```
2^Position
```

Add all values.

---

## Example

```
1101₂
```

```
1 × 2³ = 8

1 × 2² = 4

0 × 2¹ = 0

1 × 2⁰ = 1
```

Answer

```
13
```

---

## Java Example

```java
String binary = "1101";

int decimal = Integer.parseInt(binary, 2);

System.out.println(decimal);
```

Output

```
13
```

---

# 18. Decimal → Octal

## Algorithm

Repeatedly divide by

```
8
```

Read remainders from bottom.

---

## Example

```
83
```

| Division | Quotient | Remainder |
|----------|---------:|----------:|
|83÷8|10|3|
|10÷8|1|2|
|1÷8|0|1|

Answer

```
123₈
```

---

## Java Example

```java
System.out.println(Integer.toOctalString(83));
```

Output

```
123
```

---

# 19. Octal → Decimal

## Formula

```
Digit × 8^Position
```

---

## Example

```
123₈
```

```
1×8²

+

2×8¹

+

3×8⁰

=

64+16+3

=

83
```

---

## Java Example

```java
String octal = "123";

int decimal = Integer.parseInt(octal,8);

System.out.println(decimal);
```

Output

```
83
```

---

# 20. Decimal → Hexadecimal

## Algorithm

Repeatedly divide by

```
16
```

Read remainder from bottom.

---

## Example

```
47
```

| Division | Quotient | Remainder |
|----------|---------:|----------:|
|47÷16|2|15(F)|
|2÷16|0|2|

Answer

```
2F₁₆
```

---

## Java Example

```java
System.out.println(Integer.toHexString(47));
```

Output

```
2f
```

---

# 21. Hexadecimal → Decimal

## Formula

```
Digit × 16^Position
```

---

## Example

```
2F₁₆
```

```
2×16¹

+

15×16⁰

=

32+15

=

47
```

---

## Java Example

```java
String hex = "2F";

int decimal = Integer.parseInt(hex,16);

System.out.println(decimal);
```

Output

```
47
```

---

# 22. Binary ↔ Octal Shortcut

## Rule

```
3 Binary Bits

=

1 Octal Digit
```

| Binary | Octal |
|---------|------:|
|000|0|
|001|1|
|010|2|
|011|3|
|100|4|
|101|5|
|110|6|
|111|7|

---

# 23. Binary ↔ Hexadecimal Shortcut

## Rule

```
4 Binary Bits

=

1 Hex Digit
```

| Binary | Hex |
|---------|----:|
|0000|0|
|0001|1|
|0010|2|
|0011|3|
|0100|4|
|0101|5|
|0110|6|
|0111|7|
|1000|8|
|1001|9|
|1010|A|
|1011|B|
|1100|C|
|1101|D|
|1110|E|
|1111|F|

---

# Java Utility Methods

| Method | Description |
|---------|-------------|
|Integer.toBinaryString(n)|Decimal → Binary|
|Integer.toOctalString(n)|Decimal → Octal|
|Integer.toHexString(n)|Decimal → Hex|
|Integer.parseInt(str,2)|Binary → Decimal|
|Integer.parseInt(str,8)|Octal → Decimal|
|Integer.parseInt(str,16)|Hex → Decimal|

---

# Programming Connection

Used In

### Java

- Integer conversions
- Debugging

### DSA

- Bit Manipulation
- Binary Search
- Number Theory

### Competitive Programming

- Base conversion problems
- Bitmasking

### Interviews

- Binary conversions
- Hexadecimal questions
- Parsing strings

---

# Common Mistakes

❌ Reading remainders from top to bottom.

❌ Forgetting that A–F represent 10–15.

❌ Using wrong radix in `Integer.parseInt()`.

❌ Forgetting positional values.

---

# Practice

1. Convert 25 to Binary.
2. Convert 11101₂ to Decimal.
3. Convert 125 to Octal.
4. Convert 2A₁₆ to Decimal.
5. Convert 255 to Hexadecimal.
6. Convert Binary → Octal using shortcut.
7. Convert Binary → Hex using shortcut.

---

# Revision Checklist

- [ ] Decimal → Binary
- [ ] Binary → Decimal
- [ ] Decimal → Octal
- [ ] Octal → Decimal
- [ ] Decimal → Hexadecimal
- [ ] Hexadecimal → Decimal
- [ ] Binary ↔ Octal Shortcut
- [ ] Binary ↔ Hexadecimal Shortcut
- [ ] Java Conversion Methods
---

# 24. Integer Division

## Definition

Integer division returns only the **integer (quotient)** part of the result and discards the fractional part.

## Formula

```
Quotient = Dividend / Divisor
```

For integers:

```
Fractional Part = Discarded
```

## Examples

| Expression | Result |
|-----------|--------|
|10 / 3|3|
|15 / 2|7|
|8 / 4|2|
|1 / 2|0|
|-10 / 3|-3 *(Java truncates toward zero)*|

## Programming Connection

Used in:

- Binary Search (`mid = (low + high) / 2`)
- Array Index Calculation
- Matrix Row/Column Calculation
- Pagination
- Grouping Elements
- Tree Parent Index

## Java Example

```java
System.out.println(10 / 3); // 3
System.out.println(7 / 2);  // 3
System.out.println(1 / 2);  // 0
```

## Important Points

- Integer / Integer → Integer
- Decimal part is removed.
- Not rounded.

## Common Mistakes

❌ Expecting

```java
5 / 2 = 2.5
```

Actual

```java
5 / 2 = 2
```

If decimal answer is required

```java
5.0 / 2
```

or

```java
(double)5 / 2
```

---

# 25. Floating Point Division

## Definition

If at least one operand is floating point, Java performs decimal division.

## Example

```java
System.out.println(5.0 / 2);
System.out.println((double)5 / 2);
```

Output

```
2.5
2.5
```

## Programming Connection

Used in

- Percentage
- Average
- Statistics
- Geometry
- Scientific Calculations

---

# 26. Modulus Operator (%)

## Definition

The modulus operator returns the **remainder** after division.

## Formula

```
Dividend % Divisor = Remainder
```

## Examples

| Expression | Result |
|-----------|--------|
|10 % 3|1|
|15 % 2|1|
|20 % 5|0|
|25 % 4|1|
|18 % 6|0|

## Visualization

```
10 ÷ 3

Quotient = 3

3 × 3 = 9

10 − 9 = 1

Remainder = 1
```

## Java Example

```java
System.out.println(10 % 3);
System.out.println(20 % 5);
```

Output

```
1
0
```

---

# 27. Relationship Between Division and Modulus

Formula

```
Dividend

=

Divisor × Quotient

+

Remainder
```

Example

```
17

=

5 × 3

+

2
```

Check

```
17 % 5 = 2
```

This formula is frequently used in mathematics and competitive programming.

---

# 28. Divisibility

## Definition

A number is divisible by another number if the remainder is zero.

Formula

```
a % b == 0
```

Examples

```
20 % 5 == 0

18 % 3 == 0

25 % 4 != 0
```

## Programming Connection

Used in

- Prime Number
- Factors
- Multiples
- GCD
- LCM
- Number Theory

---

# 29. Remainder Properties

## Property 1

```
a % b < b
```

Example

```
15 % 4 = 3

3 < 4
```

---

## Property 2

If

```
a % b == 0
```

Then

```
a is divisible by b
```

---

## Property 3

```
(a + b) % m

=

((a % m) + (b % m)) % m
```

Example

```
(15 + 18) % 7

=

33 % 7

=

5
```

---

## Property 4

```
(a × b) % m

=

((a % m) × (b % m)) % m
```

Very important for Competitive Programming.

---

## Property 5

```
(a - b) % m

=

((a % m) - (b % m) + m) % m
```

Used to avoid negative remainders.

---

# 30. Even and Odd Numbers

## Even Number

A number divisible by 2.

Formula

```java
n % 2 == 0
```

Examples

```
2

4

16

100
```

---

## Odd Number

A number not divisible by 2.

Formula

```java
n % 2 != 0
```

Examples

```
1

5

9

21
```

---

## Java Example

```java
if (n % 2 == 0)
    System.out.println("Even");
else
    System.out.println("Odd");
```

---

# 31. Positive, Negative and Zero

## Positive

```
n > 0
```

## Negative

```
n < 0
```

## Zero

```
n == 0
```

---

## Programming Connection

Used in

- Kadane's Algorithm
- Prefix Sum
- Binary Search
- Graph Algorithms
- Mathematical Problems

---

# 32. Common Programming Uses

| Concept | Used In |
|---------|---------|
|Integer Division|Binary Search, Index Calculation|
|Modulus|Hashing, Circular Array, Rotation|
|Even/Odd|Bit Manipulation, Arrays|
|Divisibility|Prime, Factors, GCD|
|Remainder|Competitive Programming|

---

# 33. Common Mistakes

❌ Confusing quotient with remainder.

❌ Using integer division when decimal answer is required.

❌ Forgetting `%` returns remainder.

❌ Ignoring negative numbers while using `%`.

❌ Using `== 1` for odd check in every language (prefer `n % 2 != 0`).

---

# 34. Interview Questions

### Easy

- Even or Odd
- Check Divisibility
- Reverse Number
- Palindrome Number

### Medium

- Happy Number
- Plus One
- Add Digits

### Advanced

- Modular Arithmetic
- Fast Exponentiation
- Hash Functions

---

# 35. Coding Practice

1. Check Even/Odd
2. Check Divisibility
3. Print Quotient & Remainder
4. Calculator using Division & Modulus
5. Reverse Integer
6. Palindrome Number
7. Sum of Digits
8. Count Digits
9. Armstrong Number
10. Rotate Array using Modulus

---

# Revision Checklist

- [ ] Integer Division
- [ ] Floating Point Division
- [ ] Modulus Operator
- [ ] Quotient-Remainder Formula
- [ ] Divisibility
- [ ] Remainder Properties
- [ ] Even/Odd
- [ ] Positive/Negative
- [ ] Programming Applications
- [ ] Java Examples

---

# 36. Data Size Units

Computers store all information in **Binary (0 and 1)**.

The smallest unit of storage is a **Bit**.

---

## Bit

### Definition

A **Bit (Binary Digit)** is the smallest unit of data.

Possible Values

```
0

1
```

Programming Connection

- Boolean Values
- Bit Manipulation
- Flags
- Permissions

---

## Nibble

### Definition

A Nibble consists of **4 Bits**.

```
4 Bits = 1 Nibble
```

Example

```
1010
```

Programming Connection

- Hexadecimal Representation

---

## Byte

### Definition

A Byte consists of **8 Bits**.

```
8 Bits = 1 Byte
```

Example

```
01000001
```

Programming Connection

- Character Storage
- File Storage
- Memory Allocation

---

## Storage Units

| Unit | Value |
|------|-------|
|1 Byte|8 Bits|
|1 KB|1024 Bytes|
|1 MB|1024 KB|
|1 GB|1024 MB|
|1 TB|1024 GB|
|1 PB|1024 TB|

---

# 37. Character Encoding

Characters are stored as numbers.

Example

```
'A'

↓

65 (ASCII)

↓

01000001 (Binary)
```

Java internally uses **Unicode (UTF-16)**.

Programming Connection

- String
- Character
- File Encoding

---

# 38. Java Number Literals

## Decimal

```java
int a = 25;
```

---

## Binary

```java
int b = 0b11001;
```

---

## Octal

```java
int c = 031;
```

---

## Hexadecimal

```java
int d = 0x19;
```

All represent

```
25
```

---

# 39. Frequently Used Java Methods

## Binary

```java
Integer.toBinaryString(n)
```

---

## Octal

```java
Integer.toOctalString(n)
```

---

## Hexadecimal

```java
Integer.toHexString(n)
```

---

## Binary → Decimal

```java
Integer.parseInt(str,2)
```

---

## Octal → Decimal

```java
Integer.parseInt(str,8)
```

---

## Hexadecimal → Decimal

```java
Integer.parseInt(str,16)
```

---

# 40. Programming Connections

## Arrays

- Index Calculation
- Rotation
- Circular Arrays

---

## Searching

- Binary Search
- Mid Calculation

---

## Sorting

- Bucket Sort
- Radix Sort

---

## Strings

- ASCII
- Unicode

---

## Bit Manipulation

- Binary Numbers
- Bitwise Operators
- Masks

---

## Mathematics

- Divisibility
- Modular Arithmetic
- Prime Numbers

---

## Hashing

- Hash Functions
- Hash Index
- Collision Handling

---

## Graphs

- Bitmask BFS
- State Compression

---

## Dynamic Programming

- Bitmask DP

---

## Operating System

- Memory Address
- Binary Storage
- Permissions

---

## Computer Networks

- IPv4
- IPv6
- Subnet Mask

---

## Databases

- Storage
- Encoding

---

# 41. Common Interview Questions

## Theory

- What is a Number System?

- Why do computers use Binary?

- Difference between Binary and Decimal?

- Difference between Bit and Byte?

- What is Radix?

- Why is Hexadecimal used?

- Explain Integer Division.

- Explain Modulus Operator.

---

## Coding

- Decimal to Binary

- Binary to Decimal

- Check Even/Odd

- Reverse Number

- Count Digits

- Sum of Digits

- Palindrome Number

- Armstrong Number

- Prime Number

- Happy Number

---

# 42. Common Mistakes

❌ Confusing Base with Number of Digits

❌ Reading conversion remainders in the wrong order

❌ Forgetting Integer Division removes decimal part

❌ Using wrong radix in parseInt()

❌ Assuming computers store Decimal

❌ Confusing Bit and Byte

---

# 43. Cheat Sheet

## Bases

| System | Base |
|--------|------|
|Binary|2|
|Octal|8|
|Decimal|10|
|Hexadecimal|16|

---

## Formula

```
Digit × Base^Position
```

---

## Even

```java
n % 2 == 0
```

---

## Odd

```java
n % 2 != 0
```

---

## Divisible

```java
n % d == 0
```

---

## Integer Division

```java
10 / 3 = 3
```

---

## Modulus

```java
10 % 3 = 1
```

---

## Binary

```
0 1
```

---

## Hex

```
0-9 A-F
```

---

## Java

```java
Integer.toBinaryString()

Integer.toOctalString()

Integer.toHexString()

Integer.parseInt(str, radix)
```

---

# 44. Glossary

| Term | Meaning |
|------|---------|
|Bit|Smallest unit of data|
|Byte|8 Bits|
|Nibble|4 Bits|
|Digit|Single symbol of a number system|
|Base (Radix)|Number of unique digits in a system|
|Dividend|Number being divided|
|Divisor|Number that divides|
|Quotient|Result of division|
|Remainder|Value left after division|

---

# 45. Practice Problems

## Beginner

- Decimal to Binary
- Binary to Decimal
- Even/Odd
- Positive/Negative
- Count Digits
- Reverse Number

---

## Intermediate

- Armstrong Number
- Palindrome Number
- Happy Number
- Plus One
- Add Digits

---

## Advanced

- Modular Arithmetic
- Gray Code
- Bit Manipulation Basics

---

# 46. Revision Checklist

- [ ] Number Systems
- [ ] Base
- [ ] Positional Value
- [ ] Decimal
- [ ] Binary
- [ ] Octal
- [ ] Hexadecimal
- [ ] Conversions
- [ ] Integer Division
- [ ] Floating Division
- [ ] Modulus
- [ ] Remainder Properties
- [ ] Even/Odd
- [ ] Positive/Negative
- [ ] Data Units
- [ ] Java Methods
- [ ] Programming Connections

---

# Key Takeaways

- Computers understand only Binary.
- Humans mainly use Decimal.
- Every number system follows positional notation.
- Integer division and modulus are fundamental to programming.
- Binary, Octal, and Hexadecimal are compact representations used by computers.
- Number systems form the foundation for Bit Manipulation, Memory Management, Hashing, Searching, and many DSA topics.

---