# Mathematics for Programming

> **Category:** Programming Fundamentals
>
> **Chapter:** 2
>
> **Difficulty:** ⭐ Beginner → Intermediate
>
> **Prerequisites:** Number System
>
> **Programming Language:** Java
>
> **Interview Importance:** ⭐⭐⭐⭐⭐

---

# Table of Contents

1. Introduction
2. Why Mathematics is Important
3. Mathematical Thinking
4. Common Mathematical Symbols
5. Order of Learning
6. Programming Connections

---

# 1. Introduction

Mathematics is one of the foundations of Computer Science.

Many programming problems can be solved using simple mathematical observations instead of complex algorithms.

A programmer who understands mathematics can often reduce:

- Time Complexity
- Space Complexity
- Number of Operations

---

# Why Learn Mathematics?

Mathematics helps in

- Building logical thinking
- Finding patterns
- Optimizing algorithms
- Solving interview questions
- Competitive Programming
- Machine Learning
- Graphics Programming
- Cryptography

---

# Programming Connections

| Topic | Mathematics Used |
|--------|------------------|
| Arrays | Prefix Sum, Index Calculation |
| Searching | Binary Search |
| Sorting | Counting, Bucket Size |
| Strings | Hashing |
| Graphs | Geometry, Distance |
| Dynamic Programming | Counting |
| Bit Manipulation | Binary Mathematics |
| Number Theory | Prime, GCD, LCM |
| AI/ML | Linear Algebra, Probability |

---

# 2. Mathematical Thinking

Before writing code, ask yourself

✅ Can this be solved using a formula?

✅ Is there a repeating pattern?

✅ Can calculations be reused?

✅ Can unnecessary loops be removed?

✅ Can recursion be replaced by mathematics?

---

# Example

Instead of

```java
int sum = 0;

for(int i=1;i<=100;i++)
    sum += i;
```

Use

```
n × (n+1) / 2
```

```
100 × 101 / 2

=

5050
```

Time Complexity

Loop

```
O(n)
```

Formula

```
O(1)
```

Observation

Mathematics can eliminate loops.

---

# 3. Common Mathematical Symbols

| Symbol | Meaning |
|---------|---------|
| + | Addition |
| - | Subtraction |
| × | Multiplication |
| ÷ | Division |
| % | Modulus |
| = | Equal |
| ≠ | Not Equal |
| > | Greater Than |
| < | Less Than |
| ≥ | Greater Than or Equal |
| ≤ | Less Than or Equal |
| √ | Square Root |
| ∛ | Cube Root |
| ^ | Power |
| ! | Factorial |
| Σ | Summation |
| π | Pi |
| ∞ | Infinity |

---

# 4. Mathematics Learning Roadmap

Study in this order

```
Basic Arithmetic

↓

Factors & Multiples

↓

Prime Numbers

↓

GCD & LCM

↓

Exponent

↓

Square Root

↓

Logarithm

↓

Factorial

↓

Permutation

↓

Combination

↓

Modular Arithmetic

↓

Geometry

↓

Probability
```

---

# 5. Programming Rules

Always remember

- Avoid floating-point calculations unless required.
- Prefer integer arithmetic when possible.
- Watch for integer overflow.
- Learn common mathematical formulas.
- Think before coding.

---

# Interview Tip

Most interviewers are not testing mathematics.

They are testing

> Can you identify a mathematical pattern that simplifies the problem?

---

# Revision Checklist

- [ ] Why mathematics is important
- [ ] Programming connections
- [ ] Mathematical thinking
- [ ] Common symbols
- [ ] Learning roadmap
- [ ] Programming rules

---

# Next Part

Part 2

- Arithmetic Operations
- Factors
- Multiples
- Divisibility Rules
- Prime Numbers
- Composite Numbers
---

# 6. Basic Arithmetic Operations 🟢 Foundation

Arithmetic operations are the building blocks of mathematics and programming.

