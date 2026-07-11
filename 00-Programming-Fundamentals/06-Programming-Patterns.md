# Programming Patterns

Programming patterns are reusable approaches used to solve classes of problems.

Learning patterns is more valuable than memorizing individual questions.

---

## Table of Contents

📅 Updated Progress
✅ 1. Traversal
✅ 2. Simulation
✅ 3. Brute Force
✅ 4. Two Pointer
✅ 5. Sliding Window
✅ 6. Prefix Sum
✅ 7. Difference Array
✅ 8. Binary Search
✅ 9. Hashing
✅ 10. Sorting
⬜ 11. Greedy
⬜ 12. Divide & Conquer
⬜ 13. Recursion
⬜ 14. Backtracking
⬜ 15. Dynamic Programming
⬜ 16. Matrix
⬜ 17. Graph Traversal
⬜ 18. BFS
⬜ 19. DFS
⬜ 20. Heap
⬜ 21. Monotonic Stack
⬜ 22. Monotonic Queue
⬜ 23. Fast & Slow Pointer
⬜ 24. Merge Intervals
⬜ 25. Top K
⬜ 26. Bit Manipulation
⬜ 27. Union Find
⬜ 28. Trie
⬜ 29. Segment Tree
⬜ 30. Pattern Selection Guide

🟢 Phase 1 (Before Arrays)
1. Traversal
2. Simulation
3. Brute Force
4. Two Pointers
5. Sliding Window
6. Prefix Sum
7. Difference Array
8. Binary Search
9. Hashing
10. Sorting

These are enough to solve 70–80% of Array interview questions.

🟡 Phase 2 (After Arrays)
11. Greedy
12. Divide & Conquer
13. Recursion
14. Backtracking
15. Dynamic Programming
16. Matrix
    🔴 Phase 3 (After Data Structures)
17. Graph Traversal
18. BFS
19. DFS
20. Heap
21. Monotonic Stack
22. Monotonic Queue
23. Fast & Slow Pointer
24. Merge Intervals
25. Top K
26. Bit Manipulation
27. Union Find
28. Trie
29. Segment Tree
30. Pattern Selection Guide

This keeps the roadmap realistic while preserving the original order

📌 Pattern Relationship (Very Important)

Traversal
│
├── Find Maximum
├── Find Minimum
├── Count
└── Sum

Simulation
│
├── Rotate Array
├── Shift Elements
├── Matrix Rotation
└── Game Problems

Brute Force
│
├── Check Every Element
├── Check Every Pair
├── Check Every Subarray
└── Generate Every Possibility

Two Pointers
│
├── Reverse Array
├── Pair Sum
└── Move Zeros

Sliding Window
│
├── Maximum Sum
├── Longest Subarray
└── Minimum Window

Prefix Sum
│
├── Range Sum
├── Subarray Sum
└── Query Problems

# Programming Patterns

> **Category:** Programming Fundamentals
>
> **Difficulty:** ⭐ Beginner → Advanced
>
> **Programming Language:** Java
>
> **Interview Importance:** ⭐⭐⭐⭐⭐

---

# What is a Programming Pattern?

A Programming Pattern is a reusable problem-solving technique that can be applied to many different problems.

Instead of memorizing hundreds of solutions, learn a small number of patterns and identify which one fits the current problem.

Example

```
Problem A

↓

Two Pointers

Problem B

↓

Two Pointers

Problem C

↓

Two Pointers
```

Different problems,

Same pattern.

---

# Why Learn Patterns?

Without patterns

```
New Problem

↓

Panic

↓

No Idea
```

With patterns

```
Read Problem

↓

Recognize Pattern

↓

Apply Algorithm

↓

Solve
```

Patterns reduce thinking time and improve problem-solving speed.

---

# Pattern-Based Thinking

Never ask

```
Which code should I write?
```

Instead ask

```
Which pattern does this problem belong to?
```

Example

```
Continuous Subarray

↓

Sliding Window
```

```
Sorted Array

↓

Binary Search

↓

Two Pointers
```

```
Need Frequency Count

↓

HashMap
```

```
Need Maximum Element

↓

Traversal
```

---

# Pattern Learning Roadmap

```
Traversal

↓

Simulation

↓

Brute Force

↓

Two Pointers

↓

Sliding Window

↓

Prefix Sum

↓

Hashing

↓

Sorting

↓

Binary Search

↓

Recursion

↓

Backtracking

↓

Greedy

↓

Dynamic Programming

↓

Graphs
```

Always learn patterns from simple to advanced.

---

# Pattern Recognition Process

Whenever you read a problem, ask these questions in order.

```
What is the Input?

↓

What is the Output?

↓

What are the Constraints?

↓

Can I solve it manually?

↓

Which Pattern matches?
```

---

# The Complete Pattern List

## Foundation Patterns

- Traversal
- Simulation
- Brute Force

---

## Array Patterns

- Two Pointers
- Sliding Window
- Prefix Sum
- Difference Array
- Hashing
- Sorting
- Binary Search

---

## Recursion Patterns

- Divide and Conquer
- Recursion
- Backtracking

---

## Data Structure Patterns

- Stack
- Queue
- Heap
- Monotonic Stack
- Monotonic Queue

---

## Graph Patterns

- BFS
- DFS
- Union Find

---

## Advanced Patterns

- Greedy
- Dynamic Programming
- Trie
- Segment Tree

---

# Pattern Selection Flow

```
Start

↓

Array?

↓

Yes

↓

Sorted?

↓

Yes

↓

Binary Search

↓

Need Pair?

↓

Two Pointers

↓

Need Frequency?

↓

HashMap

↓

Need Continuous Subarray?

↓

Sliding Window

↓

Need Range Sum?

↓

Prefix Sum

↓

Need Maximum Subarray?

↓

Kadane

↓

Need Matrix?

↓

Matrix Traversal
```

---

# How This Handbook is Organized

Each pattern will follow the same structure.

```
Definition

↓

When to Use

↓

Recognition Keywords

↓

Brute Force

↓

Optimal Solution

↓

Complexity

↓

Common Problems

↓

Common Mistakes

↓

Interview Tips

↓

Java Template
```

This makes revision much easier.

---

# Common Beginner Mistakes

❌ Memorizing code.

❌ Ignoring problem constraints.

❌ Choosing a pattern without understanding the problem.

❌ Trying advanced patterns before mastering basic ones.

❌ Practicing random questions without grouping them by pattern.

---

# Golden Rule

```
Don't Memorize Questions

↓

Recognize Pattern

↓

Understand Logic

↓

Practice Pattern

↓

Solve New Problems
```

---

# Next Part

1. Traversal Pattern
2. Simulation Pattern
3. Brute Force Pattern

---

# 1. Traversal Pattern ⭐⭐⭐⭐⭐

## Definition

Traversal means visiting every element of a data structure exactly once in a systematic order.

It is the most fundamental programming pattern.

Without mastering traversal, it is difficult to solve Array, String, Matrix, Linked List, Tree, or Graph problems.

---

# Real-Life Analogy

Imagine checking every book on a bookshelf.

