# Problem Solving Framework

> **Category:** Programming Fundamentals
>
> **Chapter:** 5
>
> **Difficulty:** ⭐ Beginner → Advanced
>
> **Prerequisites:**
> - Number System
> - Mathematics for Programming
> - Mathematics for DSA
> - Time Complexity
>
> **Programming Language:** Java
>
> **Interview Importance:** ⭐⭐⭐⭐⭐

---

# Table of Contents

1. What is Problem Solving?
2. Why Most Beginners Can't Solve Problems
3. The Programming Mindset
4. Universal Problem Solving Framework
5. Read → Think → Plan → Code → Test
6. Brute Force Thinking
7. Optimization Thinking
8. Pattern Recognition
9. Dry Run
10. Debugging Mindset

---

# 1. What is Problem Solving?

## Definition

Problem Solving is the process of understanding a problem, designing an algorithm, implementing it in code, and verifying that it works correctly and efficiently.

Programming is **not typing code**.

Programming is

```
Thinking

↓

Planning

↓

Coding

↓

Testing

↓

Improving
```

---

# Real Interview Flow

```
Problem

↓

Understand

↓

Find Constraints

↓

Think

↓

Design Algorithm

↓

Write Code

↓

Dry Run

↓

Optimize

↓

Submit
```

This is how experienced programmers solve problems.

---

# 2. Why Most Beginners Cannot Solve Problems

Most beginners make this mistake

```
Problem

↓

Immediately Start Coding
```

Wrong.

Correct process

```
Problem

↓

Understand

↓

Think

↓

Find Pattern

↓

Write Algorithm

↓

Code

↓

Test
```

---

# Common Beginner Mistakes

❌ Start coding immediately.

❌ Ignore constraints.

❌ Never dry run.

❌ Copy solutions.

❌ Memorize code.

❌ Don't analyze time complexity.

❌ Panic after seeing a new problem.

---

# 3. Programming Mindset

A programmer should think like a detective.

Never ask

```
How do I code this?
```

Instead ask

```
What is actually happening?
```

Then ask

```
Can I make it simpler?
```

---

# Example

Problem

```
Find Maximum Element
```

Don't think

```
Which code?
```

Think

```
How would I do it manually?
```

Manual Thinking

```
Assume first element is maximum

↓

Compare every element

↓

Update maximum

↓

Done
```

Now convert that process into Java.

---

# 4. Universal Problem Solving Framework

Every DSA problem should follow the same framework.

```
Read Problem

↓

Understand Input

↓

Understand Output

↓

Find Constraints

↓

Solve Manually

↓

Find Brute Force

↓

Optimize

↓

Write Algorithm

↓

Code

↓

Dry Run

↓

Analyze Complexity

↓

Submit
```

Never skip steps.

---

# 5. Read the Problem Carefully

Read at least

```
2–3 Times
```

Understand

- What is given?
- What is required?
- Any special conditions?
- What should be returned?

---

# Example

Problem

```
Return the second largest element.
```

Don't assume.

Ask

- Can duplicates exist?
- Can numbers be negative?
- Is the array sorted?
- What if all elements are equal?

These questions prevent bugs.

---

# 6. Understand Input

Always identify

```
Input Type

↓

Input Size

↓

Input Constraints
```

Example

```java
int[] arr
```

Input

```
Array
```

Size

```
n
```

---

# Why Constraints Matter

Suppose

```
n = 20
```

Brute Force may be acceptable.

Suppose

```
n = 100000
```

Brute Force will likely fail.

Constraints guide your choice of algorithm.

---

# 7. Understand Output

Determine exactly what the problem expects.

Examples

```
Return Index

Return Value

Return Boolean

Return Array

Print Output
```

Many wrong answers happen because the output format is misunderstood.

---

# 8. Solve the Problem Manually

Before writing code,

solve a small example by hand.

Example

```
Array

5 2 8 1 6
```

Find Maximum

Manual Steps

```
Maximum = 5

↓

Compare 2

↓

Compare 8

Update

↓

Compare 1

↓

Compare 6

Done
```

If you cannot solve it manually,

you cannot write the algorithm.

---

# 9. Identify Inputs and Outputs

Create a simple table.

| Input | Output |
|--------|--------|
| Array | Maximum |
| String | Length |
| Matrix | Transpose |
| Linked List | Head Node |

This helps avoid confusion while coding.

---

# 10. Draw the Data