| Operator | Name | Example | Result |
|----------|------|---------|-------:|
| + | Addition | 10 + 5 | 15 |
| - | Subtraction | 10 - 5 | 5 |
| * | Multiplication | 10 * 5 | 50 |
| / | Division | 10 / 5 | 2 |
| % | Modulus | 10 % 3 | 1 |

## Programming Connection

Used in

- Arrays
- Loops
- Binary Search
- Sorting
- Dynamic Programming
- Graph Algorithms

## Java Example

```java
int a = 10;
int b = 3;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

---

# 7. Factors 🟢 Foundation

## Definition

A **factor** of a number is a number that divides it exactly without leaving a remainder.

## Formula

```
n % i == 0
```

Then

```
i is a factor of n
```

## Example

Factors of 12

```
1
2
3
4
6
12
```

## Properties

- Every number has at least one factor.
- 1 is a factor of every positive integer.
- Every number is a factor of itself.
- Factors always occur in pairs.
- Factors are always less than or equal to the number.

Example

```
36

↓

1 × 36

2 × 18

3 × 12

4 × 9

6 × 6
```

## Optimized Logic

Instead of checking

```
1 → n
```

Check only till

```
√n
```

Reason

Factors occur in pairs.

## Time Complexity

Brute Force

```
O(n)
```

Optimized

```
O(√n)
```

## Java Example

```java
for(int i = 1; i * i <= n; i++){

    if(n % i == 0){

        System.out.println(i);

        if(i != n / i)
            System.out.println(n / i);

    }

}
```

## Programming Connection

Used in

- Prime Number
- Perfect Number
- GCD
- LCM
- Number Theory

---

# 8. Multiples 🟢 Foundation

## Definition

A multiple of a number is obtained by multiplying it with an integer.

## Formula

```
Multiple = n × k
```

where

```
k = 1,2,3...
```

## Example

Multiples of 7

```
7

14

21

28

35
```

## Properties

- Infinite multiples
- Every number is a multiple of itself.
- Zero is a multiple of every number.

## Programming Connection

Used in

- LCM
- Scheduling Problems
- Cycle Detection

---

# 9. Divisibility 🟢 Foundation

## Definition

A number is divisible by another number if the remainder is zero.

## Formula

```java
n % d == 0
```

## Example

```
20 % 5 == 0

18 % 6 == 0

15 % 4 != 0
```

## Programming Connection

Used in

- Prime Checking
- Factors
- Multiples
- GCD
- LCM

---

# 10. Divisibility Rules 🟢 Foundation

| Number | Rule |
|---------|------|
|2|Last digit is even|
|3|Sum of digits divisible by 3|
|4|Last two digits divisible by 4|
|5|Ends with 0 or 5|
|6|Divisible by both 2 and 3|
|8|Last three digits divisible by 8|
|9|Sum of digits divisible by 9|
|10|Ends with 0|

## Programming Connection

Useful for

- Number Theory
- Competitive Programming
- Fast Validation

---

# 11. Prime Numbers 🟢 Foundation

## Definition

A prime number has exactly **two distinct positive factors**:

- 1
- Itself

## Examples

```
2

3

5

7

11

13

17
```

## Non-Examples

```
1

4

6

8

9

10
```

## Why is 1 NOT Prime?

Because it has only one factor.

Prime numbers must have exactly two distinct factors.

## Smallest Prime Number

```
2
```

## Properties

- 2 is the only even prime number.
- Every prime greater than 2 is odd.
- Prime numbers have only two factors.

## Optimized Logic

Check divisibility only till

```
√n
```

## Time Complexity

Brute Force

```
O(n)
```

Optimized

```
O(√n)
```

## Java Example

```java
boolean prime = true;

if(n <= 1)
    prime = false;