```
Book 1

↓

Book 2

↓

Book 3

↓

...

↓

Last Book
```

You visit each book once.

This is traversal.

---

# Where is Traversal Used?

Traversal is used in almost every data structure.

- Arrays
- Strings
- Matrices
- Linked Lists
- Trees
- Graphs
- HashMaps
- Sets

---

# Recognition Keywords

If the question contains words like

- Find
- Count
- Search
- Maximum
- Minimum
- Sum
- Average
- Product
- Frequency
- Check
- Print
- Display
- Traverse

then traversal is often required.

---

# General Traversal Process

```
Start

↓

Visit Current Element

↓

Process It

↓

Move to Next Element

↓

Repeat

↓

End
```

---

# Java Template (1D Array)

```java
for(int i = 0; i < arr.length; i++){

    // Process arr[i]

}
```

Enhanced For Loop

```java
for(int num : arr){

    // Process num

}
```

---

# Time Complexity

One complete traversal

```
O(n)
```

---

# Space Complexity

No extra memory

```
O(1)
```

---

# Common Problems

- Find Maximum
- Find Minimum
- Count Even Numbers
- Count Odd Numbers
- Sum of Elements
- Average
- Product
- Search an Element
- Reverse Printing
- Check Sorted Array

---

# Advantages

- Simple
- Fast
- Easy to implement
- Forms the base of many algorithms

---

# Limitations

Traversal only visits elements.

It does not automatically optimize searching, sorting, or repeated queries.

---

# Common Mistakes

❌ Forgetting the last element.

❌ Using the wrong loop boundary.

```java
i <= arr.length
```

Correct

```java
i < arr.length
```

❌ Modifying the array unintentionally while traversing.

---

# Pattern Recognition

If you need to

```
Visit Every Element Once
```

Use

```
Traversal Pattern
```

---

# Interview Questions

Easy

- Find the maximum element.
- Find the minimum element.
- Count positive numbers.
- Count negative numbers.

Medium

- Find the second largest element.
- Check if the array is sorted.
- Find leaders in an array.

---

# Revision Checklist

- [ ] Definition
- [ ] Recognition Keywords
- [ ] Java Template
- [ ] Complexity
- [ ] Common Problems
- [ ] Common Mistakes

---

# Next Pattern

Simulation Pattern

---

# 2. Simulation Pattern ⭐⭐⭐⭐☆

## Definition

Simulation means solving a problem by **imitating the real-world process step by step** according to the given rules.

Instead of finding a mathematical shortcut, we directly simulate the operations.

---

# Real-Life Analogy

Imagine a calculator.

```
5 + 3

↓

8

↓

×2

↓

16

↓

-4

↓

12
```

The calculator performs each operation one after another.

This is simulation.

---

# When to Use

Use the Simulation Pattern when:

- The problem describes a sequence of operations.
- Every operation changes the current state.
- The final answer depends on following all the rules.
- No direct formula exists.

---

# Recognition Keywords

Look for words like:

- Perform
- Simulate
- Execute
- Move
- Rotate
- Shift
- Update
- Follow Rules
- Process
- Game
- Robot
- Queue
- Commands
- Instructions

---

# General Process

```
Initial State

↓

Perform Operation

↓

Update State

↓

Perform Next Operation

↓

Repeat

↓

Final Answer
```

---

# Java Template

```java
for(int operation : operations){

    // Perform operation

    // Update current state

}
```

---

# Time Complexity

If every operation is processed once

```
O(n)
```

If nested simulation is required

```
O(n²)
```

depends on the problem.

---

# Space Complexity

Usually

```
O(1)
```

unless extra data structures are required.

---

# Common Problems

- Rotate Array
- Rotate Matrix
- Robot Movement
- Snake Game
- Tic Tac Toe
- Game of Life
- Queue Simulation
- Browser History
- Traffic Signal Simulation
- CPU Scheduling
- Elevator Simulation

---

# Example Thinking

Problem

```
Rotate array by one position.
```

Thinking

```
Store last element

↓

Shift every element

↓

Place last element at first position
```

This directly follows the required process.

---

Another Example

Problem

```
Move all zeros to the end.
```

One simulation approach

```
Traverse array

↓

Whenever zero is found

↓

Shift remaining elements

↓

Place zero at end
```

This works but is not optimal.

Later, we improve it using the Two Pointer Pattern.

---

# Advantages

- Easy to understand.
- Closely follows the problem statement.
- Good starting point before optimization.

---

# Limitations

- Can be slower than optimized approaches.
- May repeat unnecessary work.
- Sometimes uses extra memory.

---

# Optimization Clues

After writing a simulation, ask:

- Can I avoid repeated shifting?
- Can I avoid repeated traversal?
- Can Two Pointers help?
- Can HashMap help?
- Can Prefix Sum help?
- Can Sliding Window help?

---

# Common Mistakes

❌ Skipping steps.

❌ Updating variables in the wrong order.

❌ Forgetting boundary conditions.

❌ Incorrect index updates.

❌ Not handling the first or last element.

---

# Pattern Recognition

If the problem says

```
Do these operations

Step by Step
```

Think

```
Simulation Pattern
```

---

# Interview Questions

Easy

- Rotate Array by One
- Reverse Array
- Shift Elements

Medium

- Rotate Matrix
- Game Simulation
- Browser History

Advanced

- Robot Movement
- Snake Game
- CPU Scheduling Simulation

---

# Revision Checklist

- [ ] Definition
- [ ] Recognition Keywords
- [ ] General Process
- [ ] Java Template
- [ ] Time Complexity
- [ ] Space Complexity
- [ ] Common Problems
- [ ] Optimization Clues
- [ ] Common Mistakes

---

# Pattern Connection

Simulation

↓

Often Optimized Into

- Two Pointers
- Sliding Window
- HashMap
- Prefix Sum
- Binary Search

---

# Next Pattern

Brute Force Pattern

---

# 3. Brute Force Pattern ⭐⭐⭐⭐⭐

## Definition

Brute Force is the simplest and most straightforward approach to solving a problem.

It checks every possible solution until the correct answer is found.

The primary goal of Brute Force is **correctness**, not efficiency.

---

# Why Learn Brute Force?

Every optimized algorithm starts from a brute-force solution.

Learning brute force helps you:

- Understand the problem completely.
- Verify correctness.
- Discover optimization opportunities.
- Explain your thought process in interviews.

---

# Real-Life Analogy

Imagine finding a friend in a classroom.

```
Seat 1

↓

Seat 2

↓

Seat 3

↓

...

↓

Friend Found
```

You check every possibility.

This is Brute Force.

---

# When to Use

Use Brute Force when:

- No better idea comes initially.
- Input size is small.
- Need a baseline solution.
- Interviewer asks for the simplest approach first.

---

# Recognition Keywords

Problems involving:

- Every Element
- Every Pair
- Every Triplet
- Every Subarray
- Every Subsequence
- Every Combination
- Every Permutation
- Check All Possibilities

usually start with Brute Force.

---

# General Process

