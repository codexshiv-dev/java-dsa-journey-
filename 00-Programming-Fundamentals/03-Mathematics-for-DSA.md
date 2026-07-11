# Mathematics for DSA

> **Category:** Programming Fundamentals
>
> **Chapter:** 3
>
> **Difficulty:** ⭐⭐ Beginner → Advanced
>
> **Prerequisites:**
> - Number System
> - Mathematics for Programming
>
> **Programming Language:** Java
>
> **Interview Importance:** ⭐⭐⭐⭐⭐

---

# Table of Contents

1. Introduction
2. Why Mathematics is Important in DSA
3. Coordinate System
4. Cartesian Plane
5. Quadrants
6. Coordinate Representation
7. Distance Between Two Points
8. Midpoint Formula
9. Applications in DSA

---

# 1. Introduction

Many Data Structures and Algorithms are built on mathematical concepts.

Understanding these concepts helps you

- Identify hidden patterns
- Reduce time complexity
- Solve geometry problems
- Optimize algorithms
- Improve logical thinking

This chapter focuses only on mathematics that is frequently used in

- DSA
- LeetCode
- Codeforces
- Coding Interviews
- Competitive Programming

---

# 2. Mathematics Used in DSA

| Topic | Used In |
|---------|----------|
| Coordinate Geometry | Graphs, Geometry Problems |
| Pythagoras Theorem | Distance Problems |
| Distance Formula | Points on Plane |
| Midpoint Formula | Geometry |
| Prefix Sum Mathematics | Arrays |
| Modular Arithmetic | Number Theory |
| Matrix Mathematics | 2D Arrays |
| Overflow Prevention | Large Numbers |
| Combinatorics | Dynamic Programming |
| Probability | Randomized Algorithms |

---

# 3. Coordinate System

## Definition

A Coordinate System is used to represent the position of a point on a plane using two values.

A point is represented as

```
(x, y)
```

where

- x → Horizontal Position
- y → Vertical Position

---

# 4. Cartesian Plane

The Cartesian Plane consists of two perpendicular axes.

```
          +Y
           ↑
           |
     II    |    I
-----------O------------→ +X
     III   |    IV
           |
           ↓
          -Y
```

Where

```
O

=

Origin

=

(0,0)
```

---

# 5. Axes

## X-Axis

Horizontal Axis

```
(-x) ←────────────→ (+x)
```

---

## Y-Axis

Vertical Axis

```
(+y)

↑

↓

(-y)
```

---

# 6. Origin

The point where both axes intersect.

Coordinates

```
(0,0)
```

---

# 7. Quadrants

| Quadrant | x | y |
|----------|---|---|
| I | + | + |
| II | - | + |
| III | - | - |
| IV | + | - |

Example

```
(5,4)

↓

Quadrant I
```

```
(-2,8)

↓

Quadrant II
```

---

# 8. Coordinate Representation

General Form

```
(x,y)
```

Example

```
(3,5)

(-4,7)

(8,-2)

(-5,-6)
```

---

# 9. Distance Between Two Points

Suppose

```
P(x₁,y₁)

Q(x₂,y₂)
```

Distance Formula

```
√((x₂-x₁)²+(y₂-y₁)²)
```

---

## Example

```
A(2,3)

B(5,7)
```

```
√((5-2)²+(7-3)²)

=

√(9+16)

=

√25

=

5
```

---

## Java

```java
double distance = Math.sqrt(
    Math.pow(x2 - x1, 2)
    +
    Math.pow(y2 - y1, 2)
);
```

---

## Programming Connection

Used in

- Geometry Problems
- Graph Algorithms
- Nearest Point
- Clustering Algorithms
- Computer Graphics

---

# 10. Midpoint Formula

## Definition

The midpoint divides a line segment into two equal parts.

Formula

```
((x₁+x₂)/2,

(y₁+y₂)/2)
```

---

## Example

```
A(2,4)

B(6,8)
```

```
((2+6)/2,

(4+8)/2)

=

(4,6)
```

---

## Java

```java
double midX = (x1 + x2) / 2.0;
double midY = (y1 + y2) / 2.0;
```

---

# Recognition Pattern

Use Coordinate Geometry when problems contain

- x coordinate
- y coordinate
- Point
- Distance
- Plane
- Graph
- Geometry
- Closest Point

---

# Common Mistakes

❌ Swapping x and y coordinates.

❌ Forgetting square root in distance formula.

❌ Using integer division for midpoint.

❌ Confusing origin with quadrant.

---

# Interview Questions

Easy

- Distance Between Two Points
- Midpoint of Line

Medium

- Valid Square
- Check Collinear Points

Advanced

