# 📊 Prefix Sum - DSA Practice

## 🔑 When to use Prefix Sum
- Need repeated range sum queries  
- Comparing left vs right sums  
- Avoid recomputing cumulative values  

This folder contains problems solved using the **Prefix Sum technique**, a fundamental approach for handling cumulative computations efficiently.

---

## 🧠 Concept

Prefix Sum stores cumulative sums so that repeated calculations over ranges can be avoided.

### Key Idea:

`prefix[i] = sum of elements from index 0 → i`

---

## 📌 Problems Implemented

### 🔹 Running Sum

[🔗 Running Sum of 1D Array](https://leetcode.com/problems/running-sum-of-1d-array/)

* File: `RunningSum1480.java`
* Approach: Build cumulative sum in-place
* Pattern: Prefix Sum

---

### 🔹 Find Pivot Index

[🔗 Find Pivot Index](https://leetcode.com/problems/find-pivot-index/)

* File: `FindPivotIndex.java`
* Approach: Compare left sum and right sum using total
* Pattern: Prefix Sum

---

### 🔹 Maximum Score After Splitting a String

[🔗 Max Score Split String](https://leetcode.com/problems/maximum-score-after-splitting-a-string/)

* File: `MaxScore.java`
* Approach: Track zeros (left) and ones (right) dynamically
* Pattern: Prefix Count

---

### 🔹 Minimum Value to Get Positive Step-by-Step Sum

[🔗 Minimum Start Value](https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/)

* File: `MinValToGetPositive.java`
* Approach: Track minimum prefix sum
* Pattern: Prefix Sum

---

### 🔹 Range Sum Query - Immutable

[🔗 Range Sum Query](https://leetcode.com/problems/range-sum-query-immutable/)

* File: `NumArray.java`
* Approach: Precompute prefix array for O(1) queries
* Pattern: Prefix Sum

---

## ⚙️ Key Techniques Used

* Cumulative sum building
* Using total sum to avoid recomputation
* Prefix array precomputation
* Range sum optimization
* Tracking minimum prefix values

---

## 🎯 Goal

* Build strong intuition for prefix-based problems
* Recognize patterns quickly
* Improve problem-solving efficiency

---