```
Generate Every Possible Answer

↓

Check Whether It Is Valid

↓

Keep the Best Answer

↓

Return Result
```

---

# General Java Templates

## Every Element

```java
for(int i = 0; i < n; i++){

}
```

Complexity

```
O(n)
```

---

## Every Pair

```java
for(int i = 0; i < n; i++){

    for(int j = i + 1; j < n; j++){

    }

}
```

Complexity

```
O(n²)
```

---

## Every Triplet

```java
for(int i = 0; i < n; i++){

    for(int j = i + 1; j < n; j++){

        for(int k = j + 1; k < n; k++){

        }

    }

}
```

Complexity

```
O(n³)
```

---

## Every Subarray

```java
for(int start = 0; start < n; start++){

    for(int end = start; end < n; end++){

        // Process subarray

    }

}
```

Generation Complexity

```
O(n²)
```

If processing each subarray takes O(n),

Total

```
O(n³)
```

---

# Brute Force Thinking Process

```
Problem

↓

Ignore Optimization

↓

Find Correct Solution

↓

Analyze Complexity

↓

Find Repeated Work

↓

Optimize
```

---

# Examples

## Example 1

Find Maximum

Brute Force

```
Visit every element.

Keep track of the maximum.
```

Time

```
O(n)
```

Already Optimal.

---

## Example 2

Two Sum

Brute Force

```
Check every pair.
```

Complexity

```
O(n²)
```

Optimization

```
HashMap

↓

O(n)
```

---

## Example 3

Maximum Subarray Sum

Brute Force

```
Generate every subarray.

↓

Calculate each sum.

↓

Find maximum.
```

Complexity

```
O(n³)
```

Optimization

```
Prefix Sum

↓

Kadane's Algorithm

↓

O(n)
```

---

## Example 4

Missing Number

Brute Force

```
For every number,

search entire array.
```

Complexity

```
O(n²)
```

Optimization

```
Hashing

or

Math Formula

or

XOR

↓

O(n)
```

---

# Optimization Questions

After writing Brute Force, ask:

- Am I repeating work?
- Can I store previous results?
- Can sorting help?
- Can hashing help?
- Can Two Pointers help?
- Can Sliding Window help?
- Can Prefix Sum help?
- Can Binary Search help?

---

# Advantages

- Very easy to implement.
- Almost always correct.
- Helps understand the problem.
- Good starting point.

---

# Disadvantages

- Slow for large inputs.
- May exceed time limits.
- Often repeats calculations.

---

# Common Problems

- Two Sum
- Three Sum
- Maximum Subarray
- Missing Number
- Pair Difference
- Subarray Sum
- Matrix Search
- Duplicate Elements

---

# Common Mistakes

❌ Trying to optimize before understanding the problem.

❌ Ignoring the brute-force solution.

❌ Assuming brute force is always bad.

Brute Force is often the first step toward the optimal algorithm.

---

# Pattern Recognition

If the problem requires checking

```
Every Possibility
```

Think

```
Brute Force Pattern
```

---

# Interview Tips

A strong interview answer follows this order:

```
Brute Force

↓

Complexity Analysis

↓

Observation

↓

Optimization

↓

Optimal Solution
```

Do not jump directly to the optimized solution unless specifically asked.

---

# Revision Checklist

- [ ] Definition
- [ ] Recognition Keywords
- [ ] General Process
- [ ] Java Templates
- [ ] Time Complexity
- [ ] Optimization Questions
- [ ] Advantages
- [ ] Disadvantages
- [ ] Common Problems
- [ ] Interview Tips

---

# Pattern Connections

Brute Force

↓

Can be optimized using

- Two Pointers
- Sliding Window
- Prefix Sum
- HashMap
- Binary Search
- Sorting
- Dynamic Programming
- Greedy

---

# Next Pattern

Two Pointer Pattern ⭐⭐⭐⭐⭐

---

# 4. Two Pointer Pattern ⭐⭐⭐⭐⭐

## Definition

The Two Pointer Pattern uses two indices (pointers) to traverse a data structure efficiently.

Instead of repeatedly traversing the same elements, two pointers move according to the problem's conditions.

This often reduces Time Complexity from

```
O(n²)

↓

O(n)
```

---

# Why Learn Two Pointers?

Two Pointers

- Reduces unnecessary comparisons.
- Eliminates repeated traversals.
- Saves time.
- Saves memory.
- Is one of the most frequently asked interview patterns.

---

# Real-Life Analogy

Imagine two people walking toward each other from opposite ends of a road.

```
A ---------------------- B

↓

Move Together

↓

Meet
```

Instead of one person walking the entire road twice.

---

# When to Use

Use Two Pointers when

- Array is sorted.
- Need to compare two elements.
- Need to reverse data.
- Need to partition elements.
- Need to remove duplicates.
- Need to move elements.
- Need pair-related problems.

---

# Recognition Keywords

If the problem contains

- Pair
- Two Sum
- Reverse
- Palindrome
- Sorted Array
- Remove Duplicates
- Move Zeros
- Partition
- Rearrange
- Swap
- Closest Pair

Think

```
Two Pointers
```

---

# Types of Two Pointers

## 1. Opposite Direction

Pointers

```
Left

↓

          Array

↑

Right
```

Used for

- Reverse Array
- Palindrome
- Two Sum (Sorted)
- Container With Most Water

---

## Java Template

```java
int left = 0;
int right = arr.length - 1;

while(left < right){

    // Process

    left++;

    right--;
}
```

---

## 2. Same Direction

Pointers move in the same direction.

```
Slow

↓

Fast

↓

Array
```

Used for

- Remove Duplicates
- Move Zeros
- Remove Element
- Stable Partition

---

## Java Template

```java
int slow = 0;

for(int fast = 0; fast < arr.length; fast++){

    // Process

}
```

---

## 3. Fast & Slow Pointer

Usually used in Linked Lists.

```
Slow → 1 Step

Fast → 2 Steps
```

Used for

- Detect Cycle
- Middle Node
- Happy Number

---

# General Process

```
Initialize Pointers

↓

Compare

↓

Update Answer

↓

Move Pointer(s)

↓

Repeat

↓

Finish
```

---

# Complexity

Most Two Pointer problems

Time

```
O(n)
```

Space

```
O(1)
```

---

# Example 1

Reverse Array

Brute Force

```
Extra Array

↓

O(n) Space
```

Two Pointers

```
Swap

↓

Move Inward
```

Time

```
O(n)
```

Space

```
O(1)
```

---

# Example 2

Palindrome

```
Compare

First

↓

Last

↓

Move

↓

Repeat
```

---

# Example 3

Move Zeros

```
Slow

↓

Next Position

Fast

↓

Traverse
```

Whenever Fast finds a non-zero element,

swap with Slow.

---

# Example 4

Remove Duplicates

Sorted Array

```
Slow

↓

Unique Position

Fast

↓

Traverse
```

---

# Example 5

Two Sum (Sorted)

```
Left + Right

↓

Too Small

↓

Move Left

↓

Too Large

↓

Move Right
```

---

# Advantages

- Fast
- Constant Extra Space
- Easy to Optimize
- Avoids Nested Loops