for(int i = 2; i * i <= n; i++){

    if(n % i == 0){

        prime = false;
        break;

    }

}
```

## Programming Connection

Used in

- Cryptography
- Hashing
- Number Theory
- Competitive Programming

---

# 12. Composite Numbers 🟢 Foundation

## Definition

A composite number has **more than two factors**.

## Examples

```
4

6

8

9

10

12
```

## Properties

- Every composite number has at least one divisor other than 1 and itself.
- Every composite number can be written as a product of prime numbers.

Example

```
60

=

2² × 3 × 5
```

## Programming Connection

Used in

- Prime Factorization
- Number Theory
- Mathematics

---

# Common Mistakes

❌ Considering 1 as prime.

❌ Checking factors till n instead of √n.

❌ Forgetting that 2 is prime.

❌ Ignoring factor pairs.

---

# Interview Questions

- Print Factors
- Count Factors
- Check Prime
- Print Prime Numbers
- Count Prime Numbers
- Sieve of Eratosthenes (Advanced)

---

# Practice Problems

Easy

- Find Factors
- Count Factors
- Print Multiples
- Check Divisibility
- Check Prime

Medium

- Count Primes
- Closest Prime
- Prime Factorization

---

# Revision Checklist

- [ ] Arithmetic Operators
- [ ] Factors
- [ ] Multiples
- [ ] Divisibility
- [ ] Divisibility Rules
- [ ] Prime Numbers
- [ ] Composite Numbers

---

# Next Part

- GCD
- LCM
- Euclidean Algorithm
- Prime Factorization
- Coprime Numbers

---

# 13. Greatest Common Divisor (GCD) / Highest Common Factor (HCF) 🟢 Foundation

## Definition

The **Greatest Common Divisor (GCD)** or **Highest Common Factor (HCF)** is the largest positive integer that divides two or more numbers exactly.

## Formula

```
GCD(a, b) = Largest common factor of a and b
```

## Example

```
12 = 1, 2, 3, 4, 6, 12

18 = 1, 2, 3, 6, 9, 18

Common Factors

1
2
3
6

GCD = 6
```

---

## Properties

- GCD(a, a) = a
- GCD(a, 1) = 1
- GCD(a, 0) = a
- GCD(a, b) = GCD(b, a)

---

## Brute Force Approach

Check every number from

```
1 → min(a, b)
```

Time Complexity

```
O(min(a, b))
```

---

## Optimal Approach (Euclidean Algorithm)

Formula

```
GCD(a, b)

=

GCD(b, a % b)
```

Repeat until

```
b = 0
```

Then

```
a = GCD
```

---

## Dry Run

Find

```
GCD(48,18)
```

```
48 % 18 = 12

18 % 12 = 6

12 % 6 = 0

Answer = 6
```

---

## Java Example

```java
static int gcd(int a, int b){

    while(b != 0){

        int temp = b;
        b = a % b;
        a = temp;

    }

    return a;

}
```

---

## Time Complexity

```
O(log(min(a,b)))
```

---

## Programming Connection

Used in

- Fraction Simplification
- LCM
- Number Theory
- Cryptography
- Competitive Programming

---

# 14. Least Common Multiple (LCM) 🟢 Foundation

## Definition

The **Least Common Multiple** is the smallest positive number divisible by both numbers.

---

## Example

```
4

Multiples

4 8 12 16 20 ...

6

Multiples

6 12 18 24 ...

LCM = 12
```

---

## Formula

```
LCM(a,b)

=

(a × b)

/

GCD(a,b)
```

---

## Java Example

```java
int lcm = (a * b) / gcd(a, b);
```

---

## Time Complexity

Depends upon GCD

```
O(log n)
```

---

## Programming Connection

Used in

- Scheduling
- Cycle Problems
- Repeating Events
- Mathematics

---

# 15. Euclidean Algorithm 🟢 Foundation

## Definition

The fastest algorithm to compute GCD.

---

## Logic

Instead of checking all factors,

use

```
GCD(a,b)

=

GCD(b,a%b)
```

until

```
b = 0
```

---

## Why It Works

The common divisor of

```
a