- Closest Pair of Points
- K Closest Points to Origin

---

# Practice

Easy

- Distance Between Points
- Midpoint Calculation

Medium

- K Closest Points to Origin (LeetCode 973)
- Determine if Two Points are Equal

---

# Revision Checklist

- [ ] Coordinate System
- [ ] Origin
- [ ] X-Axis
- [ ] Y-Axis
- [ ] Quadrants
- [ ] Distance Formula
- [ ] Midpoint Formula

---

# Next Part

- Pythagoras Theorem
- Right Triangle
- Hypotenuse
- Distance Derivation
- Applications in DSA
- Geometry Optimization

---

# 11. Pythagoras Theorem 🟢 Foundation

## Definition

In a right-angled triangle, the square of the hypotenuse is equal to the sum of the squares of the other two sides.

## Formula

```
c² = a² + b²
```

Where

```
a = Base

b = Height

c = Hypotenuse
```

---

## Diagram

```
        /|
      c/ |
      /  | b
     /   |
    /____|
      a
```

---

## Finding Hypotenuse

Formula

```
c = √(a² + b²)
```

### Example

```
a = 3

b = 4
```

```
c

=

√(9 + 16)

=

√25

=

5
```

---

## Finding Base

Formula

```
a = √(c² - b²)
```

---

## Finding Height

Formula

```
b = √(c² - a²)
```

---

# 12. Pythagorean Triplets 🟢 Foundation

## Definition

Three positive integers satisfying

```
a² + b² = c²
```

are called Pythagorean Triplets.

---

## Common Triplets

| a | b | c |
|---|---|---|
|3|4|5|
|5|12|13|
|8|15|17|
|7|24|25|
|9|40|41|
|20|21|29|
|12|35|37|

---

## Programming Connection

Frequently used in

- Geometry Problems
- Coordinate Geometry
- Distance Problems

---

# 13. Euclidean Distance 🟢 Foundation

## Definition

The shortest straight-line distance between two points.

Formula

```
Distance

=

√((x₂-x₁)² + (y₂-y₁)²)
```

---

## Example

```
A(1,2)

B(4,6)
```

```
√((4-1)²+(6-2)²)

=

√(9+16)

=

5
```

---

## Time Complexity

```
O(1)
```

---

## Java

```java
double distance = Math.sqrt(
    (x2 - x1) * (x2 - x1)
    +
    (y2 - y1) * (y2 - y1)
);
```

---

## Optimization

Instead of

```java
Math.pow(x, 2)
```

prefer

```java
x * x
```

Reason

- Faster
- Avoids floating-point overhead

---

# 14. Manhattan Distance 🟡 Intermediate

## Definition

Distance measured by moving only horizontally and vertically.

Formula

```
|x₂-x₁|

+

|y₂-y₁|
```

---

## Example

```
A(1,2)

B(4,6)
```

```
|4-1|

+

|6-2|

=

3+4

=

7
```

---

## Programming Connection

Used in

- Grid Problems
- BFS
- DFS
- Robot Movement
- Shortest Path on Grid

---

# Difference Between Euclidean & Manhattan Distance

| Euclidean | Manhattan |
|-----------|-----------|
|Straight-line distance|Horizontal + Vertical movement|
|Uses √|No √|
|Diagonal movement allowed|Diagonal not allowed|
|Geometry|Grid Problems|

---

# 15. Chebyshev Distance 🔴 Advanced

## Definition

Distance when movement in all 8 directions is allowed.

Formula

```
max(

|x₂-x₁|,

|y₂-y₁|

)
```

---

## Programming Connection

Used in

- Chess Problems
- King's Movement
- Grid Algorithms

---

# 16. Recognition Pattern

Use **Pythagoras / Euclidean Distance** when problems mention

- Straight Line
- Shortest Distance
- Diagonal
- Coordinate Plane
- Circle
- Radius
- Triangle
- Closest Point

---

Use **Manhattan Distance** when problems mention

- Grid
- Up
- Down
- Left
- Right
- Taxi
- Robot
- BFS

---

Use **Chebyshev Distance** when problems mention

- 8 Directions
- Chess King
- Diagonal Movement Allowed

---

# 17. Programming Applications

Used in

## Arrays

- Matrix Diagonal

---

## Graphs

- Shortest Distance
- Coordinate Graph

---

## Geometry

- Line Segment
- Triangle
- Polygon

---

## Computer Graphics

- Collision Detection
- Rendering

---

## Robotics

- Path Planning

---

## Machine Learning

- KNN Algorithm
- Clustering

---

## Game Development

- Character Movement
- Range Detection

---

# Java Utility Methods