---

# Limitations

Works best when

- Data is sorted.
- Relative positions matter.

Not suitable for every problem.

---

# Common Problems

Easy

- Reverse Array
- Reverse String
- Palindrome
- Move Zeros
- Remove Element
- Remove Duplicates

Medium

- Two Sum II
- Container With Most Water
- Squares of Sorted Array
- Sort Colors
- Dutch National Flag

Hard

- Trapping Rain Water
- Three Sum
- Four Sum

---

# Common Mistakes

❌ Wrong pointer initialization.

❌ Forgetting to move a pointer.

❌ Moving the wrong pointer.

❌ Infinite loop.

❌ Using

```java
left <= right
```

when

```java
left < right
```

is required.

---

# Interview Tips

Always explain

Why did you move

```
Left?
```

or

```
Right?
```

Interviewers care about the reasoning.

---

# Pattern Recognition

Question asks

```
Find Pair

↓

Sorted

↓

Compare Ends
```

↓

Use

```
Two Pointers
```

---

# Related Patterns

Two Pointers

↓

Sliding Window

↓

Fast & Slow Pointer

↓

Partitioning

↓

Merge Arrays

---

# Revision Checklist

- [ ] Definition
- [ ] Opposite Direction
- [ ] Same Direction
- [ ] Fast & Slow
- [ ] Java Templates
- [ ] Complexity
- [ ] Common Problems
- [ ] Common Mistakes
- [ ] Interview Tips

---

⭐ Improvement for your handbook

I recommend adding this summary table immediately after the Two Pointer section because it makes revision much faster.

# Two Pointer Cheat Sheet

| Pattern | Pointer Direction | Common Problems | Time | Space |
|----------|-------------------|-----------------|------|-------|
| Opposite Direction | Left ↔ Right | Reverse Array, Palindrome, Two Sum II | O(n) | O(1) |
| Same Direction | Slow → Fast | Move Zeros, Remove Duplicates | O(n) | O(1) |
| Fast & Slow | Slow(1), Fast(2) | Linked List Cycle, Middle Node | O(n) | O(1) |

This cheat sheet will become very useful when you revise before interviews or placements.

# Next Pattern

Sliding Window Pattern ⭐⭐⭐⭐⭐

---

# 5. Sliding Window Pattern ⭐⭐⭐⭐⭐

## Definition

The Sliding Window Pattern is an optimization technique used to process **contiguous (continuous) subarrays or substrings** efficiently.

Instead of recalculating every subarray from scratch, a "window" slides across the data while updating the answer incrementally.

It often reduces the complexity from

```
O(n²)

↓

O(n)
```

---

# Why Learn Sliding Window?

Sliding Window helps to

- Avoid repeated calculations.
- Process contiguous elements efficiently.
- Solve many array and string problems.
- Reduce nested loops to a single traversal.

---

# When to Use

Use Sliding Window when the problem involves

- Continuous Subarray
- Continuous Substring
- Consecutive Elements
- Fixed-Length Window
- Variable-Length Window
- Maximum/Minimum Sum
- Longest/Shortest Subarray
- Count Subarrays

---

# Recognition Keywords

If the problem contains

- Continuous
- Contiguous
- Consecutive
- Subarray
- Substring
- Window
- Longest
- Shortest
- Maximum Sum
- Minimum Sum

Think

```
Sliding Window
```

---

# Types of Sliding Window

## 1. Fixed Size Window

Window size remains constant.

Example

```
Window Size = 3

1 2 3 4 5 6

↓

[1 2 3]

↓

[2 3 4]

↓

[3 4 5]

↓

[4 5 6]
```

---

## Used For

- Maximum Sum of Size K
- Average of Size K
- Count Windows
- Fixed-Length Problems

---

## Java Template

```java
int sum = 0;

for(int i = 0; i < k; i++)
    sum += arr[i];

int max = sum;

for(int i = k; i < arr.length; i++){

    sum += arr[i];

    sum -= arr[i-k];

    max = Math.max(max, sum);
}
```

---

# Complexity

Time

```
O(n)
```

Space

```
O(1)
```

---

# 2. Variable Size Window

Window size changes depending on the condition.

Example

```
Expand

↓

Condition Satisfied?

↓

Shrink

↓

Expand Again
```

---

## Used For

- Longest Substring
- Minimum Window
- Smallest Subarray
- Longest Unique Characters
- Fruit Into Baskets

---

## Java Template

```java
int left = 0;

for(int right = 0; right < arr.length; right++){

    // Expand Window

    while(condition){

        // Shrink Window

        left++;
    }

}
```

---

# General Process

```
Start

↓

Expand Window

↓

Check Condition

↓

Update Answer

↓

Shrink Window (if required)

↓

Repeat
```

---

# Example 1

Maximum Sum of Size K

Brute Force

```
Generate every subarray

↓

Calculate Sum

↓

Find Maximum
```

Complexity

```
O(n²)
```

Sliding Window

```
Remove First

↓

Add Next

↓

Update Sum
```

Complexity

```
O(n)
```

---

# Example 2

Longest Substring Without Repeating Characters

Window

```
Expand

↓

Duplicate Found

↓

Shrink

↓

Continue
```

---

# Example 3

Minimum Size Subarray Sum

```
Expand

↓

Sum >= Target

↓

Update Answer

↓

Shrink
```

---

# Advantages

- Eliminates repeated calculations.
- Linear time for many problems.
- Very memory efficient.
- Easy once understood.

---

# Limitations

Works only for

- Continuous subarrays
- Continuous substrings

Not useful for

- Random subsequences
- Non-contiguous selections

---

# Common Problems

Easy

- Maximum Sum of Size K
- Average of Size K

Medium

- Longest Substring Without Repeating Characters
- Minimum Size Subarray Sum
- Fruit Into Baskets
- Maximum Consecutive Ones

Hard

- Minimum Window Substring
- Sliding Window Maximum

---

# Common Mistakes

❌ Confusing Subarray with Subsequence.

❌ Forgetting to shrink the window.

❌ Incorrect left/right pointer updates.

❌ Updating the answer before checking the condition.

❌ Off-by-one errors.

---

# Interview Tips

Always identify

```
Fixed Size?

↓

or

↓

Variable Size?
```

Once identified,

the implementation becomes much easier.

---

# Pattern Recognition

Question contains

```
Continuous

↓

Subarray

↓

Longest

↓

Shortest

↓

Window
```

↓

Think

```
Sliding Window
```

---

# Pattern Connections

Sliding Window

↓

Two Pointers

↓

HashMap

↓

Deque

↓

Prefix Sum

---

# Revision Checklist

- [ ] Definition
- [ ] Fixed Window
- [ ] Variable Window
- [ ] Java Templates
- [ ] Complexity
- [ ] Common Problems
- [ ] Common Mistakes
- [ ] Interview Tips

---

# Sliding Window Cheat Sheet

| Type | Window Size | Common Problems | Time | Space |
|------|-------------|-----------------|------|-------|
| Fixed | Constant | Maximum Sum of K, Average | O(n) | O(1) |
| Variable | Changes | Longest/Shortest Subarray | O(n) | O(1) |