and

b
```

is also the common divisor of

```
b

and

a%b
```

---

## Time Complexity

```
O(log n)
```

One of the fastest mathematical algorithms.

---

# 16. Coprime Numbers 🟡 Intermediate

## Definition

Two numbers are **coprime** if their GCD is 1.

---

## Examples

```
8

15

GCD = 1

Coprime
```

```
9

21

GCD = 3

Not Coprime
```

---

## Important Point

Coprime numbers do **not** need to be prime.

Example

```
8

15
```

Both are composite,

still coprime.

---

## Programming Connection

Used in

- Modular Arithmetic
- Euler Totient
- Cryptography

---

# 17. Prime Factorization 🟡 Intermediate

## Definition

Expressing a number as a product of prime numbers.

---

## Example

```
60

=

2 × 2 × 3 × 5

=

2² × 3 × 5
```

---

## Algorithm

Start from

```
2
```

Keep dividing until

```
n % i != 0
```

Move to next divisor.

---

## Time Complexity

```
O(√n)
```

---

## Java Example

```java
for(int i = 2; i * i <= n; i++){

    while(n % i == 0){

        System.out.print(i + " ");

        n /= i;

    }

}

if(n > 1)

    System.out.print(n);
```

---

## Programming Connection

Used in

- GCD
- LCM
- Divisor Problems
- Number Theory
- Competitive Programming

---

# 18. Relationship Between GCD and LCM

## Formula

```
GCD(a,b)

×

LCM(a,b)

=

a × b
```

---

## Example

```
12

18

GCD = 6

LCM = 36

6 × 36

=

216

12 × 18

=

216
```

Formula Verified.

---

# Comparison

| Property | GCD | LCM |
|----------|-----|-----|
|Meaning|Largest Common Factor|Smallest Common Multiple|
|Used In|Fractions|Scheduling|
|Formula|Euclidean Algorithm|(a×b)/GCD|

---

# Common Mistakes

❌ Calculating LCM before GCD.

❌ Forgetting

```
LCM = (a*b)/GCD
```

❌ Thinking coprime means both numbers are prime.

❌ Using brute force for GCD.

---

# Interview Questions

- Find GCD
- Find LCM
- Prime Factorization
- Coprime Check
- Simplify Fraction
- GCD of Array

---

# Practice

Easy

- GCD of Two Numbers
- LCM of Two Numbers
- Check Coprime

Medium

- GCD of Array
- Prime Factorization

Advanced

- Extended Euclidean Algorithm
- Euler Totient Function

---

# Revision Checklist

- [ ] GCD
- [ ] LCM
- [ ] Euclidean Algorithm
- [ ] Coprime Numbers
- [ ] Prime Factorization
- [ ] GCD-LCM Relation

---

# Next Part

- Exponents (Powers)
- Square & Cube
- Square Root
- Cube Root
- Logarithms
- Fast Exponentiation

---

# 19. Exponents (Powers) 🟢 Foundation

## Definition

An exponent represents repeated multiplication of the same number.

## Formula

```
aⁿ = a × a × a × ... × a
      (n times)
```

Where

- `a` → Base
- `n` → Exponent (Power)

---

## Examples

```
2³ = 8

5² = 25

10⁴ = 10000

3¹ = 3

7⁰ = 1
```

---

## Important Properties

### Identity

```
a¹ = a
```

### Zero Power

```
a⁰ = 1

(a ≠ 0)
```

### Product Rule

```
aᵐ × aⁿ

=

aᵐ⁺ⁿ
```

---

### Quotient Rule

```
aᵐ / aⁿ

=

aᵐ⁻ⁿ
```

---

### Power of Power

```
(aᵐ)ⁿ

=

aᵐⁿ
```

---

### Product Power

```
(ab)ⁿ

=

aⁿ × bⁿ
```

---

### Fraction Power

```
(a/b)ⁿ

