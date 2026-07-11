04-Time-Complexity.md

Part 1
├── What is an Algorithm?
├── Performance Analysis
├── Time vs Space Complexity
├── Input Size (N)
├── Frequency Count Method
├── Best, Worst & Average Case

Part 2
├── Asymptotic Analysis
├── Big-O
├── Big-Ω
├── Big-Θ
├── Little-o
├── Little-ω

Part 3
├── Growth of Functions
├── O(1)
├── O(log n)
├── O(√n)
├── O(n)
├── O(n log n)
├── O(n²)
├── O(n³)
├── O(2ⁿ)
├── O(n!)

Part 4
├── Rules for Complexity Analysis
├── Loops
├── Nested Loops
├── Consecutive Loops
├── Recursive Calls
├── Logarithmic Loops
├── Binary Search Analysis

Part 5
├── Space Complexity
├── Auxiliary Space
├── Stack Memory
├── Heap Memory
├── Recursion Space
├── In-place Algorithms

Part 6
├── Amortized Analysis
├── Master Theorem
├── Recurrence Relations
├── Divide & Conquer Analysis

Part 7
├── Complexity Recognition Patterns
├── Common Interview Questions
├── Complexity Cheat Sheet
├── Java Examples
├── Common Mistakes
├── Revision Checklist

# Time Complexity

> **Category:** Programming Fundamentals
>
> **Chapter:** 4
>
> **Difficulty:** ⭐ Beginner → Advanced
>
> **Prerequisites:**
> - Number System
> - Mathematics for Programming
> - Mathematics for DSA
>
> **Programming Language:** Java
>
> **Interview Importance:** ⭐⭐⭐⭐⭐

---

# Table of Contents

1. Introduction
2. What is an Algorithm?
3. Performance Analysis
4. Why Analyze Algorithms?
5. Time Complexity
6. Space Complexity
7. Input Size (N)
8. Frequency Count Method
9. Best, Worst & Average Case
10. Common Misconceptions

---

# 1. Introduction

When solving a programming problem, there are often multiple possible solutions.

Example

```
Problem

↓

Solution A

↓

Solution B

↓

Solution C
```

All solutions may produce the correct answer, but not all are equally efficient.

An efficient algorithm should

- Produce the correct output
- Execute quickly
- Use less memory
- Scale well for large inputs

The process of measuring an algorithm's efficiency is called **Complexity Analysis**.

---

# 2. What is an Algorithm?

## Definition

An algorithm is a finite sequence of well-defined steps used to solve a problem or perform a computation.

---

## Characteristics of an Algorithm

A good algorithm should have:

### 1. Input

Accept zero or more inputs.

Example

```java
int n = 10;
```

---

### 2. Output

Produce at least one output.

Example

```
Input

5

↓

Output

120
```

---

### 3. Definiteness

Every step must be clear and unambiguous.

Bad

```
Do something.
```

Good

```
Increment i by 1.
```

---

### 4. Finiteness

The algorithm must terminate after a finite number of steps.

Bad

```java
while(true){
}
```

Good

```java
for(int i = 0; i < n; i++){
}
```

---

### 5. Effectiveness

Each operation should be simple enough to execute in finite time.

---

# Real-Life Example

Making Tea

```
Start

↓

Boil Water

↓

Add Tea Leaves

↓

Add Milk

↓

Add Sugar

↓

Serve

↓

End
```

This is also an algorithm.

---

# Programming Example

Find Maximum Element

```
Start

↓

Assume first element is maximum

↓

Traverse array

↓

Compare

↓

Update maximum

↓

Print maximum

↓

End
```

---

# 3. Performance Analysis

Performance analysis determines how efficiently an algorithm uses

- Time
- Memory

---

## Two Types

### Time Complexity

Measures

```
Execution Time
```

---

### Space Complexity

Measures

```
Memory Usage
```

---

# 4. Why Analyze Algorithms?

Suppose two algorithms solve the same problem.

Algorithm A

```
1 second
```

Algorithm B

```
20 seconds
```

Both are correct.

Which one is better?

Obviously,

```
Algorithm A
```

---

Now suppose

```
N = 10
```

Difference is very small.

But if

```
N = 10,000,000
```

Algorithm B may become unusable.

Therefore,

algorithm analysis is important.

---

# 5. Time Complexity

## Definition

Time Complexity measures how the running time of an algorithm grows as the input size increases.

Important

It **does not measure actual clock time**.

Instead, it measures

```
Number of Operations
```

performed by the algorithm.

---

## Example

```java
for(int i = 0; i < n; i++){
    System.out.println(i);
}
```

Loop executes

```
n
```

times.

Time Complexity

```
O(n)
```

---

# 6. Space Complexity

## Definition

Space Complexity measures the total amount of memory required by an algorithm.

It includes

- Variables
- Arrays
- Objects
- Function Call Stack
- Extra Data Structures

---

Example

```java
int sum = 0;
```

Extra Memory

```
O(1)
```

---

Example

```java
int[] arr = new int[n];
```

Extra Memory

```
O(n)
```

---

# Components of Space Complexity

## Input Space

Memory occupied by the input itself.

Example

```java
int[] arr = new int[n];
```

---

## Auxiliary Space

Extra memory used by the algorithm.

Example

```java
Stack<Integer> stack = new Stack<>();
```

Auxiliary Space

```
O(n)
```

---

# Programming Connection

Questions often ask

```
Optimize the algorithm
```

This usually means

- Reduce Time Complexity
- Reduce Auxiliary Space

---

# 7. Input Size (N)

The variable

```
N
```

represents the size of the input.

Examples

Array

```java
int[] arr = new int[n];
```

Input Size

```
N = arr.length
```

---

String

```java
String s
```

Input Size

```
N = s.length()
```

---

Matrix

```
Rows × Columns
```

Input Size

```
m × n
```

---

Linked List

```
Number of Nodes
```

---

Binary Tree

```
Number of Nodes
```

---

Graph

```
V = Vertices

E = Edges
```

---

# Why Input Size Matters

Small Input

```
N = 10
```

Almost every algorithm is fast.

Large Input

```
N = 10⁶
```

Poor algorithms become very slow.

---

# 8. Frequency Count Method

## Definition