---

⭐ Important Connection (Add this after the chapter)

This is one of the most useful comparison tables in DSA.

# Two Pointers vs Sliding Window

| Feature | Two Pointers | Sliding Window |
|----------|--------------|----------------|
| Main Goal | Compare/Swap Elements | Process Continuous Range |
| Window Required? | ❌ No | ✅ Yes |
| Array Sorted? | Often Yes | Not Required |
| Continuous Elements? | Not Necessary | Required |
| Common Problems | Reverse, Pair Sum, Move Zeros | Maximum Sum, Longest Subarray |
| Time Complexity | O(n) | O(n) |

## Quick Decision Guide

Question asks...

Reverse Array?
→ Two Pointers

Palindrome?
→ Two Pointers

Pair Sum (Sorted)?
→ Two Pointers

Continuous Subarray?
→ Sliding Window

Maximum Sum of K?
→ Sliding Window

Longest Substring?
→ Sliding Window

This comparison is extremely valuable because beginners often confuse these two patterns. Understanding when to choose one over the other is a key interview skill.

# Next Pattern

Prefix Sum Pattern ⭐⭐⭐⭐⭐

---

# 6. Prefix Sum Pattern ⭐⭐⭐⭐⭐

## Definition

Prefix Sum is a preprocessing technique used to answer range sum queries efficiently.

Instead of calculating the sum repeatedly, we store cumulative sums in advance.

This reduces repeated calculations.

---

# Why Learn Prefix Sum?

Prefix Sum helps to

- Answer range sum queries quickly.
- Avoid recalculating sums.
- Optimize many subarray problems.
- Build the foundation for Difference Array and Fenwick Tree.

---

# When to Use

Use Prefix Sum when the problem involves

- Range Sum
- Sum Between Indices
- Multiple Sum Queries
- Continuous Subarray Sum
- Prefix Queries
- Cumulative Sum

---

# Recognition Keywords

If the problem contains

- Sum from L to R
- Range Sum
- Query
- Multiple Queries
- Continuous Sum
- Prefix
- Cumulative Sum

Think

```
Prefix Sum
```

---

# Idea

Instead of

```
1 + 2 + 3 + 4
```

again and again,

store

```
Index

0 1 2 3

Array

1 2 3 4

↓

Prefix

1 3 6 10
```

Now

```
Sum(1...3)

=

Prefix[3] - Prefix[0]

=

10 - 1

=

9
```

---

# Formula

```
prefix[0] = arr[0]

prefix[i] = prefix[i-1] + arr[i]
```

---

# Range Sum Formula

```
L == 0

↓

Answer = prefix[R]
```

Otherwise

```
Answer

=

prefix[R]

-

prefix[L-1]
```

---

# Java Template

## Build Prefix Array

```java
int[] prefix = new int[arr.length];

prefix[0] = arr[0];

for(int i = 1; i < arr.length; i++){

    prefix[i] = prefix[i-1] + arr[i];

}
```

---

## Range Sum

```java
if(left == 0){

    return prefix[right];

}

return prefix[right] - prefix[left-1];
```

---

# Complexity

Building Prefix

```
O(n)
```

Each Query

```
O(1)
```

Space

```
O(n)
```

---

# Example

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
Sum(1...3)

=

13 - 2

=

11
```

---

# Brute Force

For every query

```
Traverse

↓

Calculate Sum
```

Time

```
O(n)
```

per query.

---

# Prefix Sum

Preprocess once.

Every query

```
O(1)
```

---

# Advantages

- Very fast for multiple queries.
- Easy to implement.
- Eliminates repeated addition.
- Widely used in interviews.

---

# Limitations

Needs

```
O(n)
```

extra space.

Not useful when the array changes frequently.

---

# Common Problems

Easy

- Range Sum Query
- Running Sum
- Find Pivot Index

Medium

- Subarray Sum Equals K
- Continuous Subarray Sum
- Product Except Self (related idea)

Hard

- Count Range Sum
- Maximum Sum Rectangle

---

# Common Mistakes

❌ Forgetting the

```
left == 0
```

case.

❌ Wrong subtraction index.

❌ Building prefix incorrectly.

❌ Off-by-one errors.

---

# Interview Tips

Whenever multiple range sum queries appear,

think

```
Prefix Sum
```

before writing nested loops.

---

# Pattern Recognition

Question contains

```
Range Sum

↓

Multiple Queries

↓

Continuous Sum
```

↓

Use

```
Prefix Sum
```

---

# Pattern Connections

Prefix Sum

↓

Difference Array

↓

Sliding Window

↓

HashMap

↓

Dynamic Programming

---

# Revision Checklist

- [ ] Definition
- [ ] Formula
- [ ] Range Formula
- [ ] Java Template
- [ ] Complexity
- [ ] Common Problems
- [ ] Common Mistakes
- [ ] Interview Tips

---

# Prefix Sum Cheat Sheet

| Operation | Complexity |
|-----------|------------|
| Build Prefix | O(n) |
| Single Query | O(1) |
| Space | O(n) |

---
⭐ Important Comparison 
# Sliding Window vs Prefix Sum

| Feature | Sliding Window | Prefix Sum |
|----------|----------------|------------|
| Works On | Continuous Window | Range Sum |
| Window Size | Fixed / Variable | Not Required |
| Best For | Longest, Shortest, Maximum | Multiple Sum Queries |
| Extra Space | O(1) | O(n) |
| Time | O(n) | Build O(n), Query O(1) |

## Quick Decision Guide

Maximum Sum of Size K?
→ Sliding Window

Longest Subarray?
→ Sliding Window

Range Sum Query?
→ Prefix Sum

Many Sum Queries?
→ Prefix Sum

Subarray Sum Equals K?
→ Prefix Sum + HashMap

# Next Pattern

Difference Array Pattern

---

# 7. Difference Array Pattern ⭐⭐⭐⭐☆

## Definition

The Difference Array Pattern is an optimization technique used when there are **multiple range update operations** on an array.

Instead of updating every element in a range repeatedly, we record only where an update starts and where it ends. After processing all updates, we reconstruct the final array using Prefix Sum.

Difference Array is the opposite of Prefix Sum.

---

# Why Learn Difference Array?

Difference Array helps to

- Perform multiple range updates efficiently.
- Reduce repeated modifications.
- Optimize update queries.
- Build the foundation for advanced data structures like Fenwick Tree and Segment Tree.

---

# When to Use

Use Difference Array when the problem involves

- Multiple Range Updates
- Increment Values in a Range
- Decrement Values in a Range
- Batch Updates
- Offline Queries

---

# Recognition Keywords

If the problem contains

- Update Range
- Increment from L to R
- Decrement from L to R
- Multiple Updates
- Range Modification
- Apply Q Operations

Think

```
Difference Array
```

---

# Idea

Instead of updating every element,

record only the boundaries.

Example

Array

```
0 0 0 0 0
```

Operation

```
Add 5

Range