=

aⁿ / bⁿ
```

---

## Programming Connection

Used in

- Complexity Analysis
- Binary Search
- Trees
- Bit Manipulation
- Cryptography

---

# 20. Square 🟢 Foundation

## Definition

Square means multiplying a number by itself.

## Formula

```
n²

=

n × n
```

---

## Examples

```
5² = 25

8² = 64

12² = 144
```

---

## Java

```java
int square = n * n;
```

Avoid

```java
Math.pow(n,2);
```

Reason

- Slower
- Returns double

---

# 21. Cube 🟢 Foundation

## Definition

Cube means multiplying a number three times.

## Formula

```
n³

=

n × n × n
```

---

## Example

```
4³

=

64
```

---

## Java

```java
int cube = n * n * n;
```

---

# 22. Square Root 🟢 Foundation

## Definition

Square root is a value which when multiplied by itself gives the original number.

## Formula

```
√n
```

---

## Examples

```
√25 = 5

√36 = 6

√81 = 9
```

---

## Programming Importance

Many optimized algorithms iterate only until

```
√n
```

Examples

- Prime Number
- Factors
- Divisors
- Prime Factorization

---

## Java

```java
double root = Math.sqrt(n);
```

---

## Time Complexity Connection

Instead of

```
O(n)
```

many mathematical problems become

```
O(√n)
```

---

# 23. Cube Root 🟡 Intermediate

## Formula

```
∛n
```

---

## Examples

```
∛27 = 3

∛64 = 4

∛125 = 5
```

---

## Java

```java
double ans = Math.cbrt(n);
```

---

## Programming Connection

Used in

- Mathematical Problems
- Geometry
- Numerical Computing

---

# 24. Logarithm 🟡 Intermediate

## Definition

A logarithm is the inverse of exponentiation.

If

```
aˣ = b
```

Then

```
logₐ(b)

=

x
```

---

## Examples

```
2³ = 8

↓

log₂8 = 3
```

```
10² = 100

↓

log₁₀100 = 2
```

---

## Important Logarithms

### Base 2

```
log₂(n)
```

Common in

- Binary Search
- Trees
- Divide & Conquer

---

### Base 10

```
log₁₀(n)
```

Used in

- Number of Digits
- Scientific Notation

---

### Natural Log

```
ln(n)

=

logₑ(n)
```

Mostly used in Mathematics and Machine Learning.

---

## Java

Natural Log

```java
Math.log(n)
```

Base 10

```java
Math.log10(n)
```

Base 2

```java
Math.log(n) / Math.log(2)
```

---

# 25. Fast Exponentiation (Binary Exponentiation) 🔴 Advanced

## Problem

Find

```
aⁿ
```

efficiently.

---

## Brute Force

```java
for(int i = 0; i < n; i++)
    ans *= a;
```

Time Complexity

```
O(n)
```

---

## Optimized Idea

If

```
n

is even

↓

aⁿ

=

(a²)ⁿ⁄²
```

If

```
n

is odd

↓

aⁿ

=