Frequency Count counts how many times each statement executes.

It is the foundation of Time Complexity analysis.

---

## Example

```java
for(int i = 0; i < n; i++){
    System.out.println(i);
}
```

Frequency Table

| Statement | Frequency |
|-----------|-----------|
| i = 0 | 1 |
| i < n | n + 1 |
| i++ | n |
| print | n |

Total Operations

```
1

+

(n+1)

+

n

+

n

=

3n+2
```

Ignoring constants,

```
O(n)
```

---

# Why Ignore Constants?

Suppose

```
3n + 2
```

and

```
100n + 500
```

Both grow linearly.

Therefore

```
O(n)
```

---

# 9. Best, Worst & Average Case

## Best Case

Minimum number of operations.

Example

Linear Search

Element found at first position.

```
O(1)
```

---

## Worst Case

Maximum number of operations.

Element found at last position.

```
O(n)
```

---

## Average Case

Expected number of operations over all possible inputs.

Usually

```
O(n)
```

for Linear Search.

---

# Real Example

Searching a book in a library

Best Case

```
First shelf
```

Worst Case

```
Last shelf
```

Average Case

```
Middle shelves
```

---

# Common Misconceptions

❌ Faster computer means better algorithm.

Wrong.

A poor algorithm remains poor even on powerful hardware.

---

❌ Time Complexity is actual execution time.

Wrong.

It measures growth in the number of operations, not seconds.

---

❌ O(1) always means instant execution.

Wrong.

It means constant growth, not zero time.

---

# Programming Connection

Time Complexity is used in

- Arrays
- Strings
- Searching
- Sorting
- Hashing
- Trees
- Graphs
- Dynamic Programming
- Backtracking
- System Design

---

# Interview Questions

Easy

- What is an algorithm?
- Difference between Time and Space Complexity.
- What is Input Size?

Medium

- Frequency Count Analysis.
- Auxiliary Space.
- Best vs Worst Case.

---

# Revision Checklist

- [ ] Algorithm
- [ ] Characteristics of Algorithm
- [ ] Performance Analysis
- [ ] Time Complexity
- [ ] Space Complexity
- [ ] Input Size
- [ ] Frequency Count
- [ ] Best Case
- [ ] Worst Case
- [ ] Average Case

---

# Next Part

- Asymptotic Analysis
- Big-O Notation
- Big-Ω Notation
- Big-Θ Notation
- Little-o
- Little-ω
- Why Asymptotic Analysis is Used

---

# 10. Asymptotic Analysis 🟢 Foundation

## Definition

Asymptotic Analysis is a mathematical method used to evaluate the performance of an algorithm as the input size becomes very large.

Instead of measuring the actual running time in seconds, it studies how the number of operations grows with the input size.

---

## Why Do We Need It?

Actual execution time depends on many factors:

- CPU Speed
- RAM
- Operating System
- Compiler
- Programming Language
- Background Processes

Therefore,

actual execution time is **not a reliable way** to compare algorithms.

Instead, we compare their **growth rate**.

---

## Example

Algorithm A

```
10n + 50
```

Algorithm B

```
2n² + 5
```

For

```
n = 10
```

Both seem fast.

For

```
n = 1,000,000
```

Algorithm A is much faster.

---

## Goal

Measure

```
Growth Rate
```

instead of

```
Actual Running Time
```

---

# 11. Asymptotic Notations

There are five mathematical notations used to describe algorithm growth.

| Notation | Meaning |
|----------|---------|
| Big-O (O) | Upper Bound |
| Big-Ω (Omega) | Lower Bound |
| Big-Θ (Theta) | Tight Bound |
| little-o | Strict Upper Bound |
| little-ω | Strict Lower Bound |

---

# 12. Big-O Notation (O)

## Definition

Big-O represents the **upper bound** of an algorithm.

It tells us the **maximum amount of work** an algorithm performs as the input size grows.

Most interview questions refer to Big-O.

---

## Mathematical Definition

```
T(n) ≤ c × f(n)

for all

n ≥ n₀
```

where

```
c

=

constant

n₀

=

starting point
```

---

## Example

```
3n + 5
```

Ignoring constants

```
O(n)
```

---

Example

```
5n² + 10n + 100
```

Dominant term

```
n²
```

Therefore

```
O(n²)
```

---

## Java Example

```java
for(int i = 0; i < n; i++){

    System.out.println(i);

}
```

Operations

```
n
```

Time Complexity

```
O(n)
```

---

## Recognition Pattern

When analyzing an algorithm,

focus on the **largest growing term**.

Ignore

- Constants
- Smaller terms

---

# 13. Big-Omega (Ω)

## Definition

Big-Omega represents the **lower bound**.

It tells us the **minimum work** an algorithm must perform.

---

## Example

Linear Search

If the element is found at index

```
0
```

only one comparison is required.

```
Ω(1)
```

---

## Java Example

```java
if(arr[0] == target)
    return 0;
```

Minimum operations

```
1
```

---

## Recognition Pattern

Use Big-Omega for

- Best Case
- Minimum Operations

---

# 14. Big-Theta (Θ)

## Definition

Big-Theta represents the **exact growth rate**.

The algorithm grows neither faster nor slower than the given function.

---

## Mathematical Meaning

```
Lower Bound

≤

Algorithm

≤

Upper Bound
```

---

## Example

```
5n + 20
```

Upper Bound

```
O(n)
```

Lower Bound

```
Ω(n)
```

Therefore

```
Θ(n)
```

---

## Recognition Pattern

Use Theta when

Upper Bound

and

Lower Bound

are the same.

---

# 15. little-o (o)

## Definition

little-o represents a **strict upper bound**.

The algorithm grows strictly slower than the given function.

---

## Example

```
n

is

o(n²)
```

because

```
n

grows slower than

n²
```

---

## Programming Connection

Rarely used in coding interviews.

Mostly appears in

- Mathematics
- Research Papers
- Algorithm Analysis

---

# 16. little-ω (ω)

## Definition

little-ω represents a **strict lower bound**.

The algorithm grows strictly faster than another function.

---

## Example

```
n²

is

ω(n)
```

---

## Programming Connection

Rarely used in DSA interviews.

Mostly used in