Visualize the data whenever possible.

Example

Array

```
Index

0 1 2 3 4

↓

5 2 8 1 6
```

Example

Matrix

```
1 2 3

4 5 6

7 8 9
```

Example

Linked List

```
10

↓

20

↓

30

↓

NULL
```

Visualization often reveals the solution.

---

# Common Mistakes

❌ Not reading the entire problem.

❌ Ignoring constraints.

❌ Guessing the expected output.

❌ Coding before understanding.

❌ Never testing with small examples.

---

# Interview Questions

Easy

- Why should you read the constraints?
- Why perform a dry run?

Medium

- Explain your problem-solving process.
- Why solve manually before coding?

---

# Revision Checklist

- [ ] Understand the Problem
- [ ] Identify Inputs
- [ ] Identify Outputs
- [ ] Read Constraints
- [ ] Solve Manually
- [ ] Visualize Data
- [ ] Think Before Coding

---

# Next Part

- Brute Force Thinking
- Better Approach
- Optimal Approach
- Pattern Recognition
- How to Discover Algorithms
- When to Use Sorting
- When to Use Hashing
- When to Use Two Pointers

---

# 11. Brute Force Thinking ⭐⭐⭐⭐⭐

## Definition

A Brute Force solution is the most straightforward approach that checks every possible answer.

The goal is:

```
Correctness

↓

Optimization Later
```

Never try to write the optimal solution first.

---

## Why Learn Brute Force?

Brute Force helps you

- Understand the problem
- Verify correctness
- Build intuition
- Find optimization opportunities

Even interviewers often ask candidates to explain the brute-force solution first.

---

## Example

Problem

```
Find Maximum Element
```

Brute Force Thinking

```
Look at every element

↓

Keep track of the largest
```

Complexity

```
Time : O(n)

Space : O(1)
```

---

## Another Example

Problem

```
Two Sum
```

Brute Force

```
Compare every pair

↓

Check if sum equals target
```

Nested loops

```
O(n²)
```

Later,

optimize using HashMap.

---

# Brute Force Checklist

Ask yourself

- Can I check every element?
- Can I check every pair?
- Can I generate every possibility?
- Will it always give the correct answer?

If yes,

you have a brute-force solution.

---

# 12. Better Approach

After writing the brute-force solution,

ask

```
Can I avoid repeating work?
```

---

## Example

Maximum Element

Brute Force

```
O(n)
```

Already optimal.

No improvement needed.

---

Example

Two Sum

Brute Force

```
O(n²)
```

Observation

```
Searching repeatedly
```

Optimization

```
HashMap
```

Complexity

```
O(n)
```

---

# Questions to Ask

- Can sorting help?
- Can hashing help?
- Can prefix sum help?
- Can binary search help?
- Can two pointers help?
- Can sliding window help?

---

# 13. Optimal Solution

The optimal solution is the best balance between

- Time
- Space
- Simplicity

---

Example

Reverse Array

Brute Force

```
Extra Array

↓

O(n) Space
```

Optimal

```
Swap

↓

Two Pointers

↓

O(1) Space
```

---

# Optimization Process

Always follow

```
Brute Force

↓

Better

↓

Optimal
```

Never jump directly to Optimal.

---

# 14. Pattern Recognition ⭐⭐⭐⭐⭐

The biggest skill in DSA is recognizing patterns.

Most problems are variations of known patterns.

---

## Common Array Patterns

| Problem Statement | Pattern |
|-------------------|---------|
| Find Maximum | Traversal |
| Find Minimum | Traversal |
| Reverse Array | Two Pointers |
| Check Palindrome | Two Pointers |
| Pair Sum | Two Pointers / HashMap |
| Maximum Subarray Sum | Kadane |
| Continuous Subarray | Sliding Window |
| Frequency Count | HashMap |
| Missing Number | Math / XOR |
| Prefix Queries | Prefix Sum |

---

# How to Recognize a Pattern

Read the keywords.

Example

```
Continuous

↓

Sliding Window
```

```
Sorted

↓

Binary Search

↓

Two Pointers
```

```
Frequency

↓

HashMap
```

```
Maximum

↓

Traversal
```

```
All Pairs

↓

Nested Loops
```

```
Matrix

↓

2D Traversal
```

---

# 15. Observation Skill

Optimization comes from observations.

Example

```
Sorted Array
```

Observation

```
Elements are already ordered.
```

Possible techniques