1...3
```

Instead of

```
0 5 5 5 0
```

Store

```
0 5 0 0 -5
```

After processing all updates,

take Prefix Sum.

Result

```
0 5 5 5 0
```

---

# Formula

Suppose

```
Update

L...R

by +X
```

Then

```
diff[L] += X

diff[R+1] -= X
```

(if R+1 exists)

Finally,

```
Final Array = Prefix Sum of Difference Array
```

---

# Algorithm

```
Create Difference Array

↓

Process Every Update

↓

Take Prefix Sum

↓

Get Final Array
```

---

# Java Template

## Create Difference Array

```java
int[] diff = new int[n];
```

---

## Apply Update

```java
diff[left] += value;

if(right + 1 < n){

    diff[right + 1] -= value;

}
```

---

## Build Final Array

```java
int[] arr = new int[n];

arr[0] = diff[0];

for(int i = 1; i < n; i++){

    arr[i] = arr[i - 1] + diff[i];

}
```

---

# Complexity

For Q Updates

Applying Updates

```
O(Q)
```

Building Final Array

```
O(n)
```

Total

```
O(n + Q)
```

Space

```
O(n)
```

---

# Brute Force

For every update

```
Traverse

L → R

Update Every Element
```

Complexity

```
O(Q × n)
```

---

# Difference Array

Store only

- Start
- End

Then compute Prefix Sum.

Complexity

```
O(n + Q)
```

---

# Example

Initial Array

```
0 0 0 0 0
```

Operation

```
+2

Range

1...3
```

Difference Array

```
0 2 0 0 -2
```

Prefix Sum

```
0 2 2 2 0
```

---

# Advantages

- Extremely fast for many range updates.
- Easy after understanding Prefix Sum.
- Used in competitive programming.

---

# Limitations

Not suitable when

- Updates and queries are mixed online.
- Values change dynamically after every query.

For those problems,

use

- Fenwick Tree
- Segment Tree

---

# Common Problems

Easy

- Range Addition
- Corporate Flight Bookings

Medium

- Car Pooling
- Brightness Updates

Advanced

- Range Update Queries
- Offline Interval Problems

---

# Common Mistakes

❌ Forgetting

```java
if(right + 1 < n)
```

before subtracting.

❌ Forgetting to compute Prefix Sum.

❌ Confusing Difference Array with Prefix Sum.

❌ Updating every element manually.

---

# Interview Tips

Remember

```
Prefix Sum

↓

Fast Queries

Difference Array

↓

Fast Updates
```

This relationship is frequently asked.

---

# Pattern Recognition

Question contains

```
Many Range Updates

↓

Same Array

↓

Apply All Operations
```

↓

Think

```
Difference Array
```

---

# Pattern Connections

Difference Array

↓

Prefix Sum

↓

Fenwick Tree

↓

Segment Tree

---

# Revision Checklist

- [ ] Definition
- [ ] Formula
- [ ] Java Template
- [ ] Complexity
- [ ] Brute Force vs Difference Array
- [ ] Common Problems
- [ ] Common Mistakes
- [ ] Interview Tips

---

# Difference Array Cheat Sheet

| Operation | Complexity |
|-----------|------------|
| One Range Update | O(1) |
| Q Updates | O(Q) |
| Build Final Array | O(n) |
| Total | O(n + Q) |
| Space | O(n) |

---

# Prefix Sum vs Difference Array

| Feature | Prefix Sum | Difference Array |
|----------|------------|------------------|
| Main Purpose | Fast Range Query | Fast Range Update |
| Build Time | O(n) | O(n) |
| Query | O(1) | O(n) (after reconstruction) |
| Update | O(n) | O(1) |
| Extra Space | O(n) | O(n) |

---

⭐ One suggestion for your handbook

I noticed you're writing this as a long-term reference, not just class notes. I recommend adding this section at the end of every pattern from now on:

# Real Interview Problems

## LeetCode

- 303. Range Sum Query - Immutable
- 370. Range Addition
- 1094. Car Pooling
- 1109. Corporate Flight Bookings

## GeeksforGeeks

- Difference Array
- Range Update Queries

## Difficulty

⭐ Easy
⭐⭐ Medium
⭐⭐⭐ Hard

# Next Pattern

Binary Search Pattern ⭐⭐⭐⭐⭐

---

# 8. Binary Search Pattern ⭐⭐⭐⭐⭐

## Definition

Binary Search is a searching technique that repeatedly divides the search space into two halves.

Instead of checking every element one by one, Binary Search eliminates half of the remaining elements in each step.

It is one of the fastest searching algorithms.

---

# Why Learn Binary Search?

Binary Search helps to

- Search efficiently in sorted data.
- Reduce search time significantly.
- Solve optimization problems using Binary Search on Answer.
- Form the basis of many advanced algorithms.

---

# Prerequisites

Binary Search requires

- Sorted Array (Ascending or Descending)
- Random Access (Array)

---

# When to Use

Use Binary Search when the problem involves

- Sorted Array
- Sorted List
- Search
- Find Position
- Lower Bound
- Upper Bound
- First Occurrence
- Last Occurrence
- Minimum/Maximum Possible Answer

---

# Recognition Keywords

If the question contains

- Sorted
- Search
- Position
- Index
- Find Element
- First
- Last
- Smallest Possible
- Largest Possible

Think

```
Binary Search
```

---

# Idea

Instead of checking

```
1

↓

2

↓

3

↓

4

↓

5
```

Check

```
Middle

↓

Discard Half

↓

Repeat
```

---

# Algorithm

```
Start

↓

Find Middle

↓

Target Found?

↓

Yes → Return

↓

No

↓

Target Smaller?

↓

Search Left Half

↓

Else

↓

Search Right Half

↓

Repeat
```

---

# Java Template

```java
int left = 0;
int right = arr.length - 1;

while(left <= right){

    int mid = left + (right - left) / 2;

    if(arr[mid] == target)
        return mid;

    else if(arr[mid] < target)
        left = mid + 1;

    else
        right = mid - 1;
}

return -1;
```

---

# Complexity

Time

```
O(log n)
```

Space

```
O(1)
```

Recursive Version

Space

```
O(log n)
```

(Call Stack)

---

# Why

```
mid = left + (right-left)/2
```

Instead of

```
(left + right)/2
```

To avoid integer overflow.

---

# Variations

- Standard Binary Search
- First Occurrence
- Last Occurrence
- Lower Bound
- Upper Bound
- Search Insert Position
- Rotated Sorted Array
- Peak Element
- Binary Search on Answer

---

# Binary Search on Answer

Sometimes the array is not searched directly.

Instead,

Search

```
Possible Answer
```

Examples

- Minimum Eating Speed
- Allocate Books
- Aggressive Cows
- Capacity To Ship Packages
- Painter's Partition

---

# Brute Force

```
Linear Search

↓