a × aⁿ⁻¹
```

---

## Time Complexity

```
O(log n)
```

---

## Java

```java
static long power(long a, long b){

    long ans = 1;

    while(b > 0){

        if((b & 1) == 1)

            ans *= a;

        a *= a;

        b >>= 1;

    }

    return ans;

}
```

---

## Programming Connection

Used in

- Modular Arithmetic
- Competitive Programming
- Cryptography
- Matrix Exponentiation

---

# Recognition Pattern

Use

### Square Root

When

- Factors
- Prime
- Divisors

---

Use

### Logarithm

When

- Binary Search
- Height of Tree
- Divide & Conquer

---

Use

### Fast Exponentiation

When

- Very large powers
- Competitive Programming
- Modular Exponentiation

---

# Common Mistakes

❌ Using `Math.pow()` for integer calculations.

❌ Forgetting

```
a⁰ = 1
```

❌ Solving power in `O(n)` when `O(log n)` exists.

❌ Iterating to `n` instead of `√n`.

---

# Interview Questions

Easy

- Square
- Cube
- Square Root

Medium

- Power Function
- Sqrt(x)

Advanced

- Fast Power
- Modular Exponentiation

---

# Practice

Easy

- Square
- Cube
- Integer Square Root

Medium

- Pow(x,n)
- Perfect Square

Advanced

- Binary Exponentiation
- Super Pow

---

# Revision Checklist

- [ ] Exponents
- [ ] Square
- [ ] Cube
- [ ] Square Root
- [ ] Cube Root
- [ ] Logarithm
- [ ] Fast Exponentiation

---

# Next Part

- Absolute Value
- Floor & Ceil
- Rounding
- Average
- Ratio & Proportion
- Arithmetic Progression (AP)
- Geometric Progression (GP)

---

# 26. Absolute Value (Modulus) 🟢 Foundation

## Definition

The absolute value of a number is its distance from zero on the number line, regardless of direction.

## Notation

```
|x|
```

## Formula

```
|x| = x      if x ≥ 0

|x| = -x     if x < 0
```

## Examples

| Expression | Result |
|-----------|-------:|
| \|5\| | 5 |
| \|-5\| | 5 |
| \|0\| | 0 |

## Java

```java
Math.abs(-15);
```

## Programming Connection

Used in

- Distance Calculation
- Geometry
- Binary Search
- Greedy Algorithms
- Dynamic Programming

---

# 27. Floor Function 🟢 Foundation

## Definition

Returns the greatest integer less than or equal to the given number.

## Notation

```
⌊x⌋
```

## Examples

| Expression | Result |
|-----------|-------:|
|⌊4.8⌋|4|
|⌊4.1⌋|4|
|⌊4.0⌋|4|
|⌊-4.2⌋|-5|

## Java

```java
Math.floor(4.8);
```

## Programming Connection

- Bucketing
- Pagination
- Coordinate Mapping

---

# 28. Ceiling Function 🟢 Foundation

## Definition

Returns the smallest integer greater than or equal to the given number.

## Notation

```
⌈x⌉
```

## Examples

| Expression | Result |
|-----------|-------:|
|⌈4.1⌉|5|
|⌈4.8⌉|5|
|⌈4.0⌉|4|
|⌈-4.8⌉|-4|

## Java

```java
Math.ceil(4.2);
```

## Programming Connection

- Memory Allocation
- Pagination
- Load Distribution

---

# 29. Rounding 🟢 Foundation

## Definition

Rounds a decimal value to the nearest integer.

## Rule

```
Decimal < 0.5

↓

Round Down

Decimal ≥ 0.5

↓

Round Up
```

## Examples

| Expression | Result |
|-----------|-------:|
|4.2|4|
|4.5|5|
|4.8|5|

## Java

```java
Math.round(4.7);
```

---

# 30. Average (Mean) 🟢 Foundation

## Formula

```
Average

=

Sum of Elements

/

Number of Elements
```

## Example

```
10

20

30

40

Average

=

100 / 4

=

25
```

## Java

```java
double avg = (double)sum / n;
```

## Programming Connection

- Arrays
- Statistics
- Sliding Window
- Data Analysis

---

# 31. Ratio 🟡 Intermediate

## Definition

A ratio compares two quantities.

## Formula

```
a : b
```

## Example

```
10 : 5

=

2 : 1
```

## Programming Connection

- Scaling
- Graphics
- Probability

---

# 32. Proportion 🟡 Intermediate

## Definition

Two ratios are equal.

## Formula

```
a : b

=

c : d
```

Equivalent

```
a × d

=

b × c
```

## Example

```
2 : 4

=

4 : 8
```

---

# 33. Arithmetic Progression (AP) 🟡 Intermediate

## Definition

A sequence where the difference between consecutive terms remains constant.

## Formula

```
a