- Binary Search
- Two Pointers

---

Example

```
Repeated Sum Queries
```

Observation

```
Recalculating every time.
```

Optimization

```
Prefix Sum
```

---

Example

```
Repeated Lookup
```

Observation

Searching again and again.

Optimization

```
HashMap
```

---

# 16. Dry Run ⭐⭐⭐⭐⭐

Dry Run means executing the algorithm manually before running the code.

Always use a small example.

Example

```
Array

5 3 8 1
```

Trace every variable.

```
max = 5

↓

Compare 3

↓

Compare 8

↓

Update

↓

Compare 1
```

Expected

```
8
```

---

## Dry Run Checklist

Track

- Variables
- Loop Index
- Pointer Positions
- Current Answer
- Conditions

---

# 17. Edge Cases

Every problem should be tested with edge cases.

Examples

Empty Array

```
[]
```

Single Element

```
[5]
```

Duplicates

```
[2,2,2]
```

Negative Numbers

```
[-5,-2,-9]
```

Already Sorted

```
1 2 3 4
```

Reverse Sorted

```
5 4 3 2
```

Large Values

```
Integer.MAX_VALUE
```

---

# Common Mistakes

❌ Jumping directly to optimization.

❌ Never writing brute force.

❌ Ignoring edge cases.

❌ Not performing a dry run.

❌ Memorizing code without understanding the pattern.

---

# Interview Questions

Easy

- What is Brute Force?
- Why do we write it first?

Medium

- How do you optimize an algorithm?
- What is Pattern Recognition?

Advanced

- Explain your approach from brute force to optimal.
- How do you identify the correct algorithm?

---

# Revision Checklist

- [ ] Brute Force
- [ ] Better Approach
- [ ] Optimal Approach
- [ ] Pattern Recognition
- [ ] Observation Skill
- [ ] Dry Run
- [ ] Edge Cases

---

# Next Part

- Debugging Framework
- How to Read Constraints
- Choosing the Correct Data Structure
- Choosing the Correct Algorithm
- Decision Tree for DSA Problems
- Interview Thinking Process

---

# 18. Debugging Framework ⭐⭐⭐⭐⭐

## Definition

Debugging is the process of finding, understanding, and fixing errors in a program.

A good programmer spends more time understanding bugs than randomly changing code.

---

# Types of Errors

## 1. Syntax Error

The program cannot compile.

Example

```java
int a =
```

Compiler shows an error.

---

## 2. Runtime Error

Program starts but crashes during execution.

Examples

- ArrayIndexOutOfBoundsException
- NullPointerException
- ArithmeticException
- StackOverflowError

---

## 3. Logical Error

Program runs successfully but produces the wrong output.

Example

Finding the smallest element while intending to find the largest.

These are the most common errors in DSA.

---

# Debugging Process

```
Understand Problem

↓

Read Error

↓

Locate Bug

↓

Understand Cause

↓

Fix

↓

Test Again
```

Never change multiple lines at once.

Fix one issue and test again.

---

# Debugging Checklist

Before changing code, ask:

- Is the input correct?
- Is the loop condition correct?
- Are array indices valid?
- Is the variable initialized?
- Is the condition correct?
- Does the loop terminate?
- Is the returned value correct?

---

# 19. Reading Constraints

Constraints determine which algorithm is feasible.

Example

```
1 ≤ n ≤ 100
```

Brute Force may be acceptable.

---

Example

```
1 ≤ n ≤ 100000
```

Need an O(n) or O(n log n) solution.

---

Example

```
1 ≤ n ≤ 1000000
```

Prefer O(n) or O(log n).

---

# Constraint Cheat Sheet

| Input Size | Recommended Complexity |
|------------|------------------------|
| ≤ 20 | O(2ⁿ), O(n!) |
| ≤ 100 | O(n³) |
| ≤ 1000 | O(n²) |
| ≤ 100000 | O(n log n), O(n) |
| ≥ 1000000 | O(n), O(log n) |

---

# 20. Choosing the Right Data Structure

Before coding, ask:

```
How should I store the data?
```

---

## Array

Use when

- Fixed size
- Index access required

---

## ArrayList

Use when

- Dynamic size
- Frequent additions

---

## HashMap

Use when

- Fast lookup
- Frequency counting
- Key-value mapping

---

## HashSet

Use when

- Unique elements
- Fast membership check

---

## Stack

Use when

- LIFO
- Undo operations
- Parentheses
- Next Greater Element