- Theory of Computation
- Research

---

# Difference Between Notations

| Notation | Meaning | Interview Usage |
|----------|----------|----------------|
| O | Maximum Growth | ⭐⭐⭐⭐⭐ |
| Ω | Minimum Growth | ⭐⭐⭐ |
| Θ | Exact Growth | ⭐⭐⭐⭐ |
| o | Strict Upper | ⭐ |
| ω | Strict Lower | ⭐ |

---

# Visual Growth

```
Big-O

Algorithm

──────────────

Upper Limit

-----------------

Big-Ω

Lower Limit
```

Theta

```
Upper

=

Lower
```

---

# Common Examples

```
15

↓

O(1)
```

```
7n + 20

↓

O(n)
```

```
5n² + 3n + 1

↓

O(n²)
```

```
9n³ + 100n

↓

O(n³)
```

---

# Why Ignore Constants?

```
500n

↓

O(n)
```

```
2n

↓

O(n)
```

The constant multiplier does not affect long-term growth.

---

# Common Mistakes

❌ Keeping constants.

Wrong

```
O(5n)
```

Correct

```
O(n)
```

---

❌ Keeping lower-order terms.

Wrong

```
O(n²+n)
```

Correct

```
O(n²)
```

---

❌ Confusing Big-O with execution time.

Big-O measures **growth**, not seconds.

---

# Programming Connection

Big-O is used to analyze

- Loops
- Nested Loops
- Recursion
- Searching
- Sorting
- Trees
- Graphs
- Dynamic Programming
- Greedy Algorithms

---

# Interview Questions

Easy

- What is Big-O?
- Why do we ignore constants?
- Difference between O and Ω?

Medium

- Explain Θ notation.
- Compare O(n) and O(log n).

Advanced

- Why is O(n²+n) simplified to O(n²)?
- When do we use little-o?

---

# Memory Tricks

Remember

```
O

↓

Upper

(Over)
```

```
Ω

↓

Lower

(Base)
```

```
Θ

↓

Exact

(Both)
```

---

# Revision Checklist

- [ ] Asymptotic Analysis
- [ ] Big-O
- [ ] Big-Ω
- [ ] Big-Θ
- [ ] little-o
- [ ] little-ω
- [ ] Upper Bound
- [ ] Lower Bound
- [ ] Exact Bound

---

# Next Part

- Growth of Functions
- Constant Time O(1)
- Logarithmic Time O(log n)
- Linear Time O(n)
- Linearithmic Time O(n log n)
- Quadratic Time O(n²)
- Cubic Time O(n³)
- Exponential Time O(2ⁿ)
- Factorial Time O(n!)
- Complexity Comparison Chart

---

# 17. Growth of Functions 🟢 Foundation

## Definition

Growth of Functions describes how the running time of an algorithm increases as the input size (N) grows.

As N becomes very large, the growth rate determines whether an algorithm is practical.

---

## Why is Growth Important?

Consider two algorithms.

Algorithm A

```
O(n)
```

Algorithm B

```
O(n²)
```

For

```
n = 10
```

Difference is small.

```
10 operations

vs

100 operations
```

For

```
n = 1,000,000
```

Difference becomes huge.

```
1,000,000

vs

1,000,000,000,000
```

Therefore,

growth rate is more important than execution time.

---

# Growth Order (Fastest → Slowest)

```
O(1)

↓

O(log n)

↓

O(√n)

↓

O(n)

↓

O(n log n)

↓

O(n²)

↓

O(n³)

↓

O(2ⁿ)

↓

O(n!)
```

Always try to design algorithms closer to the top.

---

# 18. Constant Time — O(1)

## Definition

The number of operations remains constant regardless of input size.

Increasing N does not increase the work performed.

---

## Java Example

```java
int first = arr[0];
System.out.println(first);
```

Only one array access.

Time Complexity

```
O(1)
```

---

## Frequency Count

```
Read arr[0]

↓

1 operation
```

---

## Real-Life Example

Taking the first book from a stack.

No matter whether there are

```
10 books

or

1,000,000 books
```

the effort is the same.

---

## Recognition Pattern

Think **O(1)** when

- Accessing array by index
- Simple assignment
- Arithmetic operations
- HashMap lookup (average case)
- Stack push/pop (average case)
- Queue enqueue/dequeue (average case)

---

# 19. Logarithmic Time — O(log n)

## Definition

Each step reduces the problem size by a constant factor.

Usually,

```
Half

Half

Half

Half...
```

---

## Java Example

```java
while(n > 1){

    n /= 2;

}
```

---

## Example

```
1024

↓

512

↓

256

↓

128

↓

64

↓

32

↓

16

↓

8

↓

4

↓

2

↓

1
```

Only

```
10
```

steps.

---

## Recognition Pattern

Think **O(log n)** when

- Binary Search
- Divide by 2
- Balanced BST
- Heap operations
- Divide & Conquer

---

## Real-Life Example

Searching a word in a dictionary by repeatedly opening near the middle.

---

# 20. Square Root Time — O(√n)

## Definition

The algorithm performs approximately

```
√n
```

operations.

---

## Java Example

```java
for(int i = 1; i * i <= n; i++){

}
```

---

## Programming Connection

Used in

- Prime Checking
- Factor Finding
- Number Theory

---

## Recognition Pattern

Think **O(√n)** when

- Checking divisors
- Prime numbers
- Perfect squares

---

# 21. Linear Time — O(n)

## Definition

The running time grows directly with input size.

If input doubles,

work approximately doubles.

---

## Java Example

```java
for(int i = 0; i < n; i++){

    System.out.println(arr[i]);

}
```

---

## Frequency Count

Loop executes

```
n
```

times.

---

## Recognition Pattern

Think **O(n)** when

- Traverse array
- Traverse linked list
- Single loop
- Count elements
- Find maximum
- Linear Search

---

## Real-Life Example

Checking every student in a classroom one by one.

---

# 22. Linearithmic Time — O(n log n)

## Definition

Combination of

```
Linear

×

Logarithmic
```

Usually appears in efficient sorting algorithms.

---

## Common Algorithms

- Merge Sort
- Heap Sort
- Average Case Quick Sort

---

## Recognition Pattern

Think **O(n log n)** when

