# 🧭 Two Pointers - DSA Practice

This folder contains problems solved using the **Two Pointer technique**, one of the most useful patterns for array and string problems.

---

## 🧠 Concept

The **Two Pointer technique** reduces time complexity by avoiding nested loops and using smart traversal.

### Common Variants:

* **Opposite Direction Pointers** → Start from both ends (used in sorted arrays)
* **Same Direction Pointers** → Slow & Fast pointer approach
* **Sliding Window** → Expand and shrink window dynamically

---

## 📌 Problems Implemented

* Two Sum II → `TwoSumII.java`
* Remove Element → `RemoveElement.java`
* Remove Duplicates (Basic) → `RemoveDuplicatesBasic.java`
* Pair with Difference → `PairWithDiff.java`
* Count Pairs Less Than Target → `CountPairs.java`
* Merge Two Sorted Arrays → `MergeSortedArrys.java`
* Sort Colors (Dutch National Flag) → `SortColorsSelection_75.java`

---

## 🧠 Problem Approaches

* **Two Sum II**
  Opposite pointers. Move left/right based on sum comparison.

* **Remove Element**
  Overwrite unwanted elements using a pointer.

* **Remove Duplicates**
  Slow & Fast pointer to maintain unique elements.

* **Pair with Difference**
  Sort + two pointers OR use hashing.

* **Count Pairs Less Than Target**
  Sort + two pointers to count efficiently.

* **Merge Two Sorted Arrays**
  Fill from the back using two pointers.

* **Sort Colors**
  Dutch National Flag Algorithm (3 pointers: left, mid, right).

---

## ⚙️ Key Techniques Used

* Left & Right pointer movement
* Slow & Fast pointer strategy
* Expanding and shrinking window
* Efficient pair counting
* In-place array modification
* Partitioning (Dutch National Flag)

---

## ⏱️ Complexity Insights

Most problems here achieve:

* **Time Complexity:** O(n) or O(n log n) (if sorting is used)
* **Space Complexity:** O(1) (in-place operations)

---

## 🎯 Goal

* Build strong intuition for pointer-based traversal
* Recognize patterns quickly during problem solving
* Prepare for advanced problems like:

  * 3Sum / 4Sum
  * Sliding Window problems
  * Partition-based problems

---

## 🚀 Notes

Many array problems boil down to a few core patterns:

* Two Pointers
* Sliding Window
* Hashing
* Sorting

Mastering these patterns makes most problems feel repetitive (in a good way).