O(n)
```

Binary Search

```
O(log n)
```

---

# Advantages

- Extremely Fast
- Efficient
- Logarithmic Complexity
- Used in Interviews

---

# Limitations

Requires

- Sorted Data
- Random Access

Not suitable for Linked Lists.

---

# Common Problems

Easy

- Binary Search
- Search Insert Position
- Square Root
- Guess Number

Medium

- First and Last Position
- Rotated Sorted Array
- Find Peak Element
- Koko Eating Bananas

Hard

- Median of Two Sorted Arrays
- Split Array Largest Sum

---

# Common Mistakes

❌ Forgetting

```java
left <= right
```

❌ Wrong middle calculation.

❌ Infinite loops.

❌ Updating wrong pointer.

❌ Forgetting sorted condition.

---

# Interview Tips

Always ask

```
Is the data sorted?
```

If Yes

Think

```
Binary Search
```

---

# Pattern Recognition

Question contains

```
Sorted

↓

Search

↓

Minimum Possible

↓

Maximum Possible
```

↓

Think

```
Binary Search
```

---

# Pattern Connections

Binary Search

↓

Sorting

↓

Divide & Conquer

↓

Binary Search on Answer

↓

Trees

---

# Revision Checklist

- [ ] Definition
- [ ] Prerequisites
- [ ] Algorithm
- [ ] Java Template
- [ ] Complexity
- [ ] Variations
- [ ] Binary Search on Answer
- [ ] Common Problems
- [ ] Common Mistakes

---

# Binary Search Cheat Sheet

| Feature | Value |
|----------|-------|
| Data | Sorted |
| Time | O(log n) |
| Space | O(1) |
| Search Space | Halved Every Step |
| Main Idea | Divide and Eliminate |

---

# Linear Search vs Binary Search

| Feature | Linear Search | Binary Search |
|----------|---------------|---------------|
| Data | Any | Sorted |
| Time | O(n) | O(log n) |
| Space | O(1) | O(1) |
| Best Use | Small/Unsorted | Large/Sorted |

---

# Real Interview Problems

## LeetCode

- 704. Binary Search
- 35. Search Insert Position
- 34. Find First and Last Position
- 33. Search in Rotated Sorted Array
- 875. Koko Eating Bananas
- 1011. Capacity To Ship Packages Within D Days

## GeeksforGeeks

- Binary Search
- First Occurrence
- Last Occurrence
- Peak Element

## Difficulty

⭐ Easy
⭐⭐ Medium
⭐⭐⭐ Hard

---

# Next Pattern

Hashing Pattern ⭐⭐⭐⭐⭐


---

# 9. Hashing Pattern ⭐⭐⭐⭐⭐

## Definition

Hashing is a technique that stores data using a **hash function**, allowing very fast insertion, searching, deletion, and lookup.

Instead of searching every element one by one, hashing directly accesses the required data using a key.

Java provides hashing through:

- HashMap
- HashSet
- Hashtable (Legacy)

---

# Why Learn Hashing?

Hashing helps to

- Reduce Time Complexity.
- Store frequencies.
- Detect duplicates.
- Perform constant-time lookup.
- Solve many interview problems efficiently.

Many brute-force O(n²) solutions become O(n).

---

# Prerequisites

Understand

- Arrays
- Keys & Values
- Basic Searching

---

# When to Use

Use Hashing when the problem involves

- Frequency Count
- Duplicate Elements
- Unique Elements
- Fast Search
- Pair Sum
- Visited Elements
- Mapping
- Counting

---

# Recognition Keywords

If the question contains

- Frequency
- Count
- Duplicate
- Distinct
- Unique
- Lookup
- Exists
- Pair
- Target
- Mapping

Think

```
HashMap / HashSet
```

---

# Main Data Structures

## HashMap

Stores

```
Key

↓

Value
```

Example

```
StudentID

↓

Marks
```

```
Character

↓

Frequency
```

```
Element

↓

Count
```

---

## HashSet

Stores

```
Only Unique Elements
```

Duplicates are ignored automatically.

---

# Java Templates

## HashMap

```java
HashMap<Integer,Integer> map = new HashMap<>();
```

Insert

```java
map.put(key, value);
```

Get

```java
map.get(key);
```

Contains

```java
map.containsKey(key);
```

Remove

```java
map.remove(key);
```

Size

```java
map.size();
```

---

## HashSet

```java
HashSet<Integer> set = new HashSet<>();
```

Insert

```java
set.add(value);
```

Contains

```java
set.contains(value);
```

Remove

```java
set.remove(value);
```

---

# Frequency Count Template

```java
HashMap<Integer,Integer> freq = new HashMap<>();

for(int num : arr){

    freq.put(num, freq.getOrDefault(num,0)+1);

}
```

---

# Duplicate Detection

```java
HashSet<Integer> set = new HashSet<>();

for(int num : arr){

    if(set.contains(num))
        return true;

    set.add(num);
}
```

---

# Complexity

Average Case

| Operation | Complexity |
|------------|------------|
| Insert | O(1) |
| Search | O(1) |
| Delete | O(1) |

Worst Case

```
O(n)
```

(Rare due to collisions.)

---

# Brute Force

Find Duplicate

```
Compare every pair

↓

O(n²)
```

HashSet

```
Insert

↓

Already Present?

↓

Duplicate Found

↓

O(n)
```

---

# Example 1

Two Sum

Brute Force

```
O(n²)
```

HashMap

Store visited numbers.

Check

```
Target - Current
```

Time

```
O(n)
```

---

# Example 2

Contains Duplicate

Use

```
HashSet
```

---

# Example 3

Frequency Count

Input

```
1 2 2 3 3 3
```

HashMap

```
1 → 1

2 → 2

3 → 3
```

---

# Example 4

First Non-Repeating Character

```
Frequency Count

↓

Traverse Again

↓

Frequency == 1
```

---

# Advantages

- Very Fast Lookup
- Easy Frequency Counting
- Reduces Nested Loops
- Widely Used

---

# Limitations

Requires Extra Memory.

HashMap does not maintain sorted order.

---

# Common Problems

Easy

- Two Sum
- Contains Duplicate
- Valid Anagram

Medium

- Group Anagrams
- Top K Frequent Elements
- Longest Consecutive Sequence
- Subarray Sum Equals K

Hard

- Minimum Window Substring
- Randomized Set

---

# Common Mistakes

❌ Forgetting to update frequency.

❌ Using HashSet when frequency is required.

❌ Assuming HashMap is sorted.

❌ Ignoring duplicate keys.

---

# Interview Tips

Whenever you see

```
Frequency

↓

Duplicate

↓

Lookup

↓

Exists

↓

Visited
```

Think

```
HashMap

or

HashSet
```

---

# Pattern Recognition

Question contains

```
Count

↓

Frequency

↓

Duplicate

↓

Pair

↓