- Divide array
- Sort data
- Merge results
- Heap operations on every element

---

# 23. Quadratic Time — O(n²)

## Definition

Two nested loops where both depend on N.

---

## Java Example

```java
for(int i = 0; i < n; i++){

    for(int j = 0; j < n; j++){

    }

}
```

---

## Frequency Count

```
n × n

=

n²
```

---

## Programming Connection

Used in

- Bubble Sort
- Selection Sort
- Pair comparison
- Brute Force

---

## Recognition Pattern

Think **O(n²)** when

- Two nested loops
- Compare every pair
- Matrix traversal (n × n)

---

# 24. Cubic Time — O(n³)

## Definition

Three nested loops.

---

## Java Example

```java
for(int i = 0; i < n; i++)
    for(int j = 0; j < n; j++)
        for(int k = 0; k < n; k++){

        }
```

---

## Programming Connection

Used in

- Floyd-Warshall Algorithm
- Matrix Multiplication (basic implementation)

---

## Recognition Pattern

Think **O(n³)** when

- Three dependent nested loops
- Triple comparisons

---

# 25. Exponential Time — O(2ⁿ)

## Definition

Each decision branches into two possibilities.

---

## Programming Connection

Used in

- Backtracking
- Subset Generation
- Recursive Brute Force

---

## Recognition Pattern

Keywords

- Include / Exclude
- All subsets
- Every possibility

---

# 26. Factorial Time — O(n!)

## Definition

Generate every possible arrangement.

---

## Programming Connection

Used in

- Permutations
- Travelling Salesman (Brute Force)
- Exhaustive Search

---

## Recognition Pattern

Keywords

- All permutations
- Every arrangement
- Generate all orders

---

# Complexity Comparison Table

| Complexity | Practical for Large Input? | Common Example |
|------------|----------------------------|----------------|
| O(1) | ✅ Excellent | Array Index |
| O(log n) | ✅ Excellent | Binary Search |
| O(√n) | ✅ Very Good | Prime Check |
| O(n) | ✅ Good | Array Traversal |
| O(n log n) | ✅ Good | Merge Sort |
| O(n²) | ⚠ Small Input | Bubble Sort |
| O(n³) | ❌ Rarely | Floyd-Warshall |
| O(2ⁿ) | ❌ Very Slow | Backtracking |
| O(n!) | ❌ Extremely Slow | Permutations |

---

# Memory Trick

```
O(1)

↓

Excellent

↓

O(log n)

↓

Very Fast

↓

O(n)

↓

Acceptable

↓

O(n log n)

↓

Efficient

↓

O(n²)

↓

Use Carefully

↓

O(n³)

↓

Avoid if Possible

↓

O(2ⁿ)

↓

Only Small Inputs

↓

O(n!)

↓

Very Small Inputs
```

---

# Common Mistakes

❌ Assuming every nested loop is O(n²).

(The loop limits matter.)

❌ Confusing O(log n) with O(n).

❌ Assuming matrix traversal is always O(n²).

(It depends on rows × columns.)

❌ Ignoring input constraints before choosing an algorithm.

---

# Interview Questions

Easy

- Why is Binary Search O(log n)?
- Why is Array Traversal O(n)?

Medium

- Why is Merge Sort O(n log n)?
- Difference between O(n²) and O(n log n)?

Advanced

- When is O(2ⁿ) acceptable?
- Why is O(n!) impractical?

---

# Revision Checklist

- [ ] Growth of Functions
- [ ] O(1)
- [ ] O(log n)
- [ ] O(√n)
- [ ] O(n)
- [ ] O(n log n)
- [ ] O(n²)
- [ ] O(n³)
- [ ] O(2ⁿ)
- [ ] O(n!)

---

# Next Part

- Rules for Finding Time Complexity
- Loop Analysis
- Nested Loop Analysis
- Consecutive Loops
- Dependent vs Independent Loops
- Recursion Complexity
- Binary Search Analysis
- Two Pointer Analysis
- Sliding Window Analysis

---

# 27. Rules for Finding Time Complexity 🟢 Foundation

## Goal

Instead of memorizing complexity, learn how to **derive** it from code.

Whenever you see a new algorithm, analyze it using these rules.

---

# Rule 1: Simple Statements

Every simple statement executes once.

Examples

```java
int a = 10;

a++;

System.out.println(a);
```

Time Complexity

```
O(1)
```

---

# Rule 2: Consecutive Statements

Add their complexities.

Example

```java
int a = 10;

for(int i = 0; i < n; i++){
    System.out.println(i);
}

System.out.println(a);
```

Complexity

```
O(1)

+

O(n)

+

O(1)

=

O(n)
```

Always keep the dominant term.

---

# Rule 3: Single Loop

Example

```java
for(int i = 0; i < n; i++){

}
```

Iterations

```
n
```

Time Complexity

```
O(n)
```

---

# Rule 4: Nested Loops

Example

```java
for(int i = 0; i < n; i++){

    for(int j = 0; j < n; j++){

    }

}
```

Outer Loop

```
n
```

Inner Loop

```
n
```

Total

```
n × n

=

O(n²)
```

---

# Rule 5: Three Nested Loops

Example

```java
for(int i = 0; i < n; i++)
    for(int j = 0; j < n; j++)
        for(int k = 0; k < n; k++){

        }
```

Complexity

```
n × n × n

=

O(n³)
```

---

# Rule 6: Independent Loops

Example

```java
for(int i = 0; i < n; i++){

}

for(int j = 0; j < n; j++){

}
```

Complexity

```
O(n)

+

O(n)

=

O(2n)

↓

O(n)
```

---

# Rule 7: Different Input Sizes

Example

```java
for(int i = 0; i < n; i++){

}

for(int j = 0; j < m; j++){

}
```

Complexity

```
O(n + m)
```

Do NOT simplify to

```
O(n)
```

because

```
n ≠ m
```

---

# Rule 8: Nested Loops with Different Sizes

```java
for(int i = 0; i < n; i++){

    for(int j = 0; j < m; j++){

    }

}
```

Complexity

```
O(n × m)
```

---

# Rule 9: Dependent Nested Loops

Example

```java
for(int i = 0; i < n; i++){

    for(int j = i; j < n; j++){

    }

}
```