---

## Queue

Use when

- FIFO
- BFS
- Scheduling

---

## Deque

Use when

- Insert/remove from both ends
- Sliding Window

---

## Priority Queue (Heap)

Use when

- Smallest/Largest element repeatedly
- Top K problems

---

# 21. Choosing the Right Algorithm

Use the problem statement to identify the pattern.

| Keywords | Pattern |
|----------|----------|
| Sorted Array | Binary Search / Two Pointers |
| Continuous Subarray | Sliding Window |
| Maximum / Minimum | Traversal |
| Frequency | HashMap |
| Prefix Queries | Prefix Sum |
| Interval Problems | Sorting |
| Matrix | 2D Traversal |
| Shortest Path | BFS / Dijkstra |
| Tree | DFS / BFS |
| Graph Connectivity | DFS / BFS / Union Find |

---

# 22. DSA Decision Tree

```
Start

↓

Array?

↓

Sorted?

↓

Yes

↓

Binary Search

↓

No

↓

Need Pair?

↓

Yes

↓

HashMap

↓

Sorted?

↓

Two Pointers

↓

Need Continuous Subarray?

↓

Sliding Window

↓

Need Repeated Range Sum?

↓

Prefix Sum

↓

Need Frequency?

↓

HashMap

↓

Need Maximum Subarray?

↓

Kadane's Algorithm
```

---

# 23. Interview Thinking Process

Interviewers are interested in **how you think**, not just whether you get the answer.

A strong approach is:

### Step 1

Restate the problem in your own words.

### Step 2

Ask clarifying questions.

Examples

- Can duplicates exist?
- Can numbers be negative?
- Is the array sorted?
- What are the constraints?

### Step 3

Explain the brute-force approach.

### Step 4

Analyze its complexity.

### Step 5

Discuss observations.

### Step 6

Present the optimized approach.

### Step 7

Write clean code.

### Step 8

Dry run with a sample input.

### Step 9

Mention time and space complexity.

---

# 24. Daily Problem Solving Routine

For every DSA problem:

```
Read Problem

↓

Identify Input & Output

↓

Read Constraints

↓

Solve Manually

↓

Write Brute Force

↓

Analyze Complexity

↓

Find Observation

↓

Choose Pattern

↓

Optimize

↓

Code

↓

Dry Run

↓

Edge Cases

↓

Submit

↓

Review Mistakes
```

---

# Common Mistakes

❌ Starting to code immediately.

❌ Ignoring constraints.

❌ Choosing the wrong data structure.

❌ Forgetting edge cases.

❌ Never analyzing time and space complexity.

❌ Memorizing solutions instead of understanding patterns.

---

# Interview Questions

Easy

- What is debugging?
- What are the three types of errors?

Medium

- How do constraints influence your solution?
- Why is choosing the right data structure important?

Advanced

- Walk through your approach for solving a new problem.
- How do you optimize a brute-force solution?

---

# Final Problem Solving Checklist

Before coding

- [ ] Read the problem carefully
- [ ] Understand the input
- [ ] Understand the output
- [ ] Read constraints
- [ ] Solve manually
- [ ] Identify the pattern

While coding

- [ ] Write clean code
- [ ] Use meaningful variable names
- [ ] Avoid unnecessary variables
- [ ] Handle edge cases

After coding

- [ ] Dry run
- [ ] Test sample cases
- [ ] Test edge cases
- [ ] Analyze time complexity
- [ ] Analyze space complexity

---

# Chapter Summary

You learned:

- Problem Solving Process
- Programming Mindset
- Brute Force Thinking
- Better vs Optimal Approach
- Pattern Recognition
- Dry Run
- Edge Cases
- Debugging
- Reading Constraints
- Choosing Data Structures
- Choosing Algorithms
- Interview Thinking Process

---

# Final Mindset

```
Don't Memorize Solutions

↓

Understand the Pattern

↓

Practice the Pattern

↓

Recognize the Pattern

↓

Apply the Pattern

↓

Become Independent
```

---

# Next Chapter

```
06-Arrays-Mastery.md
```

You will learn:

- Array fundamentals
- Memory representation
- 1D and 2D arrays
- Traversal patterns
- Brute-force to optimal solutions
- Prefix Sum
- Two Pointers
- Sliding Window
- Kadane's Algorithm
- Matrix algorithms
- Interview patterns
- 150+ array problems organized by pattern