Lookup
```

↓

Use

```
Hashing
```

---

# Pattern Connections

Hashing

↓

Prefix Sum

↓

Sliding Window

↓

Graphs

↓

Dynamic Programming

---

# Revision Checklist

- [ ] Definition
- [ ] HashMap
- [ ] HashSet
- [ ] Frequency Count
- [ ] Java Template
- [ ] Complexity
- [ ] Common Problems
- [ ] Common Mistakes
- [ ] Interview Tips

---

# HashMap vs HashSet

| Feature | HashMap | HashSet |
|----------|---------|----------|
| Stores | Key → Value | Value Only |
| Duplicate Keys | ❌ | ❌ |
| Duplicate Values | ✅ | ❌ |
| Lookup | O(1) | O(1) |
| Frequency Count | ✅ | ❌ |
| Unique Elements | ❌ | ✅ |

---

# Real Interview Problems

## LeetCode

- 1. Two Sum
- 217. Contains Duplicate
- 242. Valid Anagram
- 49. Group Anagrams
- 347. Top K Frequent Elements
- 128. Longest Consecutive Sequence
- 560. Subarray Sum Equals K

## GeeksforGeeks

- Frequency Count
- Count Distinct Elements
- First Repeating Element
- Pair With Given Sum

## Difficulty

⭐ Easy
⭐⭐ Medium
⭐⭐⭐ Hard

---

# Next Pattern

Sorting Pattern ⭐⭐⭐⭐⭐


---

# 10. Sorting Pattern ⭐⭐⭐⭐⭐

## Definition

Sorting is the process of arranging data in a specific order.

The most common orders are

- Ascending Order
- Descending Order

Sorting is one of the most fundamental techniques in Computer Science because many algorithms become simpler and faster after the data is sorted.

---

# Why Learn Sorting?

Sorting helps to

- Search efficiently.
- Group similar elements.
- Remove duplicates easily.
- Use Binary Search.
- Solve interval and greedy problems.
- Improve algorithm performance.

Many interview problems start with

```
Sort First
```

---

# Prerequisites

- Arrays
- Comparison Operators
- Loops
- Swapping

---

# When to Use

Use Sorting when the problem involves

- Arrange Elements
- Order Data
- Merge Intervals
- Closest Pair
- Remove Duplicates
- Binary Search
- Greedy Algorithms

---

# Recognition Keywords

If the problem contains

- Sorted
- Ascending
- Descending
- Closest
- Smallest
- Largest
- Merge
- Order
- Rearrange

Think

```
Sorting
```

---

# General Process

```
Input Array

↓

Compare Elements

↓

Swap / Shift

↓

Repeat

↓

Sorted Array
```

---

# Classification of Sorting Algorithms

## Comparison Based

- Bubble Sort
- Selection Sort
- Insertion Sort
- Merge Sort
- Quick Sort
- Heap Sort

---

## Non-Comparison Based

- Counting Sort
- Radix Sort
- Bucket Sort

---

# Stable vs Unstable Sorting

## Stable Sorting

Maintains the relative order of equal elements.

Examples

- Bubble Sort
- Insertion Sort
- Merge Sort
- Counting Sort

---

## Unstable Sorting

Relative order may change.

Examples

- Selection Sort
- Quick Sort
- Heap Sort

---

# In-place vs Out-place Sorting

## In-place

Uses constant extra memory.

Examples

- Bubble
- Selection
- Insertion
- Heap
- Quick

---

## Out-place

Requires additional memory.

Examples

- Merge Sort
- Counting Sort

---

# Complexity Overview

| Algorithm | Best | Average | Worst | Stable | In-place |
|-----------|------|----------|--------|---------|----------|
| Bubble | O(n) | O(n²) | O(n²) | ✅ | ✅ |
| Selection | O(n²) | O(n²) | O(n²) | ❌ | ✅ |
| Insertion | O(n) | O(n²) | O(n²) | ✅ | ✅ |
| Merge | O(n log n) | O(n log n) | O(n log n) | ✅ | ❌ |
| Quick | O(n log n) | O(n log n) | O(n²) | ❌ | ✅ |
| Heap | O(n log n) | O(n log n) | O(n log n) | ❌ | ✅ |
| Counting | O(n+k) | O(n+k) | O(n+k) | ✅ | ❌ |
| Radix | O(d(n+k)) | O(d(n+k)) | O(d(n+k)) | ✅ | ❌ |

---

# Java Sorting

## Primitive Arrays

```java
Arrays.sort(arr);
```

Ascending Order

---

## Descending Order

```java
Integer[] arr = {5,2,7,1};

Arrays.sort(arr, Collections.reverseOrder());
```

---

## Objects

```java
Arrays.sort(students, comparator);
```

---

## Collections

```java
Collections.sort(list);
```

---

# How to Choose a Sorting Algorithm

| Situation | Best Choice |
|-----------|-------------|
| Small Array | Insertion Sort |
| Nearly Sorted | Insertion Sort |
| General Purpose | Quick Sort |
| Guaranteed Performance | Merge Sort |
| Memory Limited | Heap Sort |
| Small Integer Range | Counting Sort |

---

# Brute Force

Many problems

```
Nested Loops

↓

O(n²)
```

After Sorting

```
Binary Search

↓

Two Pointers

↓

Greedy
```

Often become faster.

---

# Advantages

- Simplifies many problems.
- Enables Binary Search.
- Improves searching.
- Makes duplicate handling easier.

---

# Limitations

Sorting itself takes time.

Not every problem should be solved by sorting.

---

# Common Problems

Easy

- Sort Colors
- Merge Sorted Arrays

Medium

- Sort an Array
- Largest Number
- Relative Sort Array

Hard

- Merge Intervals
- Meeting Rooms
- Russian Doll Envelopes

---

# Common Mistakes

❌ Choosing O(n²) sorting for large inputs.

❌ Forgetting sorting changes original order.

❌ Using unstable sorting when stability matters.

❌ Assuming Arrays.sort() always uses Quick Sort.

---

# Interview Tips

Always ask

```
Can sorting simplify the problem?
```

If yes,

sort first and then apply

- Binary Search
- Two Pointers
- Greedy
- Sliding Window

---

# Pattern Recognition

Question contains

```
Order

↓

Arrange

↓

Merge

↓

Closest

↓

Intervals
```

↓

Think

```
Sorting
```

---

# Pattern Connections

Sorting

↓

Binary Search

↓

Two Pointers

↓

Greedy

↓

Merge Intervals

↓

Heap

---

# Revision Checklist

- [ ] Definition
- [ ] Classification
- [ ] Stable vs Unstable
- [ ] In-place vs Out-place
- [ ] Complexity Table
- [ ] Java Sorting
- [ ] Common Problems
- [ ] Common Mistakes
- [ ] Interview Tips

---

# Java Methods Cheat Sheet

| Method | Purpose |
|---------|---------|
| Arrays.sort() | Sort Array |
| Collections.sort() | Sort List |
| Arrays.parallelSort() | Parallel Sorting |
| Collections.reverseOrder() | Descending Order |

---

# Real Interview Problems

## LeetCode

- 75. Sort Colors
- 88. Merge Sorted Array
- 912. Sort an Array
- 56. Merge Intervals
- 179. Largest Number

## GeeksforGeeks

- Bubble Sort
- Selection Sort
- Insertion Sort
- Merge Sort
- Quick Sort
- Heap Sort

## Difficulty

⭐ Easy
⭐⭐ Medium
⭐⭐⭐ Hard

---

# Next Pattern

Greedy Pattern ⭐⭐⭐⭐⭐