Iterations

```
n

+

(n-1)

+

(n-2)

+

...

+

1
```

Formula

```
n(n+1)

/

2
```

Ignoring constants

```
O(n²)
```

---

# Rule 10: Logarithmic Loops

Example

```java
while(n > 1){

    n /= 2;

}
```

Complexity

```
O(log n)
```

---

Another Example

```java
for(int i = 1; i < n; i *= 2){

}
```

Values

```
1

2

4

8

16

...
```

Complexity

```
O(log n)
```

---

# Rule 11: Square Root Loops

```java
for(int i = 1; i * i <= n; i++){

}
```

Iterations

```
√n
```

Complexity

```
O(√n)
```

---

# Rule 12: Divide & Conquer

Problem Size

```
n

↓

n/2

↓

n/4

↓

n/8
```

Number of divisions

```
log₂n
```

Complexity

```
O(log n)
```

---

# Rule 13: Binary Search Analysis

Binary Search removes half the search space in every iteration.

Example

```
1024

↓

512

↓

256

↓

128

↓

...

↓

1
```

Iterations

```
log₂1024

=

10
```

Complexity

```
O(log n)
```

---

# Rule 14: Two Pointer Technique

Example

```java
while(left < right){

    left++;

    right--;

}
```

Both pointers together move at most

```
n
```

positions.

Complexity

```
O(n)
```

---

# Rule 15: Sliding Window

Example

```java
while(right < n){

    right++;

    while(condition){

        left++;

    }

}
```

Although there are two loops,

each pointer moves at most

```
n
```

times.

Complexity

```
O(n)
```

---

# Rule 16: Matrix Traversal

Example

```java
for(int i = 0; i < rows; i++){

    for(int j = 0; j < cols; j++){

    }

}
```

Complexity

```
O(rows × cols)
```

If

```
rows = cols = n
```

Then

```
O(n²)
```

---

# Pattern Recognition

| Code Pattern | Complexity |
|--------------|------------|
| Simple Statement | O(1) |
| Single Loop | O(n) |
| Two Independent Loops | O(n + m) |
| Two Nested Loops | O(n × m) |
| Three Nested Loops | O(n³) |
| Divide by 2 | O(log n) |
| Multiply by 2 | O(log n) |
| Square Root Loop | O(√n) |
| Two Pointers | O(n) |
| Sliding Window | O(n) |
| Matrix Traversal | O(rows × cols) |

---

# Common Mistakes

❌ Every nested loop is O(n²).

Wrong.

Loop limits determine the complexity.

---

❌ Two loops always mean O(n²).

Wrong.

Independent loops are added, not multiplied.

---

❌ Sliding Window has nested loops, so it is O(n²).

Wrong.

Each pointer moves at most n times.

---

❌ Matrix traversal is always O(n²).

Wrong.

For a matrix of

```
m × n
```

complexity is

```
O(m × n)
```

---

# Interview Questions

Easy

- Complexity of a single loop.
- Complexity of nested loops.
- Complexity of Binary Search.

Medium

- Difference between O(n + m) and O(n × m).
- Why is Sliding Window O(n)?

Advanced

- Analyze dependent nested loops.
- Analyze mixed logarithmic and linear loops.

---

# Revision Checklist

- [ ] Single Statement
- [ ] Consecutive Statements
- [ ] Single Loop
- [ ] Nested Loops
- [ ] Independent Loops
- [ ] Different Input Sizes
- [ ] Dependent Loops
- [ ] Logarithmic Loops
- [ ] Square Root Loops
- [ ] Binary Search
- [ ] Two Pointers
- [ ] Sliding Window
- [ ] Matrix Traversal

---

# Next Part

- Space Complexity
- Auxiliary Space
- Stack Memory
- Heap Memory
- Function Call Stack
- Recursive Space Complexity
- In-place vs Out-of-place Algorithms

---

# 28. Space Complexity 🟢 Foundation

## Definition

Space Complexity measures the total memory required by an algorithm during execution.

It includes:

- Input Space
- Auxiliary Space
- Function Call Stack
- Dynamic Memory Allocation

---

## Formula

```
Space Complexity

=

Input Space

+

Auxiliary Space
```

---

## Why is it Important?

An algorithm may be fast but consume too much memory.

Example

Algorithm A

```
Time

O(n)

Space

O(n)
```

Algorithm B

```
Time

O(n)

Space

O(1)
```

Generally, Algorithm B is preferred because it uses less memory.

---

# Memory Types in Java

During execution, memory is mainly divided into:

```
JVM Memory

├── Stack Memory

└── Heap Memory
```

---

# 29. Stack Memory

## Definition

Stack Memory stores:

- Local Variables
- Method Parameters
- Method Calls
- Return Addresses

Memory is automatically allocated and deallocated.

---

## Characteristics

- Fast Access
- Limited Size
- LIFO (Last In, First Out)
- Automatically Managed

---

## Example

```java
void display() {
    int x = 10;
}
```

Variable

```
x
```

is stored in the Stack.

---

# Stack Frame

Each method call creates a new Stack Frame.

Example

```java
main()

↓

funA()

↓

funB()
```

Stack

```
+--------+
| funB() |
+--------+
| funA() |
+--------+
| main() |
+--------+
```

When `funB()` returns, its frame is removed.

---

# Stack Overflow

Occurs when too many stack frames are created.

Common Cause

- Infinite Recursion
- Deep Recursion

---

# 30. Heap Memory

## Definition

Heap Memory stores:

- Objects
- Arrays
- Strings (Objects)
- Collections
- Dynamic Data Structures

---

## Example

```java
int[] arr = new int[100];
```

Memory

```
Reference

↓

Stack

Actual Array

↓

Heap
```

---

## Characteristics

- Large Memory Area
- Slower than Stack
- Managed by Garbage Collector
- Shared Across Methods

---

# Stack vs Heap

| Feature | Stack | Heap |
|---------|--------|------|
| Stores | Local Variables | Objects & Arrays |
| Size | Smaller | Larger |
| Speed | Faster | Slower |
| Management | Automatic | Garbage Collector |
| Access | LIFO | Random |

---

# 31. Input Space

Memory required to store the input.

Example