| Method | Purpose |
|---------|---------|
|Math.sqrt()|Square Root|
|Math.abs()|Absolute Value|
|Math.max()|Maximum|
|Math.min()|Minimum|

---

# Common Mistakes

❌ Forgetting square root.

❌ Using Manhattan distance instead of Euclidean distance.

❌ Using `Math.pow(x,2)` instead of `x*x`.

❌ Mixing x and y coordinates.

❌ Integer division where decimal values are required.

---

# Interview Questions

Easy

- Distance Between Two Points
- Check Pythagorean Triplet

Medium

- Valid Square
- K Closest Points to Origin

Advanced

- Minimum Cost to Connect Points
- Geometry-Based Graph Problems

---

# Practice

Easy

- Calculate Hypotenuse
- Distance Between Points
- Check Right Triangle

Medium

- K Closest Points to Origin (LeetCode 973)
- Valid Square (LeetCode 593)

Advanced

- Min Cost to Connect All Points (LeetCode 1584)
- Best Meeting Point

---

# Revision Checklist

- [ ] Pythagoras Theorem
- [ ] Hypotenuse Formula
- [ ] Pythagorean Triplets
- [ ] Euclidean Distance
- [ ] Manhattan Distance
- [ ] Chebyshev Distance
- [ ] Programming Applications

---

# Next Part

- Prefix Sum Mathematics
- Difference Array
- Prefix XOR
- Range Sum Queries
- Mathematical Logic Behind Prefix Sum

---

# 18. Prefix Sum Mathematics 🟢 Foundation

## Definition

A Prefix Sum stores the cumulative sum of elements from the beginning of an array up to the current index.

Instead of calculating the sum repeatedly, we precompute it once and answer queries efficiently.

---

## Formula

```
prefix[i] = prefix[i-1] + arr[i]
```

Base Case

```
prefix[0] = arr[0]
```

---

## Example

Array

```
2  4  1  6  3
```

Prefix Sum

```
2  6  7  13  16
```

Explanation

```
2

2+4 = 6

6+1 = 7

7+6 = 13

13+3 = 16
```

---

# Visual Representation

```
Array

Index

0   1   2   3   4

↓

2   4   1   6   3

↓

Prefix

2   6   7   13  16
```

---

# Building Prefix Sum

## Brute Force

For every index

```
Calculate sum from

0

to

i
```

Time Complexity

```
O(n²)
```

---

## Optimal

Traverse once.

Time Complexity

```
O(n)
```

---

## Java

```java
int[] prefix = new int[arr.length];

prefix[0] = arr[0];

for(int i = 1; i < arr.length; i++){

    prefix[i] = prefix[i - 1] + arr[i];

}
```

---

# 19. Range Sum Query

Problem

Find the sum between

```
L

and

R
```

---

## Formula

If

```
L = 0
```

Answer

```
prefix[R]
```

Otherwise

```
prefix[R] - prefix[L-1]
```

---

## Example

Array

```
2 4 1 6 3
```

Prefix

```
2 6 7 13 16
```

Find

```
L = 1

R = 3
```

Answer

```
13 - 2

=

11
```

Check

```
4+1+6

=

11
```

---

# Why Prefix Sum Works

Observe

```
Prefix[3]

=

2+4+1+6
```

Subtract

```
Prefix[0]

=

2
```

Remaining

```
4+1+6
```

---

# Time Complexity

Without Prefix

```
Each Query

O(n)
```

With Prefix

```
Preprocessing

O(n)

Each Query

O(1)
```

---

# Space Complexity

```
O(n)
```

---

# Programming Connection

Used in

- Arrays
- Sliding Window
- Dynamic Programming
- HashMap
- Matrix Problems
- Competitive Programming

---

# 20. Prefix XOR 🟡 Intermediate

Instead of storing cumulative sum,

store cumulative XOR.

Formula

```
prefixXor[i]

=

prefixXor[i-1]

^

arr[i]
```

---

## Query Formula

```
prefixXor[R]

^

prefixXor[L-1]
```

---

## Programming Connection

Used in

- Bit Manipulation
- XOR Problems
- Subarray XOR

---

# 21. Difference Array 🟡 Intermediate

Used when many range updates are performed.

Instead of updating every element,

update only boundaries.

---

## Update

Add

```
+X
```

from

```
L

to

R
```

Perform

```
diff[L] += X

diff[R+1] -= X
```

Finally,

build Prefix Sum.

---

## Time Complexity

Each Update

```
O(1)
```

Final Build

```
O(n)
```

---

# Pattern Recognition

Think **Prefix Sum** when the problem says