a+d

a+2d

a+3d
```

## nth Term

```
aₙ

=

a + (n−1)d
```

## Sum of n Terms

```
S

=

n/2

×

(2a + (n−1)d)
```

## Example

```
2

5

8

11

14
```

Difference

```
3
```

## Programming Connection

- Sequence Problems
- Mathematics
- Dynamic Programming

---

# 34. Geometric Progression (GP) 🟡 Intermediate

## Definition

A sequence where every term is multiplied by a constant ratio.

## Formula

```
a

ar

ar²

ar³
```

## nth Term

```
a × rⁿ⁻¹
```

## Sum Formula

If

```
r ≠ 1
```

```
S

=

a(rⁿ−1)

/

(r−1)
```

## Example

```
2

4

8

16

32
```

Common Ratio

```
2
```

## Programming Connection

- Binary Tree Levels
- Complexity Analysis
- Divide & Conquer

---

# Java Math APIs

| Method | Purpose |
|---------|---------|
|Math.abs(x)|Absolute Value|
|Math.floor(x)|Floor|
|Math.ceil(x)|Ceiling|
|Math.round(x)|Round|
|Math.max(a,b)|Maximum|
|Math.min(a,b)|Minimum|

---

# Recognition Pattern

| Problem Statement | Concept |
|------------------|---------|
|Shortest Distance|Absolute Value|
|Nearest Integer|Round|
|Largest Integer ≤ x|Floor|
|Smallest Integer ≥ x|Ceil|
|Average Marks|Mean|
|Equal Ratios|Proportion|
|Increasing by Constant Difference|AP|
|Increasing by Constant Ratio|GP|

---

# Common Mistakes

❌ Confusing Floor and Integer Casting.

❌ Forgetting Floor behaves differently for negative numbers.

❌ Using integer division while calculating average.

❌ Mixing AP and GP formulas.

---

# Interview Questions

Easy

- Average of Array
- Maximum Difference
- AP Series

Medium

- Missing Term in AP
- GP Sequence

Advanced

- Mathematical Series Problems

---

# Practice

Easy

- Average of Array
- Find Maximum
- Find Minimum
- AP nth Term

Medium

- AP Sum
- GP Sum

Advanced

- Series Pattern Problems

---

# Revision Checklist

- [ ] Absolute Value
- [ ] Floor
- [ ] Ceiling
- [ ] Round
- [ ] Average
- [ ] Ratio
- [ ] Proportion
- [ ] AP
- [ ] GP

---

# Next Part

- Permutations
- Combinations
- Pigeonhole Principle
- Probability Basics
- Expected Value

---

# 35. Factorial (!) 🟢 Foundation

## Definition

Factorial of a non-negative integer is the product of all positive integers from 1 to that number.

## Formula

```
n!

=

n × (n-1) × (n-2) × ... × 2 × 1
```

## Examples

```
0! = 1

1! = 1

3! = 6

5! = 120

6! = 720
```

---

## Properties

```
0! = 1

1! = 1

n! = n × (n-1)!
```

---

## Java

```java
long fact = 1;

for(int i = 2; i <= n; i++)
    fact *= i;
```

---

## Time Complexity

```
O(n)
```

---

## Programming Connection

Used in

- Permutations
- Combinations
- Probability
- Counting Problems

---

# 36. Permutation (nPr) 🟡 Intermediate

## Definition

Permutation is the arrangement of objects where **order matters**.

---

## Formula

```
nPr

=

n!

/

(n-r)!
```

---

## Example

Choose 2 students from 5 for

Captain

Vice Captain

```
5P2

=

5!

/

3!

=

20
```

---

## Key Point

```
Order Matters
```

```
AB ≠ BA
```

---

## Applications

- Seating Arrangement
- Password Generation
- Ranking
- Scheduling

---

# 37. Combination (nCr) 🟡 Intermediate

## Definition

Combination is the selection of objects where **order does not matter**.

---

## Formula

```
nCr