```java
int[] arr = new int[n];
```

Input Space

```
O(n)
```

---

# 32. Auxiliary Space

## Definition

Extra memory used by the algorithm excluding the input.

---

## Example

```java
int sum = 0;
```

Auxiliary Space

```
O(1)
```

---

Example

```java
int[] temp = new int[n];
```

Auxiliary Space

```
O(n)
```

---

# Examples

## Example 1

```java
int max = arr[0];
```

Extra Variables

```
1
```

Auxiliary Space

```
O(1)
```

---

## Example 2

```java
int[] temp = new int[n];
```

Extra Array

```
n
```

Auxiliary Space

```
O(n)
```

---

## Example 3

```java
HashMap<Integer,Integer> map = new HashMap<>();
```

Worst Case

```
O(n)
```

---

## Example 4

```java
Stack<Integer> stack = new Stack<>();
```

Worst Case

```
O(n)
```

---

# 33. Recursive Space Complexity

Every recursive call creates a new Stack Frame.

---

Example

```java
factorial(n)
```

Call Stack

```
factorial(5)

↓

factorial(4)

↓

factorial(3)

↓

factorial(2)

↓

factorial(1)
```

Number of Frames

```
n
```

Space Complexity

```
O(n)
```

---

Example

Binary Search

Recursive Depth

```
log₂n
```

Space Complexity

```
O(log n)
```

---

# Recursive vs Iterative

| Approach | Time | Space |
|----------|------|-------|
| Iterative | O(n) | O(1) |
| Recursive | O(n) | O(n) |

Whenever possible, prefer iterative solutions if recursion does not simplify the logic.

---

# 34. In-place Algorithms

## Definition

Algorithms that use constant extra memory.

Auxiliary Space

```
O(1)
```

---

Examples

- Selection Sort
- Bubble Sort
- Insertion Sort
- Two Pointer Technique
- Reverse Array

---

# 35. Out-of-place Algorithms

Require additional memory.

Examples

- Merge Sort
- Counting Sort
- Prefix Arrays
- Clone Array

---

# Time vs Space Trade-off

Sometimes we use more memory to reduce execution time.

Example

Brute Force

```
Time

O(n²)

Space

O(1)
```

HashMap Solution

```
Time

O(n)

Space

O(n)
```

Example: Two Sum

---

# Programming Connection

Understanding Space Complexity helps in:

- Choosing data structures
- Optimizing memory usage
- Avoiding Stack Overflow
- Designing scalable applications

---

# Common Mistakes

❌ Counting input array as auxiliary space.

Auxiliary Space excludes the input.

---

❌ Ignoring recursion stack.

Every recursive call consumes stack memory.

---

❌ Assuming objects are stored in Stack.

Only references are stored in the Stack.
Objects themselves are stored in the Heap.

---

❌ Thinking Heap is always bad.

Heap enables dynamic memory allocation and is essential for objects, arrays, collections, and trees.

---

# Interview Questions

Easy

- Difference between Stack and Heap.
- What is Auxiliary Space?
- What is Input Space?

Medium

- Why does recursion use O(n) space?
- What is an In-place algorithm?

Advanced

- Explain the Time-Space Trade-off.
- Compare recursive and iterative solutions.

---

# Memory Tricks

Remember:

```
Stack

↓

Small

↓

Fast

↓

Method Calls
```

```
Heap

↓

Large

↓

Objects

↓

Arrays

↓

Collections
```

```
Auxiliary Space

=

Extra Memory

(Not Input)
```

---

# Revision Checklist

- [ ] Space Complexity
- [ ] Input Space
- [ ] Auxiliary Space
- [ ] Stack Memory
- [ ] Heap Memory
- [ ] Stack Frame
- [ ] Recursive Space
- [ ] In-place Algorithms
- [ ] Out-of-place Algorithms
- [ ] Time-Space Trade-off

---

# Next Part

- Amortized Analysis
- Recurrence Relations
- Divide and Conquer Analysis
- Master Theorem
- Complexity of Common DSA Algorithms

##Java memory Model
JVM Memory
├── Stack
│   ├── Local variables
│   ├── Method parameters
│   └── Object references
│
└── Heap
├── Objects
├── Arrays
├── Collections
└── String objects


---

# 36. Amortized Analysis 🟡 Intermediate

## Definition

Amortized Analysis measures the **average cost per operation over a sequence of operations**.

Some operations may be expensive, but they happen rarely.

Instead of analyzing a single operation, we analyze the total cost.

---

## Why Do We Need It?

Suppose an operation is usually fast but occasionally slow.

Example

```
1

1

1

100

1

1

100

1
```

Worst Case

```
100
```

Average

```
Much Smaller
```

Amortized Analysis tells us the average cost over many operations.

---

## Example: Dynamic Array (ArrayList)

Suppose the array capacity is

```
4
```

Elements

```
1

2

3

4
```

Now insert another element.

A new array of size

```
8
```

is created.

All existing elements are copied.

That insertion is expensive.

However,

this resizing happens only occasionally.

Average insertion cost

```
O(1)
```

Amortized.

---

## Programming Connection

Used in

- ArrayList
- Vector
- HashMap Rehashing
- Dynamic Arrays

---

# 37. Recurrence Relations 🟡 Intermediate

## Definition

A recurrence relation expresses the running time of a recursive algorithm in terms of smaller inputs.

General Form

```
T(n)

=

Work Done

+

Recursive Calls
```

---

## Example 1

```java
fun(n){

    fun(n-1);

}
```

Recurrence

```
T(n)

=

T(n-1)

+

1
```

Complexity

```
O(n)
```

---

## Example 2

Binary Search

```java
binarySearch(){

    binarySearch(n/2);

}
```

Recurrence

```
T(n)

=

T(n/2)

+

1
```

Complexity

```
O(log n)
```

---

## Example 3

Merge Sort

```
Divide

↓

Two Recursive Calls

↓

Merge
```

Recurrence

```
T(n)

=

2T(n/2)

+

n
```

Complexity

```
O(n log n)
```

---

# Common Recurrence Relations