- Sum of Subarray
- Range Sum
- Multiple Queries
- Continuous Interval
- Running Sum
- Cumulative Sum
- Prefix
- Interval Sum

---

Think **Difference Array** when the problem says

- Multiple Range Updates
- Increase Elements in Range
- Batch Updates
- Offline Updates

---

Think **Prefix XOR** when the problem contains

- XOR
- Bit Manipulation
- XOR Queries

---

# Common Mistakes

❌ Forgetting

```
L = 0
```

special case.

❌ Wrong index

```
L-1
```

❌ Modifying original array accidentally.

❌ Confusing Prefix Sum with Sliding Window.

---

# Interview Questions

Easy

- Running Sum of 1D Array (LeetCode 1480)
- Range Sum Query - Immutable (LeetCode 303)

Medium

- Subarray Sum Equals K (LeetCode 560)
- Continuous Subarray Sum (LeetCode 523)
- Range Addition (Difference Array)

Advanced

- 2D Prefix Sum
- Prefix XOR Queries
- Count Subarrays Divisible by K

---

# Practice Order

🟢 Easy

- Running Sum of 1D Array
- Range Sum Query
- Find Pivot Index

🟡 Medium

- Subarray Sum Equals K
- Continuous Subarray Sum
- Count Subarrays Divisible by K

🔴 Advanced

- 2D Prefix Sum
- Difference Array
- Prefix XOR Problems

---

# Revision Checklist

- [ ] Prefix Sum
- [ ] Prefix Formula
- [ ] Range Sum Query
- [ ] Prefix XOR
- [ ] Difference Array
- [ ] Pattern Recognition
- [ ] Time Complexity

---

# Next Part

- Modular Arithmetic
- Modulo Properties
- Modular Addition
- Modular Multiplication
- Modular Inverse
- Fast Modular Exponentiation
- Overflow Prevention

---

# 22. Modular Arithmetic 🟢 Foundation

## Definition

Modular Arithmetic deals with the remainder after division.

Instead of working with very large numbers, we work with their remainder.

---

## Modulus Operator

In Java

```java
a % b
```

returns the remainder when

```
a

is divided by

b
```

---

## Examples

```
10 % 3 = 1

15 % 4 = 3

25 % 5 = 0

7 % 2 = 1
```

---

# Why Modular Arithmetic?

Many programming problems involve extremely large numbers.

Example

```
2¹⁰⁰⁰
```

cannot fit into any primitive data type.

Instead,

store

```
Answer % M
```

---

# Most Common Modulus

```
1,000,000,007
```

Written as

```java
1000000007
```

or

```java
1_000_000_007
```

---

## Why 1,000,000,007?

Because it is

- Prime Number
- Fits inside int
- Prevents Overflow
- Used in most coding platforms

---

# 23. Modulo Properties 🟢 Foundation

## Addition

Formula

```
(a+b)%m

=

((a%m)+(b%m))%m
```

---

### Example

```
(15+20)%7

=

35%7

=

0

↓

(15%7 + 20%7)%7

=

1+6

=

7%7

=

0
```

---

## Subtraction

Formula

```
(a-b)%m

=

((a%m)-(b%m)+m)%m
```

Adding

```
+m
```

avoids negative answers.

---

### Example

```
5-8

=

-3
```

Wrong

```
-3 % 7
```

Correct

```
((5%7)-(8%7)+7)%7

=

4
```

---

## Multiplication

Formula

```
(a×b)%m

=

((a%m)

×

(b%m))

%m
```

---

### Example

```
15×20

=

300

300%7

=

6
```

Using property

```
(1×6)%7

=

6
```

---

# Division

There is **NO direct modulo division**.

Instead,

use

```
Modular Inverse
```

---

# 24. Overflow Prevention 🟢 Foundation

Wrong

```java
int ans = a * b;
```

Overflow may occur before assignment.

---

Correct

```java
long ans = 1L * a * b;
```

---

Even Better

```java
long ans = (1L * a * b) % MOD;
```

---

# 25. Modular Exponentiation 🔴 Advanced

Problem

Find

```
aⁿ % m
```

efficiently.

---

## Brute Force

Multiply

```
n
```

times.

Time

```
O(n)
```

---

## Optimal

Binary Exponentiation

Time

```
O(log n)
```

---

## Java

```java
static long modPower(long a, long b, long mod){

    long ans = 1;

    a %= mod;

    while(b > 0){

        if((b & 1) == 1)
            ans = (ans * a) % mod;

        a = (a * a) % mod;

        b >>= 1;
    }

    return ans;
}
```

---

# 26. Modular Inverse 🔴 Advanced

## Definition

Division under modulo is performed using the modular inverse.

Instead of

```
a / b
```