=

n!

/

r!(n-r)!
```

---

## Example

Choose 2 students from 5.

```
5C2

=

10
```

---

## Key Point

```
Order Does NOT Matter
```

```
AB = BA
```

---

## Applications

- Team Selection
- Committee Formation
- Probability
- Dynamic Programming

---

# Difference Between nPr and nCr

| Permutation | Combination |
|-------------|-------------|
|Order Matters|Order Doesn't Matter|
|Usually Larger|Usually Smaller|
|Arrangement|Selection|

---

# 38. Pigeonhole Principle 🔴 Advanced

## Statement

If

```
n + 1

objects

are placed into

n

boxes,
```

then

```
At least one box contains

2 or more objects.
```

---

## Example

11 students

10 classrooms

↓

At least one classroom has

```
2 students
```

---

## Programming Connection

Used in

- Hashing
- Proof Problems
- Competitive Programming

---

# 39. Probability 🟡 Intermediate

## Definition

Probability measures the likelihood of an event.

---

## Formula

```
Probability

=

Favourable Outcomes

/

Total Outcomes
```

---

## Range

```
0 ≤ P ≤ 1
```

---

## Examples

Dice

```
P(6)

=

1/6
```

Coin

```
P(Head)

=

1/2
```

---

## Properties

Impossible Event

```
P = 0
```

Certain Event

```
P = 1
```

---

## Programming Connection

Used in

- AI
- Machine Learning
- Random Algorithms
- Simulations

---

# 40. Expected Value 🔴 Advanced

## Definition

Expected Value is the average outcome over many repetitions.

---

## Formula

```
E(X)

=

Σ

(Value × Probability)
```

---

## Example

Dice

```
E

=

1×1/6

+

2×1/6

+

...

+

6×1/6

=

3.5
```

---

## Programming Connection

Used in

- Machine Learning
- Statistics
- AI
- Probability DP

---

# 41. Overflow 🟢 Foundation

## Definition

Overflow occurs when a value exceeds the storage capacity of its data type.

---

## Java Ranges

| Type | Range |
|------|------|
|byte|-128 to 127|
|short|-32768 to 32767|
|int|-2³¹ to 2³¹−1|
|long|-2⁶³ to 2⁶³−1|

---

## Example

```java
int a = 100000;
int b = 100000;

System.out.println(a * b);
```

Incorrect because multiplication overflows before assignment.

Correct

```java
long ans = 1L * a * b;
```

---

## Programming Connection

Very common in

- LeetCode
- Codeforces
- Matrix Problems
- Prefix Sum
- Binary Search

---

# Recognition Pattern

| Problem Says | Use |
|-------------|-----|
|Arrange Objects|Permutation|
|Select Objects|Combination|
|Average Outcome|Expected Value|
|Random Event|Probability|
|Very Large Numbers|Overflow Check|
|Repeated Counting|Factorial|

---

# Common Mistakes

❌ Confusing Permutation and Combination.

❌ Forgetting

```
0! = 1
```

❌ Ignoring integer overflow.

❌ Using int for very large multiplication.

---

# Interview Questions

Easy

- Factorial
- nCr
- nPr

Medium

- Pascal Triangle
- Unique Paths
- Combinations

Advanced

- Expected Value
- Probability DP
- Counting Problems

---

# Practice

Easy

- Factorial
- Pascal Triangle
- Combinations

Medium

- Combination Sum
- Unique Paths

Advanced

- Probability DP
- Random Pick
- Counting Problems

---

# Revision Checklist

- [ ] Factorial
- [ ] Permutation
- [ ] Combination
- [ ] Pigeonhole Principle
- [ ] Probability
- [ ] Expected Value
- [ ] Overflow

---

# Next Part

- Coordinate Geometry
- Pythagoras Theorem
- Distance Formula
- Midpoint Formula
- Slope
- Area
- Matrix Mathematics