| Recurrence | Complexity |
|------------|------------|
| T(n)=T(n−1)+1 | O(n) |
| T(n)=T(n−1)+n | O(n²) |
| T(n)=T(n/2)+1 | O(log n) |
| T(n)=T(n/2)+n | O(n) |
| T(n)=2T(n/2)+n | O(n log n) |
| T(n)=2T(n−1) | O(2ⁿ) |

---

# 38. Divide and Conquer Analysis

## Definition

Divide a problem into smaller subproblems.

Solve them recursively.

Combine the results.

---

## Three Steps

```
Divide

↓

Conquer

↓

Combine
```

---

## Examples

- Binary Search
- Merge Sort
- Quick Sort
- Strassen Matrix Multiplication

---

## Recognition Pattern

Keywords

- Divide into halves
- Recursively solve
- Merge results

---

# 39. Master Theorem 🔴 Advanced

## Purpose

Master Theorem provides a quick way to solve recurrence relations of the form

```
T(n)

=

aT(n/b)

+

f(n)
```

where

```
a

=

Number of recursive calls

b

=

Reduction factor

f(n)

=

Extra work
```

---

# Case 1

If

```
f(n)

is smaller than

n^(log_b a)
```

Then

```
T(n)

=

O(n^(log_b a))
```

---

## Example

```
T(n)

=

2T(n/2)

+

1
```

Complexity

```
O(n)
```

---

# Case 2

If

```
f(n)

=

n^(log_b a)
```

Then

```
T(n)

=

O(n^(log_b a) log n)
```

---

## Example

```
T(n)

=

2T(n/2)

+

n
```

Merge Sort

Complexity

```
O(n log n)
```

---

# Case 3

If

```
f(n)

is larger than

n^(log_b a)
```

Then

```
T(n)

=

O(f(n))
```

(Regularity condition must hold.)

---

# Programming Connection

Master Theorem is mainly used for

- Merge Sort
- Divide & Conquer
- Advanced Algorithms
- Competitive Programming

---

# 40. Complexity of Common DSA Algorithms

| Algorithm | Time | Space |
|-----------|------|-------|
| Linear Search | O(n) | O(1) |
| Binary Search | O(log n) | O(1) Iterative / O(log n) Recursive |
| Bubble Sort | O(n²) | O(1) |
| Selection Sort | O(n²) | O(1) |
| Insertion Sort | O(n²) | O(1) |
| Merge Sort | O(n log n) | O(n) |
| Quick Sort (Average) | O(n log n) | O(log n) |
| Quick Sort (Worst) | O(n²) | O(n) |
| Heap Sort | O(n log n) | O(1) |
| BFS | O(V + E) | O(V) |
| DFS | O(V + E) | O(V) |
| Dijkstra (Heap) | O((V + E) log V) | O(V) |
| Union Find | Nearly O(1) (Amortized) | O(n) |

---

# Choosing the Right Algorithm

| Input Size | Preferred Complexity |
|------------|----------------------|
| n ≤ 20 | O(2ⁿ), O(n!) possible |
| n ≤ 100 | O(n³) acceptable |
| n ≤ 1,000 | O(n²) acceptable |
| n ≤ 100,000 | O(n log n) or O(n) |
| n ≥ 1,000,000 | O(n) or O(log n) |

*These are general competitive programming guidelines. Actual limits depend on the problem and constant factors.*

---

# Common Mistakes

❌ Confusing worst-case with amortized complexity.

❌ Applying the Master Theorem to recurrences that do not match its required form.

❌ Ignoring recursion stack space.

❌ Assuming every recursive algorithm is O(log n).

---

# Interview Questions

Easy

- What is Amortized Analysis?
- Give an example of a dynamic array.

Medium

- Write the recurrence for Binary Search.
- Write the recurrence for Merge Sort.

Advanced

- Explain the Master Theorem.
- Why is Merge Sort O(n log n)?

---

# Revision Checklist

- [ ] Amortized Analysis
- [ ] Dynamic Array Resizing
- [ ] Recurrence Relations
- [ ] Divide and Conquer
- [ ] Master Theorem
- [ ] Common DSA Complexities

---

# Next Part

- Complexity Recognition Patterns
- Time Complexity Cheat Sheet
- Space Complexity Cheat Sheet
- 50+ Complexity Examples
- Common Interview Traps
- Final Revision Notes

---

# 41. Complexity Recognition Patterns ⭐⭐⭐⭐⭐

One of the most important interview skills is recognizing the correct complexity by looking at the code or problem statement.

---

## Pattern 1 : Single Traversal

Keywords

- Traverse Array
- Visit Every Element
- Count
- Find Maximum
- Find Minimum

Usually

```
O(n)
```

Examples

- Maximum Element
- Minimum Element
- Linear Search
- Sum of Array

---

## Pattern 2 : Nested Traversal

Keywords

- Compare Every Pair
- All Pairs
- Matrix Traversal
- Double Loop

Usually

```
O(n²)
```

Examples

- Bubble Sort
- Selection Sort
- Brute Force Two Sum

---

## Pattern 3 : Divide by Two

Keywords

- Half
- Mid
- Binary Search
- Divide

Usually

```
O(log n)
```

Examples

- Binary Search
- Balanced BST
- Heap Height

---

## Pattern 4 : Divide & Conquer

Keywords

- Divide
- Merge
- Partition

Usually

```
O(n log n)
```

Examples

- Merge Sort
- Quick Sort (Average)
- Heap Sort

---

## Pattern 5 : Every Subset

Keywords

- Include / Exclude
- All Subsets
- Choice

Usually

```
O(2ⁿ)
```

Examples

- Subset Generation
- Backtracking

---

## Pattern 6 : Every Permutation

Keywords

- Arrange
- Permutation
- Every Order

Usually

```
O(n!)
```

Examples

- Permutations
- Travelling Salesman (Brute Force)

---

## Pattern 7 : Two Pointers

Keywords

- Left Pointer
- Right Pointer
- Opposite Ends

Usually

```
O(n)
```

Examples

- Reverse Array
- Two Sum (Sorted Array)
- Palindrome

---

## Pattern 8 : Sliding Window

Keywords

- Continuous Subarray
- Window
- Maximum Sum
- Minimum Length

Usually

```
O(n)
```

Examples

- Maximum Sum Subarray
- Longest Substring
- Minimum Window

---