compute

```
a × inverse(b)
```

---

## Condition

Inverse exists only if

```
GCD(b,m)=1
```

---

## Formula

For Prime Modulus

```
b^(m−2)%m
```

(Fermat's Little Theorem)

---

# Programming Connection

Used in

- Combinations
- Probability
- Dynamic Programming
- Competitive Programming

---

# Pattern Recognition

Think **Modulo** when problems mention

- Very Large Number
- Answer can be huge
- Return answer modulo
- 10⁹+7
- 998244353
- Large Power
- Counting Ways
- Number of Paths

---

Think **Modular Exponentiation** when

- Power is very large
- Exponent is 10⁹ or greater
- Fast Power Required

---

Think **Overflow Prevention** when

- int may overflow
- Product of two large numbers
- Matrix Multiplication
- Prefix Sum
- Binary Search

---

# Common Mistakes

❌ Forgetting final `% MOD`.

❌ Multiplying two `int` values before casting to `long`.

❌ Using normal division under modulo.

❌ Ignoring negative values after subtraction.

❌ Using `Math.pow()` for modular exponentiation.

---

# Java Tips

Always declare

```java
static final int MOD = 1_000_000_007;
```

Multiply safely

```java
long ans = (1L * a * b) % MOD;
```

Never write

```java
int ans = a * b % MOD;
```

when

```
a*b
```

may overflow.

---

# Interview Questions

🟢 Easy

- Check Divisibility
- Large Number Modulo

🟡 Medium

- Pow(x, n)
- Count Good Numbers

🔴 Advanced

- Modular Inverse
- nCr % MOD
- Matrix Exponentiation

---

# Practice

🟢 Easy

- Pow(x, n) (LeetCode 50)

🟡 Medium

- Count Good Numbers (LeetCode 1922)

🔴 Advanced

- nCr % MOD
- Modular Inverse
- Binary Exponentiation

---

# Revision Checklist

- [ ] Modulo Operator
- [ ] Addition Property
- [ ] Subtraction Property
- [ ] Multiplication Property
- [ ] Overflow Prevention
- [ ] Modular Exponentiation
- [ ] Modular Inverse
- [ ] Pattern Recognition

---

# Next Part

- Matrix Mathematics
- Matrix Coordinates
- Matrix Diagonals
- Matrix Rotation
- Matrix Transformations
- Matrix Index Mathematics

---

# 27. Matrix Mathematics 🟢 Foundation

## Definition

A matrix is a rectangular arrangement of elements in rows and columns.

General Representation

```
A[m][n]
```

where

```
m = Number of Rows

n = Number of Columns
```

Example

```
1  2  3

4  5  6

7  8  9
```

Rows

```
3
```

Columns

```
3
```

---

# Matrix Terminology

| Term | Meaning |
|------|---------|
| Row | Horizontal elements |
| Column | Vertical elements |
| Cell | Single element |
| Index | Position of an element |
| Dimension | Rows × Columns |

---

# Matrix Indexing

Every element has

```
(row, column)
```

Index starts from

```
0
```

Example

```
      0   1   2

0     1   2   3

1     4   5   6

2     7   8   9
```

Examples

```
matrix[0][0] = 1

matrix[1][2] = 6

matrix[2][1] = 8
```

---

# Memory Representation

Matrix

```
1 2 3

4 5 6

7 8 9
```

is stored in memory as

```
1

2

3

4

5

6

7

8

9
```

(Java uses arrays of arrays.)

---

# Matrix Traversal

## Row Wise Traversal

```
1 2 3

4 5 6

7 8 9
```

Output

```
1 2 3 4 5 6 7 8 9
```

Java

```java
for(int i = 0; i < rows; i++){

    for(int j = 0; j < cols; j++){

        System.out.print(matrix[i][j] + " ");

    }

}
```

Time Complexity

```
O(rows × cols)
```

---

## Column Wise Traversal

Output

```
1 4 7

2 5 8

3 6 9
```

Java

```java
for(int j = 0; j < cols; j++){

    for(int i = 0; i < rows; i++){

        System.out.print(matrix[i][j] + " ");

    }

}
```

---

# Primary Diagonal

Definition

Elements where

```
row == column
```

Example

```
1 2 3

4 5 6

7 8 9
```

Primary Diagonal

```
1

5

9
```

Java

```java
for(int i = 0; i < n; i++){

    System.out.print(matrix[i][i]);

}
```

---

# Secondary Diagonal

Definition

```
row + column = n - 1
```

Example

```
1 2 3

4 5 6

7 8 9
```

Secondary Diagonal

```
3

5

7
```

Java

```java
for(int i = 0; i < n; i++){

    System.out.print(matrix[i][n - 1 - i]);

}
```

---

# Matrix Symmetry

A square matrix is symmetric if

```
matrix[i][j]

=

matrix[j][i]
```

Example

```
1 2 3

2 4 5

3 5 6
```

Symmetric

---

# Matrix Dimensions

| Matrix | Rows | Columns |
|---------|-----:|--------:|
|1 × 1|1|1|
|2 × 2|2|2|
|3 × 3|3|3|
|m × n|m|n|

---

# Pattern Recognition

Think **Matrix Mathematics** when the problem mentions

- 2D Array
- Grid
- Chess Board
- Image
- Pixels
- Rows
- Columns
- Matrix
- Board
- Sudoku

---

# Programming Connection

Used in

- 2D Arrays
- Dynamic Programming
- Graphs
- Image Processing
- Computer Vision
- Game Development

---

# Common Mistakes

❌ Confusing rows with columns.

❌ Using

```java
matrix.length
```

for columns.

Correct

```java
matrix[0].length
```

❌ Wrong loop order.

❌ Index Out of Bounds.

---

# Interview Questions

Easy

- Print Matrix
- Row Wise Traversal
- Column Wise Traversal
- Sum of Matrix

Medium

- Diagonal Sum
- Matrix Transpose
- Spiral Matrix

Advanced

- Rotate Matrix
- Search in Sorted Matrix
- Set Matrix Zeroes

---

# Practice

🟢 Easy

- Matrix Traversal
- Print Boundary
- Sum of Rows

🟡 Medium

- Diagonal Sum (LeetCode 1572)
- Transpose Matrix (LeetCode 867)

🔴 Advanced

- Rotate Image (LeetCode 48)
- Spiral Matrix (LeetCode 54)

---

# Revision Checklist

- [ ] Matrix
- [ ] Row
- [ ] Column
- [ ] Matrix Indexing
- [ ] Row Traversal
- [ ] Column Traversal
- [ ] Primary Diagonal
- [ ] Secondary Diagonal
- [ ] Symmetric Matrix

---

# Next Part

- Matrix Transpose
- Matrix Rotation (90°, 180°, 270°)
- Boundary Traversal
- Spiral Traversal
- Zig-Zag Traversal
- Anti-Diagonals

---

# 28. Matrix Transpose 🟢 Foundation

## Definition

The transpose of a matrix is obtained by converting rows into columns and columns into rows.

Notation

```
Aᵀ
```

---

## Formula

```
transpose[i][j]

=

matrix[j][i]
```

---

## Example

Original Matrix

```
1 2 3

4 5 6

7 8 9
```

Transpose

```
1 4 7

2 5 8

3 6 9
```

---

## Observation

```
Row becomes Column

Column becomes Row
```

---

## In-place Transpose (Square Matrix)

Swap

```
matrix[i][j]

↔

matrix[j][i]
```

Only for

```
j > i
```

---

## Java

```java
for(int i = 0; i < n; i++){

    for(int j = i + 1; j < n; j++){

        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;

    }

}
```

---

## Time Complexity

```
O(n²)
```

Space

```
O(1)
```

(In-place)

---

# 29. Matrix Rotation 🟢 Foundation

## 90° Clockwise Rotation

### Formula

```
Transpose

↓

Reverse Every Row
```

---

Example

Original

```
1 2 3

4 5 6

7 8 9
```

After Transpose

```
1 4 7

2 5 8

3 6 9
```

Reverse Rows

```
7 4 1

8 5 2

9 6 3
```

---

## Java Steps

```text
Transpose

↓

Reverse Every Row
```

---

## Time Complexity

```
O(n²)
```

---

# 90° Anti-Clockwise Rotation

Formula

```
Transpose

↓

Reverse Every Column
```

---

Example

```
1 2 3

4 5 6

7 8 9
```

↓

```
3 6 9

2 5 8

1 4 7
```

---

# 180° Rotation

Formula

```
Reverse Every Row

↓

Reverse Entire Matrix
```

OR

```
Reverse Columns

↓

Reverse Rows
```

Result

```
9 8 7

6 5 4

3 2 1
```

---

# 270° Rotation

Formula

```
90° Clockwise

↓

90° Clockwise

↓

90° Clockwise
```

OR

```
Transpose

↓

Reverse Columns
```

---

# Rotation Summary

| Rotation | Steps |
|----------|-------|
|90° Clockwise|Transpose → Reverse Rows|
|90° Anti-Clockwise|Transpose → Reverse Columns|
|180°|Reverse Rows + Reverse Columns|
|270° Clockwise|Transpose → Reverse Columns|

---

# 30. Boundary Traversal 🟢 Foundation

## Definition

Visit only the outer boundary of the matrix.

Order

```
Top Row

↓

Right Column

↓

Bottom Row

↓

Left Column
```

---

Example

```
1 2 3 4

5 6 7 8

9 10 11 12

13 14 15 16
```

Boundary

```
1 2 3 4

8

12

16

15 14 13

9

5
```

---

## Time Complexity

```
O(rows + cols)
```

---

# 31. Spiral Traversal 🟡 Intermediate

## Definition

Traverse layer by layer in spiral order.

Direction

```
Right

↓

Down

↓

Left

↓

Up
```

Repeat.

---

Example

```
1 2 3

4 5 6

7 8 9
```

Output

```
1

2

3

6

9

8

7

4

5
```

---

## Four Boundaries

Maintain

```
top

bottom

left

right
```

After every traversal

update the boundary.

---

## Time Complexity

```
O(rows × cols)
```

Space

```
O(1)
```

---

# 32. Zig-Zag Traversal 🟡 Intermediate

Example

```
1 2 3

4 5 6

7 8 9
```

Output

```
1 2 3

6 5 4

7 8 9
```

Pattern

```
Even Row

→

Left to Right

Odd Row

→

Right to Left
```

---

# 33. Anti-Diagonal Traversal 🔴 Advanced

Condition

```
row + column = constant
```

Example

```
1

2 4

3 5 7

6 8

9
```

---

Programming Connection

- Matrix DP
- Diagonal Traversal
- Competitive Programming

---

# Pattern Recognition

Think **Transpose** when

- Swap Rows & Columns
- Mirror across Main Diagonal

---

Think **90° Rotation** when

- Rotate Image
- Rotate Matrix
- Camera Rotation

---

Think **Boundary Traversal** when

- Outer Layer
- Perimeter
- Border

---

Think **Spiral Traversal** when

- Clockwise Layers
- Spiral Order
- Circular Traversal

---

Think **Anti-Diagonal** when

- Diagonal Traversal
- DP on Diagonals

---

# Common Mistakes

❌ Reversing before transpose.

❌ Using transpose on a non-square matrix for in-place rotation.

❌ Forgetting to update boundaries in spiral traversal.

❌ Printing corner elements twice in boundary traversal.

---

# Interview Questions

🟢 Easy

- Transpose Matrix (LeetCode 867)

- Matrix Diagonal Sum (LeetCode 1572)

🟡 Medium

- Spiral Matrix (LeetCode 54)

- Spiral Matrix II (LeetCode 59)

- Rotate Image (LeetCode 48)

🔴 Advanced

- Diagonal Traverse (LeetCode 498)

- Spiral Matrix III (LeetCode 885)

---

# Practice Order

🟢 Easy

- Print Boundary

- Print Diagonals

- Transpose Matrix

🟡 Medium

- Rotate Image

- Spiral Matrix

- Zig-Zag Traversal

🔴 Advanced

- Diagonal Traverse

- Spiral Matrix III

---

# Revision Checklist

- [ ] Matrix Transpose
- [ ] 90° Clockwise Rotation
- [ ] 90° Anti-Clockwise Rotation
- [ ] 180° Rotation
- [ ] 270° Rotation
- [ ] Boundary Traversal
- [ ] Spiral Traversal
- [ ] Zig-Zag Traversal
- [ ] Anti-Diagonal Traversal

---

# Next Part

- Coordinate Compression
- Prefix Matrix (2D Prefix Sum)
- Matrix Prefix Mathematics
- Inclusion-Exclusion Principle
- Common Mathematical Tricks in Arrays & Matrices

---

# 34. Two-Dimensional Prefix Sum (2D Prefix Sum) 🟡 Intermediate

## Definition

A 2D Prefix Sum stores the cumulative sum of all elements from

```
(0,0)

↓

(i,j)
```

This allows answering rectangle sum queries efficiently.

---

## Formula

```
prefix[i][j]

=

matrix[i][j]

+

prefix[i-1][j]

+

prefix[i][j-1]

-

prefix[i-1][j-1]
```

---

## Why Subtract?

The overlapping region

```
prefix[i-1][j-1]
```

gets counted twice.

Subtract it once.

---

## Example

Matrix

```
1 2 3

4 5 6

7 8 9
```

Prefix Matrix

```
1  3   6

5 12 21

12 27 45
```

---

## Rectangle Sum Formula

Rectangle

```
(r1,c1)

↓

(r2,c2)
```

Answer

```
prefix[r2][c2]

-

prefix[r1-1][c2]

-

prefix[r2][c1-1]

+

prefix[r1-1][c1-1]
```

---

## Time Complexity

Building

```
O(rows × cols)
```

Each Query

```
O(1)
```

---

## Programming Connection

Used in

- Matrix Sum
- Image Processing
- Dynamic Programming
- Competitive Programming

---

# 35. Inclusion-Exclusion Principle 🟡 Intermediate

## Definition

When two regions overlap,

subtract the common part once.

---

## Formula

```
A + B - Intersection
```

---

## Example

```
Prefix Top

+

Prefix Left

-

Overlap

+

Current Cell
```

This is exactly why the Prefix Matrix formula works.

---

## Programming Connection

Used in

- Prefix Sum
- Probability
- Set Theory
- Geometry

---

# 36. Coordinate Compression 🔴 Advanced

## Definition

Replace very large coordinates with smaller indices while preserving their relative order.

---

## Example

Original

```
100

500

100000

99999999
```

Compressed

```
0

1

2

3
```

---

## Why?

Large coordinates waste memory.

Compression makes

```
O(10⁹)

↓

O(n)
```

storage possible.

---

## Programming Connection

Used in

- Segment Tree
- Fenwick Tree
- Sweep Line
- Geometry

---

# 37. Common Mathematical Tricks

## Trick 1

Instead of

```java
Math.pow(x,2)
```

Use

```java
x * x
```

Faster.

---

## Trick 2

Avoid Overflow

Wrong

```java
int ans = a * b;
```

Correct

```java
long ans = 1L * a * b;
```

---

## Trick 3

Middle of Binary Search

Wrong

```java
mid = (low + high) / 2;
```

Correct

```java
mid = low + (high - low) / 2;
```

Avoids overflow.

---

## Trick 4

Square Root Optimization

Instead of

```
1 → n
```

iterate till

```
√n
```

---

## Trick 5

Power of Two

```
n > 0

&&

(n & (n-1)) == 0
```

---

## Trick 6

Even or Odd

```
(n & 1)
```

Faster than

```
n % 2
```

---

## Trick 7

Swap Without Temporary Variable

Using XOR

```java
a ^= b;
b ^= a;
a ^= b;
```

(Not recommended in production code due to readability.)

---

# 38. Recognition Patterns

| Problem Statement | Think About |
|-------------------|-------------|
| Rectangle Sum | 2D Prefix Sum |
| Multiple Rectangle Queries | Prefix Matrix |
| Huge Coordinates | Coordinate Compression |
| Overlapping Areas | Inclusion-Exclusion |
| Large Multiplication | Overflow Prevention |
| Binary Search | Safe Mid Calculation |
| Grid Sum | Prefix Matrix |

---

# Frequently Used Mathematical Formulas

## Distance

```
√((x₂-x₁)²+(y₂-y₁)²)
```

---

## Midpoint

```
((x₁+x₂)/2,

(y₁+y₂)/2)
```

---

## GCD

```
gcd(a,b)

=

gcd(b,a%b)
```

---

## LCM

```
(a×b)

/ gcd
```

---

## Prefix Sum

```
prefix[i]

=

prefix[i-1]

+

arr[i]
```

---

## Modular Multiplication

```
(a×b)%MOD
```

---

## Binary Exponentiation

```
O(log n)
```

---

## 2D Prefix

```
Top

+

Left

-

Overlap

+

Current
```

---

# Common Mistakes

❌ Forgetting overlap subtraction.

❌ Integer overflow.

❌ Wrong Binary Search middle.

❌ Using O(n²) instead of Prefix Sum.

❌ Forgetting matrix dimensions.

---

# Interview Questions

Easy

- Range Sum Query
- Matrix Sum

Medium

- Prefix Matrix
- Rotate Matrix
- Spiral Matrix

Advanced

- Coordinate Compression
- Rectangle Queries
- Segment Tree Problems

---

# Final Revision Checklist

- [ ] Coordinate System
- [ ] Pythagoras
- [ ] Distance Formula
- [ ] Prefix Sum
- [ ] Prefix XOR
- [ ] Difference Array
- [ ] Modular Arithmetic
- [ ] Matrix Mathematics
- [ ] Matrix Rotation
- [ ] 2D Prefix Sum
- [ ] Inclusion-Exclusion
- [ ] Coordinate Compression
- [ ] Mathematical Tricks

---

# Chapter Summary

This chapter covered the mathematical concepts most frequently used in:

- Arrays
- 2D Arrays
- Searching
- Sorting
- Hashing
- Dynamic Programming
- Graphs
- Geometry
- Competitive Programming
- Coding Interviews

Mastering these concepts will significantly improve your problem-solving ability and help you recognize patterns in DSA questions.