## Pattern 9 : Hashing

Keywords

- Frequency
- Count
- Duplicate
- Lookup

Usually

```
Time : O(n)

Space : O(n)
```

Examples

- Two Sum
- Contains Duplicate
- Frequency Count

---

## Pattern 10 : Matrix Problems

Keywords

- Grid
- Matrix
- 2D Array

Usually

```
O(rows × cols)
```

---

# 42. Time Complexity Cheat Sheet

| Complexity | Typical Operations |
|------------|-------------------|
| O(1) | Array Index, Stack Push |
| O(log n) | Binary Search |
| O(√n) | Prime Checking |
| O(n) | Traversal |
| O(n log n) | Merge Sort |
| O(n²) | Nested Loops |
| O(n³) | Triple Loops |
| O(2ⁿ) | Backtracking |
| O(n!) | Permutations |

---

# 43. Space Complexity Cheat Sheet

| Operation | Space |
|-----------|-------|
| Variables | O(1) |
| Extra Array | O(n) |
| HashMap | O(n) |
| Stack | O(n) |
| Queue | O(n) |
| Recursion | Depends on Depth |
| Merge Sort | O(n) |
| Quick Sort | O(log n) Average |

---

# 44. Input Size Guide

| N | Preferred Complexity |
|---|----------------------|
| ≤ 20 | O(2ⁿ), O(n!) |
| ≤ 100 | O(n³) |
| ≤ 1000 | O(n²) |
| ≤ 100000 | O(n log n), O(n) |
| ≥ 1000000 | O(n), O(log n) |

---

# 45. Common Interview Traps

## Trap 1

Nested loops are NOT always

```
O(n²)
```

Example

```java
for(int i = 0; i < n; i++){
    for(int j = i; j < n; j++){

    }
}
```

Still

```
O(n²)
```

because total iterations are approximately

```
n(n+1)/2
```

---

## Trap 2

Nested loops can still be

```
O(n)
```

Example

```java
while(left < right){
    left++;
    right--;
}
```

Both pointers move at most

```
n
```

times.

---

## Trap 3

Two loops are not always multiplied.

```java
for(int i = 0; i < n; i++){}

for(int j = 0; j < n; j++){}
```

Complexity

```
O(n+n)

=

O(n)
```

---

## Trap 4

Matrix Traversal

```
Rows

×

Columns
```

Not always

```
O(n²)
```

---

## Trap 5

Binary Search

People often write

```
O(n/2)
```

Correct

```
O(log n)
```

---

# 46. Complexity Analysis Steps

Whenever you see a new algorithm, follow these steps:

### Step 1

Identify the input size.

```
N

M

Rows

Columns
```

---

### Step 2

Count loops.

---

### Step 3

Check if loops are

- Independent
- Nested
- Dependent

---

### Step 4

Check recursion.

---

### Step 5

Ignore constants.

---

### Step 6

Keep only the dominant term.

---

### Step 7

Calculate auxiliary space.

---

# 47. Complexity Analysis Checklist

Before submitting any solution, ask:

- [ ] Can this be reduced from O(n²) to O(n)?
- [ ] Can I use HashMap?
- [ ] Can I use Two Pointers?
- [ ] Can I use Sliding Window?
- [ ] Can I sort first?
- [ ] Can I use Binary Search?
- [ ] Can Prefix Sum help?
- [ ] Is recursion increasing space?
- [ ] Is an extra array necessary?

---

# 48. Complexity of Common Data Structures

| Data Structure | Access | Search | Insert | Delete |
|---------------|-------:|-------:|-------:|-------:|
| Array | O(1) | O(n) | O(n) | O(n) |
| ArrayList | O(1) | O(n) | O(1)* | O(n) |
| Linked List | O(n) | O(n) | O(1)** | O(1)** |
| Stack | O(1) | O(n) | O(1) | O(1) |
| Queue | O(1) | O(n) | O(1) | O(1) |
| HashMap | - | O(1)* | O(1)* | O(1)* |
| TreeMap | - | O(log n) | O(log n) | O(log n) |
| Priority Queue | - | O(n) | O(log n) | O(log n) |

\* Average case

\** If the node/reference is already known.

---

# 49. Chapter Summary

You learned

- Algorithm Analysis
- Time Complexity
- Space Complexity
- Frequency Count
- Asymptotic Analysis
- Big-O, Ω, Θ
- Growth of Functions
- Loop Analysis
- Space Complexity
- Stack & Heap
- Amortized Analysis
- Recurrence Relations
- Master Theorem
- Complexity Recognition
- Interview Tricks

---

# 50. Final Revision Checklist

## Fundamentals

- [ ] Algorithm
- [ ] Time Complexity
- [ ] Space Complexity
- [ ] Frequency Count

## Asymptotic Analysis

- [ ] Big-O
- [ ] Big-Ω
- [ ] Big-Θ

## Growth

- [ ] O(1)
- [ ] O(log n)
- [ ] O(√n)
- [ ] O(n)
- [ ] O(n log n)
- [ ] O(n²)
- [ ] O(n³)
- [ ] O(2ⁿ)
- [ ] O(n!)

## Analysis

- [ ] Loop Analysis
- [ ] Recursion Analysis
- [ ] Space Analysis

## Advanced

- [ ] Amortized Analysis
- [ ] Recurrence Relations
- [ ] Master Theorem

## Recognition

- [ ] Two Pointers
- [ ] Sliding Window
- [ ] Hashing
- [ ] Divide & Conquer
- [ ] Matrix Problems

---

# What's Next?

The next chapter is the most important one for your current Marquee Training:

```
05-Problem-Solving-Framework.md
```

This chapter will teach you **how to think**, not just how to code.

You'll learn:

- How to approach any DSA problem.
- How to convert a brute-force solution into an optimal one.
- Pattern recognition (Arrays, Sliding Window, Two Pointers, Prefix Sum, Hashing, etc.).
- Debugging strategies.
- Dry-run techniques.
- Interview thinking process.

After that, we'll build:

```
06-Arrays-Mastery.md
```

This will be your **largest handbook (300–500+ pages if printed)** and will cover everything from **1D Arrays to advanced interview patterns**, perfectly aligned with your current Marquee Training and placement preparation.


